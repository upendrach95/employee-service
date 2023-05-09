package com.employee.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class Controller {
    @GetMapping
    public String Hello(){
        return "Hello World";
    }

}
