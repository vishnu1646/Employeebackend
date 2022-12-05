package com.example.employee_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class employeeController {
    @GetMapping("/")
     public String Homepage(){
        return "Welcome to employee page";
    }

     @GetMapping("/add")
    public String Adding(){
        return "Adding an employee";
     }
     @GetMapping("/search")
    public String Searching(){
        return  "Searching an employee";
     }

     @GetMapping("/edit")
    private String edit(){
        return "Editing an employee";
     }

     @GetMapping("/viewall")
    private String view(){
        return "Viewing Employees";
     }

}
