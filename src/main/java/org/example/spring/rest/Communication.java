package org.example.spring.rest;

import org.example.spring.rest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class Communication {

    @Autowired
    private RestTemplate restTemplate;

    public List<Employee> showAllEmployees() {
        return null;
    }

    public Employee getEmployee(int id) {
        return  null;
    }

    public void saveEmployee(Employee employee) {

    }

    public void deleteEmployee(int id) {

    }
}
