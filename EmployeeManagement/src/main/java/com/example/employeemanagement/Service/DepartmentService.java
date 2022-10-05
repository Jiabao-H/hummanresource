package com.example.employeemanagement.Service;

import com.example.employeemanagement.DAO.DepartmentRepository;
import com.example.employeemanagement.Model.Department;
import com.example.employeemanagement.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository repo;

    public Department getDepartmentById(int id) {
        return repo.getDepartmentById(id);
    }
    public List<Department> getAllDepartments(){
        return repo.getAllDepartments();
    }
    public void updateDepartment(Department temp) {
        repo.updateDepartment(temp);
    }
    public void updateDepartment(int id, Department temp) {
        repo.updateDepartment(id,temp);
    }
    public void newDepartment(Department temp) {
        repo.newDepartment(temp);
    }
    public void deleteDepartmentById(int id) {
        repo.DeleteDepartmentById(id);
    }
    public void deleteAllDepartment(){
        repo.DeleteAllDepartment();
    }
}
