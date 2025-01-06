package com.example.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/message")
    public String greet(){
        return "CICD using Jenkins for test";
    }
    @GetMapping("/messages")
    public String greets(){
        return "CICD using Jenkins for tests";
    }

}
