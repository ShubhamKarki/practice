package com.company;

import com.company.Department;

public class Student {
    private String name;
    private Department department;

    public Student(String name, Department department) {
        this.name = name;
        this.department = department;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
