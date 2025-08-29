package com.my_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home/{param}")
    public String getMethodName(@PathVariable String param) {
        return "Hello, " + param;
    }
}
