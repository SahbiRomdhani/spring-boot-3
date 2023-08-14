package com.example.test.demo.config;

import com.example.test.demo.auth.AuthenticateService;
import com.example.test.demo.auth.RegisterRequest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import static com.example.test.demo.user.Role.ADMIN;
import static com.example.test.demo.user.Role.MANAGER;

@Component
public class MyCommandLineRunner {
    AuthenticateService service;

    public MyCommandLineRunner(AuthenticateService service) {
        this.service = service;
    }
    @Bean
    public CommandLineRunner UsersRegister(
    ) {
        return args -> {
            var admin = RegisterRequest.builder()
                    .firstName("Admin")
                    .lastName("Admin")
                    .email("admin@mail.com")
                    .password("password")
                    .role(ADMIN)
                    .build();
            System.out.println("Admin token: " + this.service.register(admin).getToken());

            var manager = RegisterRequest.builder()
                    .firstName("manager")
                    .lastName("manager")
                    .email("manager@mail.com")
                    .password("password")
                    .role(MANAGER)
                    .build();
            System.out.println("Manager token: " + this.service.register(manager).getToken());

        };
    }



}
