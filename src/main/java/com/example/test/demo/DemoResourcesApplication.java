package com.example.test.demo;

import com.example.test.demo.auth.AuthenticateService;
import com.example.test.demo.auth.RegisterRequest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.example.test.demo.user.Role.ADMIN;
import static com.example.test.demo.user.Role.MANAGER;

@SpringBootApplication
public class DemoResourcesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoResourcesApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(
			AuthenticateService service
	) {
		return args -> {
			var admin = RegisterRequest.builder()
					.firstName("Admin")
					.lastName("Admin")
					.email("admin@mail.com")
					.password("password")
					.role(ADMIN)
					.build();
			System.out.println("Admin token: " + service.register(admin).getToken());

			var manager = RegisterRequest.builder()
					.firstName("Admin")
					.lastName("Admin")
					.email("manager@mail.com")
					.password("password")
					.role(MANAGER)
					.build();
			System.out.println("Manager token: " + service.register(manager).getToken());

		};
	}

}
