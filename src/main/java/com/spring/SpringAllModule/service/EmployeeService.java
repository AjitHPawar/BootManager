package com.spring.SpringAllModule.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.SpringAllModule.Dto.EmployeeDto;
import com.spring.SpringAllModule.model.Employee;

@Service
public interface EmployeeService {

	Employee add(EmployeeDto employee);

	Employee update(EmployeeDto employee);

	Employee delete(Integer id);

	List<Employee> getAll();

	Employee getById(Integer id);

}
