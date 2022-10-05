package com.example.employeemanagement.Controller;

import com.example.employeemanagement.Model.Department;
import com.example.employeemanagement.Model.Employee;
import com.example.employeemanagement.Service.DepartmentService;
import com.example.employeemanagement.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// CRUD Methods

@RestController
@RequestMapping(value = "/department")
public class DepartmentController {
    private DepartmentService service;

    @GetMapping(value = "/get/{id}")
    public Department getDepartmentById(@PathVariable int id) {
        return service.getDepartmentById(id);
    }
    @GetMapping(value="/all")
    public List<Department> getDepartments(){
        return service.getAllDepartments();
    }
    @PutMapping(value = "/update/{id}")
    public void updateDepartment(@PathVariable int id, @RequestBody Department temp){
        service.updateDepartment(id, temp);
    }
    @PostMapping("/new")
    public void updateDepartment(@RequestBody Department temp){
        service.newDepartment(temp);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteDepartmentById(@PathVariable int id){
        service.deleteDepartmentById(id);
    }

    public DepartmentService getService() {
        return service;
    }

    @Autowired
    public void setService(DepartmentService service) {
        this.service = service;
    }
}
