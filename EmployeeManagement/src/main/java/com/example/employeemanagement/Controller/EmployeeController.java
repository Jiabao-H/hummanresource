package com.example.employeemanagement.Controller;

import com.example.employeemanagement.Model.Employee;
import com.example.employeemanagement.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

// CRUD Methods

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
    private EmployeeService service;

    @GetMapping(value = "/get/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }
    @GetMapping(value="/all")
    public List<Employee> getEmployees(){
        return service.getAllEmployees();
    }
    @PutMapping(value = "/update/{id}")
    public void updateEmployee(@PathVariable int id, @RequestBody Employee temp){
        service.updateEmployee(id, temp);
    }
    @PostMapping("/new")
    public void updateEmployee(@RequestBody Employee temp){
        service.newEmployee(temp);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteEmployeeById(@PathVariable int id){
        service.deleteEmployeeById(id);
    }

    public EmployeeService getService() {
        return service;
    }

    @Autowired
    public void setService(EmployeeService service) {
        this.service = service;
    }
}
