package com.login.demo.Service;

import com.login.demo.Dto.LoginDto;
import com.login.demo.Entity.LoginEntity;
import com.login.demo.Repository.Repo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@AllArgsConstructor
public class ImplService implements LoginService {

    @Autowired
    private Repo loginRepositary;



    @Override
    public LoginDto savelogin(LoginDto loginDto) {
        LoginEntity login = new LoginEntity(
                loginDto.getId(),
                loginDto.getEmail(),
                loginDto.getPassword()
        );

        LoginEntity savedloginEntity = loginRepositary.save(login);

        LoginDto savedloginDto = new LoginDto(
                savedloginEntity.getId(),
                savedloginEntity.getEmail(),
                savedloginEntity.getPassword()
        );
        return savedloginDto;
    }

    @Override
    public LoginDto getByemail(String email) {
        LoginEntity getlogin = loginRepositary.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("data not found id:" + email));

        LoginDto loginDto = new LoginDto(
                getlogin.getId(),
                getlogin.getEmail(),
                getlogin.getPassword());
        return loginDto;


    }

}
