package com.example.SecondSpringApp.beans;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {
    private String deptName = "IT";

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
}
}