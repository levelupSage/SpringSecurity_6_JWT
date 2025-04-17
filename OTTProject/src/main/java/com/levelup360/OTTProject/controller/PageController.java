package com.levelup360.OTTProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class PageController {

    @RequestMapping("/")
    public String home() {

        return "home";
    }

    @RequestMapping("/dashboard")
    public String dashboard(Principal principal, Model model) {
        model.addAttribute("user", principal.getName());
        return "dashboard";
    }
}
