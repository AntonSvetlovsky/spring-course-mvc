package org.example.spring.rest;

import org.example.spring.rest.configuration.MyConfig;
import org.example.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);

//        Employee empById = communication.getEmployee(1);
//        System.out.println(empById);
//
//        Employee emp = new Employee("Amy", "McDonald", "HR", 1950);
//        communication.saveEmployee(emp);

//        Employee emp = new Employee("Amy", "McDonald", "HR", 2100);
//        emp.setId(9);
//        communication.saveEmployee(emp);

//        communication.deleteEmployee(5);
    }
}
