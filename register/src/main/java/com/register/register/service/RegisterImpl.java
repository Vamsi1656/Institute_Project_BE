package com.register.register.service;

import com.register.register.dto.RegisterDto;
import com.register.register.entity.Register;
import com.register.register.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class RegisterImpl implements RegisterService{

    @Autowired
    private RegisterRepository registerRepository;

    public RegisterDto saveRegister(RegisterDto registerDto){
        Register register=new Register(
                registerDto.getId(),
                registerDto.getFirst_name(),
                registerDto.getLast_name(),
                registerDto.getEmail(),
                registerDto.getPassword(),
                registerDto.getCourse()
        );
        Register saveRegister=registerRepository.save(register);
        RegisterDto saveregisterDto=new RegisterDto(
                saveRegister.getId(),
                saveRegister.getFirst_name(),
                saveRegister.getLast_name(),
                saveRegister.getEmail(),
                saveRegister.getPassword(),
                saveRegister.getCourse()
        );
        return saveregisterDto;
    }

    @Override
    public RegisterDto getByemail(String email) {

        Register register=registerRepository.findByemail(email);

        RegisterDto registerDto=new RegisterDto(
                register.getId(),
                register.getFirst_name(),
                register.getLast_name(),
                register.getEmail(),
                register.getPassword(),
                register.getCourse()
        );
        return registerDto;
    }

    @Override
    public UserDetails loadUserByEmail(String email) {
        Register register=registerRepository.findByemail(email);

        RegisterDto saveRegisterDto=new RegisterDto(
                register.getId(),
                register.getFirst_name(),
                register.getLast_name(),
                register.getEmail(),
                register.getPassword(),
                register.getCourse()
        );
        return(UserDetails) saveRegisterDto;
    }

}
