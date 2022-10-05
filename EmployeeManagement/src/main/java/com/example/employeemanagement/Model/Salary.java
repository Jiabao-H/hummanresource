package com.example.employeemanagement.Model;

public class Salary {
    public int id;
    public String name;
    public String job;
    public String date;
    public int managerId;
    public double salary;

    public Salary() {
    }
    public Salary(int id, String name,String job,String date, int managerId, double salary) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.date = date;
        this.managerId = managerId;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
