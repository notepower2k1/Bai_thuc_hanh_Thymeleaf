package com.springboot.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.demo.model.Employee;
import com.springboot.demo.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	  @Autowired
	    private EmployeeRepository employeeRepository;

	    @Override
	    public List <Employee> getAllEmployees() {
	        return employeeRepository.findAll();
	    }
}

