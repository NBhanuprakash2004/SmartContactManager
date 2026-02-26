package com.example.SmartContactManager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("This is home page");
        model.addAttribute("title", "Home - Smart Contact Manager");
        return "home";
    }
    
}
