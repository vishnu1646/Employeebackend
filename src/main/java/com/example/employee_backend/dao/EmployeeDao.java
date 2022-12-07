package com.example.employee_backend.dao;

import com.example.employee_backend.controller.model.employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<employee,Integer> {
    @Query(value = "SELECT `id`, `salary`, `cmpnyname`, `designation`, `empcode`, `name`, `password`, `phonenum`, `username` FROM `employee` WHERE `empcode` =:empcode",nativeQuery = true)
    List<employee>searchemployee(@Param("empcode") Integer empcode);
}
