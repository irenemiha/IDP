package com.mobylab.springbackend.service.dto;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Profile("auth")
@Component
public class LoginDto {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public LoginDto setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public LoginDto setPassword(String password) {
        this.password = password;
        return this;
    }
}
