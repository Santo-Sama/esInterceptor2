package com.example.esInterceptor2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/root")
public class BasicController {

    @GetMapping("/hello")
    public String welcome() {
        return "Welcome!";
    }
}
