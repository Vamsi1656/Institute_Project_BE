package com.login.demo.Repository;

import com.login.demo.Entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Repo  extends JpaRepository<LoginEntity,Long> {
    Optional<LoginEntity> findByEmail(String email);
}
