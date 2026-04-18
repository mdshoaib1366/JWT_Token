package com.example.Auth_api_JWT.services;

import com.example.Auth_api_JWT.entities.Employee;
import com.example.Auth_api_JWT.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> allUsers() {
        List<Employee> users = new ArrayList<>();

        employeeRepository.findAll().forEach(users::add);

        return users;
    }
}
