package com.example.employee_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class employeeController {
    @GetMapping("/")
     public String Homepage(){
        return "Welcome to employee page";
    }



}
