package com.example.employeemanagement.Service;

import com.example.employeemanagement.DAO.EmployeeRepository;
import com.example.employeemanagement.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository repo;

    public Employee getEmployeeById(int id) {
        return repo.getEmployeeById(id);
    }
    public List<Employee> getAllEmployees(){
        return repo.getAllEmployees();
    }
    public void updateEmployee(Employee temp) {
        repo.updateEmployee(temp);
    }
    public void updateEmployee(int id, Employee temp) {
        repo.updateEmployee(id,temp);
    }
    public void newEmployee(Employee temp) {
        repo.newEmployee(temp);
    }
    public void deleteEmployeeById(int id) {
        repo.deleteEmployeeById(id);
    }
    public void deleteAllEmployee(){
        repo.deleteAllEmployees();
    }
}
