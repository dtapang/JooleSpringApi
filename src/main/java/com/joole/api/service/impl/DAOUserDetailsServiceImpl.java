package com.joole.api.service.impl;

import com.joole.api.entity.User;
import com.joole.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Arrays;

@Service
public class DAOUserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findUserByUsernameEmail(username);
        ArrayList<SimpleGrantedAuthority> authorities = new ArrayList<>(Arrays.asList(new SimpleGrantedAuthority(user.getRole())));
        return new org.springframework.security.core.userdetails.User(user.getUsernameEmail(), user.getPassword(), authorities);
    }

    public User getCurrentUser(Principal principal) {
        UsernamePasswordAuthenticationToken authenticationToken = (UsernamePasswordAuthenticationToken) principal;
        return userRepository.findUserByUsernameEmail(authenticationToken.getName());
    }


}
