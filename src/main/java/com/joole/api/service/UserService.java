package com.joole.api.service;
import com.joole.api.entity.User;

public interface UserService {
    void createUser(User newUser);
    User getUser(String username);
}
