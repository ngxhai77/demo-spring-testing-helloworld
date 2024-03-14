package com.example.denotestinghelloworld.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", defaultValue = "World") String name){
        return String.format("Hello %s",name);
    }
}
