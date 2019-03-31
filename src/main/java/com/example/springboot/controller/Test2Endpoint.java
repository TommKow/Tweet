package com.example.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test2Endpoint {

    @GetMapping("/test2")
    public  String test2() {
        return "test2";
    }
}
