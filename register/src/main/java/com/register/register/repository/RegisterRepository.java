package com.register.register.repository;

import com.register.register.entity.Register;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepository extends JpaRepository<Register,Integer> {

    Register findByemail(String email);
}
