package com.example.SpringOauth2Demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/")
    public String greet(){
        return "Welcome to Oauth application.";
    }

}
