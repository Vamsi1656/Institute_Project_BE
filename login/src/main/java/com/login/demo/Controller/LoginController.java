package com.login.demo.Controller;

import com.login.demo.Dto.LoginDto;
import com.login.demo.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/login")
public class LoginController {

        @Autowired
        private LoginService loginService;

        @PostMapping("/save")
        public ResponseEntity<LoginDto> savelogin(@RequestBody LoginDto loginDto) {
            LoginDto savedlogin = loginService.savelogin(loginDto);
            return new ResponseEntity<>(savedlogin, HttpStatus.CREATED);
        }
    @GetMapping("/{email}")
    public ResponseEntity<LoginDto> getlogin(@PathVariable String email) {
        LoginDto loginDto = loginService.getByemail(email);

        return new ResponseEntity<>(loginDto, HttpStatus.OK);
    }
}
