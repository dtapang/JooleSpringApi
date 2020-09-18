package com.joole.api.controller;

import com.joole.api.dto.LoginRequestDTO;
import com.joole.api.dto.SignupRequestDTO;
import com.joole.api.entity.User;
import com.joole.api.repository.UserRepository;
import com.joole.api.service.impl.DAOUserDetailsServiceImpl;
import com.joole.api.service.UserService;
import com.joole.api.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Random;


@RestController
@RequestMapping("/auth")
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    DAOUserDetailsServiceImpl daoUserDetailsServiceImpl;
    @Autowired
    JwtUtil jwtUtil;
    @Autowired
    PasswordEncoder pwdEncoder;

    @Autowired
    UserRepository userRepository;

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody SignupRequestDTO signupRequest){
        User user = new User();
        if(userRepository.existsUserByUsernameEmail(signupRequest.getUsername())) {
            return ResponseEntity.ok("User already exists");
        }
        user.setUsernameEmail(signupRequest.getUsername());
        user.setPassword(pwdEncoder.encode(signupRequest.getPassword()));
        //user.setFirstname(signupRequest.getFirstname());
        //user.setLastname(signupRequest.getLastname());
        //user.setJoindate(new Timestamp(System.currentTimeMillis()));

        user.setRole(signupRequest.getRole());

        user.setId((new Random()).nextInt());
        userRepository.save(user);
        return ResponseEntity.ok("User successfully created");
    }

    @GetMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequestDTO loginRequest){
        UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword());
        try {
            Authentication authentication = authenticationManager.authenticate(authToken);
            if(!authentication.isAuthenticated())
                return ResponseEntity.notFound().build();
            SecurityContextHolder.getContext().setAuthentication(authentication);
            org.springframework.security.core.userdetails.User userDetails = (org.springframework.security.core.userdetails.User)authentication.getPrincipal();
            String jwt = jwtUtil.generateToken(userDetails);
            return ResponseEntity.ok(new String[]{userDetails.getUsername(), jwt, "USER"});
        }catch(Exception exception){
            exception.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Authentication failed!");
        }



    }

}
