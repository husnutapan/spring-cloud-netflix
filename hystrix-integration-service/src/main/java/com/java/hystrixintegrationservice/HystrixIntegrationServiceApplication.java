package com.java.hystrixintegrationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
@EnableCircuitBreaker
public class HystrixIntegrationServiceApplication {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    List<Employee> employeeList() {
        List<Employee> employeeList = new ArrayList<Employee>() {{
            add(new Employee("Test", 1000));
            add(new Employee("Test 2", 2000));
            add(new Employee("Test 3", 3000));
        }};
        return employeeList;
    }

    public static void main(String[] args) {
        SpringApplication.run(HystrixIntegrationServiceApplication.class, args);
    }

}
