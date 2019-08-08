package com.company;

import java.util.ArrayList;

import java.util.List;

public class Department {

    private String name;
    private College college;
    private List<Student> students ;

     Department(String name, College college) {
        this.name = name;
        this.college = college;
        this.students = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setName(String name) {
        this.name = name;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }
    public void addStudents(Student student) {
        this.students.add(student);
    }
    public void showStudents() {
         for(Student student : students)
        System.out.println( " Department " + name + "   Student name " + student.getName());

    }
}
