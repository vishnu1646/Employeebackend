package com.example.employee_backend.dao;

import com.example.employee_backend.controller.model.employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<employee,Integer> {
}
