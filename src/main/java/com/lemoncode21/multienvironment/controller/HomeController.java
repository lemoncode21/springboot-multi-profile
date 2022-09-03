package com.lemoncode21.multienvironment.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value(value = "${spring.profiles.active}")
    private String profile;

    @GetMapping("/")
    public String Homepage(){
        return "Welcome home your in " + profile + " environment";
    }

}
