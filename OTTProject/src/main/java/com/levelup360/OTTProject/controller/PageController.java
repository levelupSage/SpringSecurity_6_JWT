package com.levelup360.OTTProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/")
    public String home(){

        return "home";
    }

    @RequestMapping("/dashboard")
    public String dashboard(){
        return "dashboard";
    }
}
