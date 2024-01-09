package com.sanketdd.springJWT.config;

import com.sanketdd.springJWT.model.Role;
import com.sanketdd.springJWT.model.User;
import com.sanketdd.springJWT.repo.UserRepository;
import com.sanketdd.springJWT.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@RequiredArgsConstructor
@Slf4j
public class SeedDataConfig implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserService userService;

    public SeedDataConfig(UserRepository userRepository, PasswordEncoder passwordEncoder, UserService userService) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {

        if (userRepository.count() == 0) {

            User admin = new User();

            admin.setFirstName("admin");
            admin.setLastName("admin");
            admin.setEmail("admin@admin.com");
            admin.setPassword(passwordEncoder.encode("password"));
            admin.setRole(Role.ROLE_ADMIN);

            userService.save(admin);
        }
    }

}