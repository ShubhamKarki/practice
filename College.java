package com.company;
import java.util.*;

public class College {
    private String name;
    private String location;
    private long phoneNumber;
    private  static Map<String, Set<Department>> collegeNameToDepartments = new HashMap<>();

    public College(String name, String location, long phoneNumber) {
        this.name = name;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static Map<String, Set<Department>> getCollegeNameToDepartments() {
        return collegeNameToDepartments;
    }

    public static void setCollegeNameToDepartments(Map<String, Set<Department>> departments) {

        College.collegeNameToDepartments = departments;
    }

    public static void setCollegeNameToDepartments(Department department) {
        String name = department.getCollege().name;
        Set<Department> l = collegeNameToDepartments.get(name);
        if (l == null)
            collegeNameToDepartments.put(name, l = new HashSet<>());
        l.add(department);
    }

    public static void showCollegeNameToDepartments(String name) {
        if(getCollegeNameToDepartments().containsKey(name)) {
            Iterator<Department> itr = getCollegeNameToDepartments().get(name).iterator();

        System.out.print(name + "      ");
        while (itr.hasNext()) {
            System.out.println(itr.next().getName() + "   " );
        }
        }
    }

    public static void showCollegeNameToDepartments() {
        for (Map.Entry<String, Set<Department>> e : collegeNameToDepartments.entrySet()) {
            String key = e.getKey();
            Iterator<Department> itr = getCollegeNameToDepartments().get(key).iterator();

            System.out.print(key + "      ");
            while (itr.hasNext()) {
                System.out.println(itr.next().getName() + "   ");

            }


        }

    }
}
