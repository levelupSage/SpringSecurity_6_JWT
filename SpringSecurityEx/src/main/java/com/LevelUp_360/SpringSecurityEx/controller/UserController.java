package com.LevelUp_360.SpringSecurityEx.controller;

import com.LevelUp_360.SpringSecurityEx.model.Users;
import com.LevelUp_360.SpringSecurityEx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Users registerUser(@RequestBody Users users){
        return userService.register(users);
    }

    @PostMapping("/login")
    public String login(@RequestBody Users users){
        //System.out.println(users);
        // return "Success";
        return userService.verify(users);
    }
}
