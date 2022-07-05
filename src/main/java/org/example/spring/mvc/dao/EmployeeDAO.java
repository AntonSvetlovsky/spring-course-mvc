package org.example.spring.mvc.dao;

import org.example.spring.mvc.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);
}
