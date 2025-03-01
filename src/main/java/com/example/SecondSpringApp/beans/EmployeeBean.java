package com.example.SecondSpringApp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private String name = "Piyush tiwari";
    private int id = 2115000708;

    @Autowired
    private DepartmentBean department;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDepartmentName() {
        return department.getDeptName();
}
}