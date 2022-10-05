package com.example.employeemanagement.DAO;

import com.example.employeemanagement.Model.Department;
import com.example.employeemanagement.Model.Employee;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class DepartmentRepository {
    static List<Department> departments;

    static {
        departments = new ArrayList<>();
        departments.add(new Department(0, "President", "Washington D.C."));
        departments.add(new Department(1,"Vice President","Air Force One"));
        departments.add(new Department(2,"Teacher","San Diego"));
        departments.add(new Department(3,"Doctor","Bay Area"));
        departments.add(new Department(4,"Lawyer","NYC"));
    }

    public List<Department> getAllDepartments(){
        return departments;
    }
    public Department getDepartmentById(int id){
        return departments.stream().filter(e -> id == e.getDeptId()).findFirst().orElse(null);
    }
    public void updateDepartment(int id, Department temp) {
        Department target = this.getDepartmentById(id);
        target.setName(temp.getName());
    }
    public void updateDepartment(Department temp) {
        Department target = departments.stream().filter(e -> temp.getDeptId() == e.getDeptId()).findFirst().orElse(null);
        if(target != null){
            target.setName(temp.getName());
        }
    }
    public void newDepartment(Department temp) {
        int maxId = departments.stream().mapToInt(e -> e.getDeptId()).max().getAsInt();
        temp.setDeptId(maxId + 1);
        departments.add(temp);
    }
    public void DeleteDepartmentById(int id) {
        Iterator<Department> it = departments.iterator();
        while(it.hasNext()){
            Department temp = it.next();
            if(id == temp.getDeptId()){
                it.remove();
            }
        }
    }
    public void DeleteAllDepartment() {
        departments.clear();
    }

}
