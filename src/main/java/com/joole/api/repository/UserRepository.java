package com.joole.api.repository;

import com.joole.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByUsernameEmail(String username);

    boolean existsUserByUsernameEmail(String username);
}
