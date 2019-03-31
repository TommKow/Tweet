package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {
//    @GetMapping("/test")
//    public String test() {
//        return "Hello World";
//    }
    @GetMapping("/test")
    public String welcome(Model model) {
        return "test123";
    }
}
