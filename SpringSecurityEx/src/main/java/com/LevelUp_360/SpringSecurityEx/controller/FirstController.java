package com.LevelUp_360.SpringSecurityEx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/")
    public String great(){
        return "WelCome to this Page";
    }
}
