package com.java.hystrixintegrationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    List<Employee> employeeList;

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/getEmployee/{company}")
    public List<Employee> getEmployees(@PathVariable String company) {
        System.out.println("Fetching Employees...");
        employeeList.addAll(employeeService.getEmployees(company));
        return employeeList;
    }


}
