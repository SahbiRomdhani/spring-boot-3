package com.example.test.demo.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Sahbi",
                        email = "sahbiromdhani666@gmail.com",
                        url = "sahbi-romdhani-portfolio.netlify.app"
                        ),
                description = "Demo Project for testing Spring boot 3",
                title = "Demo Project",
                version = "1.0",
                license = @License(
                        name = "License Name",
                        url = "https://your-url.com"
                        ),
                termsOfService = "terms of service"

        ),
        servers = {
                @Server(
                        description = "Local ENV",
                        url = "http://localhost:8080"
                ),
                @Server(
                        description = "PROD ENV",
                        url = "sahbi-romdhani-portfolio.netlify.app"
                )
        },
        security = {
                @SecurityRequirement(
                        name = "bearerAuth"
                )
        }
        )
@SecurityScheme(
        name ="bearerAuth",
        description = "JWT auth Description",
        scheme = "bearer",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        in = SecuritySchemeIn.HEADER
)

public class OpenApiConfig {
}
