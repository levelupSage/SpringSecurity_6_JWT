package com.LevelUp_360.SpringSecurityEx.service;

import com.LevelUp_360.SpringSecurityEx.model.Users;
import com.LevelUp_360.SpringSecurityEx.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private JWTService jwtService;

    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(12);

    public Users register(Users users){
        users.setPassword(bCryptPasswordEncoder.encode(users.getPassword()));
        return userRepo.save(users);
    }

    public String verify(Users users) {
        Authentication authentication =
        manager.authenticate(new UsernamePasswordAuthenticationToken(users.getUsername(), users.getPassword()));
        if(authentication.isAuthenticated()){
            return jwtService.generateToken(users.getUsername());
        }

        return "fail";
    }
}
