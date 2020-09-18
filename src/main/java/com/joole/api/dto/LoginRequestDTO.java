package com.joole.api.dto;

public class LoginRequestDTO {
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    private String username;
    private String password;
}
