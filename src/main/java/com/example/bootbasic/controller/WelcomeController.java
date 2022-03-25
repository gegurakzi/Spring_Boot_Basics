package com.example.bootbasic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/index")
    public String Welcome(Model model) {
        model.addAttribute("username", "Administrator");
        return "welcome";
    }
}
