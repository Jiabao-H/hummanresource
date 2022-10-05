package com.example.employeemanagement.Model;

public class Department {
    public int deptId;
    public String name;

    public String location;

    public Department(){
    }
    public Department(int deptId,String name,String location){
        this.deptId = deptId;
        this.name = name;
        this.location = location;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
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
}
