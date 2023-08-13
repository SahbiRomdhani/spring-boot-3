package com.example.test.demo.auth;

import com.example.test.demo.user.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    @NotBlank(message = "FirstName is Required")
    @NotNull
    private String firstName;

    @NotBlank(message = "FirstName is Required")
    @NotNull
    private String lastName;

    @Email
    @NotNull
    private  String email;

    @NotBlank
    @NotNull
    private String password;

    private Role role;

}
