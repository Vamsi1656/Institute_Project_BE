package com.register.register.controller;

import com.register.register.dto.RegisterDto;
import com.register.register.entity.Register;
import com.register.register.service.RegisterImpl;
import com.register.register.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private RegisterImpl registerImpl;

    @PostMapping("/saveregister")

    public ResponseEntity<RegisterDto>saveRegister(@RequestBody RegisterDto registerDto){
        RegisterDto savedRegister=registerImpl.saveRegister(registerDto);
        return new ResponseEntity<>(savedRegister, HttpStatus.CREATED);
    }
    @GetMapping("/{email}")

    public ResponseEntity<RegisterDto>saveRegister(@PathVariable String email){
        RegisterDto savedRegister=registerImpl.getByemail(email);
        return new ResponseEntity<>(savedRegister,HttpStatus.OK);
    }
}
