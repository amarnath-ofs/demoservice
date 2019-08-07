package com.sample.demoservice.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import com.sample.demoservice.model.Employee;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class EmployeeController {
    @GetMapping("/employees")
    public List<Employee> getEmployees()
    {
        List<Employee> employeesList = new ArrayList<Employee>();
        employeesList.add(new Employee(1,"christina","lang","christina@gmail.com"));
        employeesList.add(new Employee(2,"sam","jose","samjose@gmail.com"));
        employeesList.add(new Employee(3,"peter","park","peterpark@gmail.com"));
        employeesList.add(new Employee(4,"tony","stark","tonystark@gmail.com"));
        employeesList.add(new Employee(5,"jack","sparrow","jacksparrow@gmail.com"));
        employeesList.add(new Employee(6,"amy","jackson","amyjackson@gmail.com"));
        return employeesList;
    }
}
