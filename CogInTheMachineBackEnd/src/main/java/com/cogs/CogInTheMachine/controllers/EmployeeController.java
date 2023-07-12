package com.cogs.CogInTheMachine.controllers;

import com.cogs.CogInTheMachine.models.staff.Employee;
import com.cogs.CogInTheMachine.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;


    @GetMapping(value= "/employees")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return new ResponseEntity<>(employeeRepository.findAll(), HttpStatus.OK);
    }

}
