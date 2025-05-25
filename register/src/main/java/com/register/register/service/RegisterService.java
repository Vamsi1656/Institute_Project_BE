package com.register.register.service;

import com.register.register.dto.RegisterDto;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface RegisterService extends UserDetailsService {

    RegisterDto saveRegister(RegisterDto registerDto);
    RegisterDto getByemail(String email);

    @Override
    default UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

    UserDetails loadUserByEmail(String email);
}
