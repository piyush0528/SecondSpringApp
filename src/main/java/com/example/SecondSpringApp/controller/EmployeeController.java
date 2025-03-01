package com.example.SecondSpringApp.controller;

import com.example.SecondSpringApp.beans.EmployeeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeBean employee;

    @GetMapping("/info")
    public String getEmployeeInfo() {
        return "Employee ID: " + employee.getId() +
                ", Name: " + employee.getName() +
                ", Department: " + employee.getDepartmentName();
}
}