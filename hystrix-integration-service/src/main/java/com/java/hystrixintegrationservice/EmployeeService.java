package com.java.hystrixintegrationservice;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getEmployees_Fallback")
    public List<Employee> getEmployees(String company) {
        List<Employee> response = restTemplate
                .exchange("http://localhost:1111/dummyService/{company}"
                        , HttpMethod.GET
                        , null
                        , new ParameterizedTypeReference<List<Employee>>() {
                        }, company).getBody();
        return response;
    }

    private List<Employee> getEmployees_Fallback(String company) {
        System.out.println("Calling service down,fallback method active.");
        Employee employee = new Employee("Fallback Employee", 4000);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        return employeeList;
    }
}
