package com.example.employee_backend.controller.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class employee {

    @Id
    @GeneratedValue()
    private int id;
    private int empcode;
    private String name;
    private String designation;
    private int salary;
    private String cmpnyname;
    private int phonenum;
    private String username;
    private String password;

    public employee() {
    }

    public employee(int id, int empcode, String name, String designation, int salary, String cmpnyname, int phonenum, String username, String password) {
        this.id = id;
        this.empcode = empcode;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.cmpnyname = cmpnyname;
        this.phonenum = phonenum;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpcode() {
        return empcode;
    }

    public void setEmpcode(int empcode) {
        this.empcode = empcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        salary = salary;
    }

    public String getCmpnyname() {
        return cmpnyname;
    }

    public void setCmpnyname(String cmpnyname) {
        this.cmpnyname = cmpnyname;
    }

    public int getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(int phonenum) {
        this.phonenum = phonenum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
