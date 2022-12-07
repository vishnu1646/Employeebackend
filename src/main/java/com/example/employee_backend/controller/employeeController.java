package com.example.employee_backend.controller;

import com.example.employee_backend.controller.model.employee;
import com.example.employee_backend.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class employeeController {
    @Autowired
    private EmployeeDao da;
    @GetMapping("/")
    public String Homepage(){
        return "Welcome to Homepage";
    }

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
         da.save(e);
        return "Adding an employee";
     }
     @GetMapping("/viewall")
    public List <employee>viewall(){
        return (List<employee>) da.findAll();
     }

@CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes = "application/json",produces = "application/json")
    public List<employee> SearchEmp(@RequestBody employee e){
    String empcode =String.valueOf(e.getEmpcode());
    System.out.println(empcode);
    return (List<employee>)
            da.searchemployee(e.getEmpcode());
    }




}
