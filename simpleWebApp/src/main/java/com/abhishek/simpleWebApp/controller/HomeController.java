package com.abhishek.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        return "Welcome to Shadow";
    }

    @RequestMapping("/about")
    public String about() {
        return "This is the about page";
    }
}
