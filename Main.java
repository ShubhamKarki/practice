package com.company;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<College> colleges = new ArrayList<>();


      /*
          College college = new College("AIT");
        College college1 = new College("VIT");

        Department department = new Department("CSE", college);
         Department department1 = new Department("CSE", college1);
          College.setCollegeNameToDepartments(department);
          College.setCollegeNameToDepartments(department1);
        Student student = new Student("amit",department);
         department.addStudents(student);
         department.showStudents();

        */



        College.showCollegeNameToDepartments();
        String flag;
        do {
            System.out.println("Press 1. To Create College ");
            System.out.println("Press 2. To Create Department ");
            System.out.println("Press 3. To Create Student ");
            System.out.println("Press 4. To get Department By College ");


            int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Creating College : ");

                    System.out.println("Enter College Name : ");
                    String collegeName = sc.next();

                    System.out.println("Enter Location : ");
                    String location = sc.next();

                    System.out.println("Enter phone number : ");
                    long phNumber = sc.nextLong();
                    College college = new College(collegeName, location, phNumber);
                    boolean flag1 = true;

                    for (College value : colleges) {
                    if (value.getName().equals(collegeName) || value.getLocation().equals(location) || value.getPhoneNumber() == phNumber) {
                        System.out.println("College already exist");
                        flag1 = false;
                    }

                }
                    if (flag1) {
                        colleges.add(college);
                        System.out.println("College Successfully created :");
                    }
                    break;

                case 2:
                    if (colleges.size() == 0) {
                        System.out.println("There is no College. Please Create College First ");
                        break;
                    }
                    System.out.println("Creating Department : ");

                    System.out.println("Enter Department Name : ");
                    String deptName = sc.next();
                    for (int i = 0; i < colleges.size(); i++) {
                        System.out.println(i + 1 + "  College : " + colleges.get(i).getName());
                    }
                    System.out.println("Enter College  number : ");
                    int collegeNumber = sc.nextInt();
                    collegeNumber--;

                    Department department = new Department(deptName,colleges.get(collegeNumber));

                    College.setCollegeNameToDepartments(department);

                    System.out.println("Department Successfully created :");

                    break;
                case 3:
                    if (College.getCollegeNameToDepartments().size() == 0) {
                        System.out.println("There is no Department. Please Create Departments First ");
                        break;
                    }
                    System.out.println("Creating Student : ");

                    System.out.println("Enter Student Name : ");
                    String studentName = sc.next();

                    Set<String> strings = College.getCollegeNameToDepartments().keySet();


                    for (String string : strings) {
                        System.out.println(string + "   ");
                    }
                    System.out.println("Enter College   : ");
                               collegeName =sc.next();

                   College.showCollegeNameToDepartments(collegeName);

                    System.out.println("Enter Department   : ");
                    String departmentName = sc.next();
                    Iterator<Department> departmentIterator = College.getCollegeNameToDepartments().get(collegeName).iterator();

                    while (departmentIterator.hasNext()) {
                        department =departmentIterator.next();
                        if(department.getName().equals(departmentName)) {
                            Student student;
                            student = new Student(studentName,department);
                            departmentIterator.next().addStudents(student);
                            System.out.println("Student Successfully created :");
                            break;
                        }
                        else System.out.println("Department Doesn't exist");
                        break;

                    }
                      break;

                case 4:
                    System.out.println(" Department By Departments ");
                    College.showCollegeNameToDepartments();

                    break;


                default:
                    break;

            }

            System.out.println("Do you want to exist Y/N");

            flag = sc.next();

        } while (!flag.equals("Y"));


    }

    }


