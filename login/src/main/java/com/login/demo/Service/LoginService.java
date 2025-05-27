package com.login.demo.Service;

import com.login.demo.Dto.LoginDto;

public interface LoginService {
    LoginDto savelogin(LoginDto logindto);
    LoginDto getByemail(String email);

}
