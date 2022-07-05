package org.example.spring.mvc.service;

import org.example.spring.mvc.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);
}
