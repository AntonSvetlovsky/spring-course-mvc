package org.example.spring.mvc.entity.dao;

import org.example.spring.mvc.entity.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();
}