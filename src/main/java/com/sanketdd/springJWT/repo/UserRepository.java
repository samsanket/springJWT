package com.sanketdd.springJWT.repo;

import java.util.Optional;

import com.sanketdd.springJWT.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

  Optional<User> findByEmail(String email);
  
}