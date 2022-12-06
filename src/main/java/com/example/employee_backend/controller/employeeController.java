package com.example.employee_backend.controller;

import com.example.employee_backend.controller.model.employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class employeeController {

     @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String Adding(@RequestBody employee e){
         System.out.println(e.getName().toString());
         System.out.println(e.getEmpcode());
         System.out.println(e.getDesignation());
         System.out.println(e.getSalary());
         System.out.println(e.getCmpnyname());
         System.out.println(e.getPhonenum());
         System.out.println(e.getUsername());
         System.out.println(e.getPassword());
        return "Adding an employee";
     }




}
