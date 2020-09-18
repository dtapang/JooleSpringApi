package com.joole.api.service.impl;

import com.joole.api.entity.User;
import com.joole.api.repository.UserRepository;
import com.joole.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userDao;
    @Override
    public void createUser(User newUser) {
        userDao.save(newUser);
    }

    @Override
    public User getUser(String username) {
        return userDao.findUserByUsernameEmail(username);
    }
}
