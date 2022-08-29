package com.spring.SpringAllModule.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.SpringAllModule.Dto.EmployeeDto;
import com.spring.SpringAllModule.model.Employee;
import com.spring.SpringAllModule.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping("/add")
	public ResponseEntity<Employee> add(@RequestBody EmployeeDto employee) {
		
		ResponseEntity<Employee> response = new ResponseEntity<Employee>(service.add(employee), HttpStatus.OK);
		
		return response;
	}

	@PutMapping("/update")
	public ResponseEntity<Employee> update(@RequestBody EmployeeDto employee) {
		ResponseEntity<Employee> response = new ResponseEntity<Employee>(service.update(employee), HttpStatus.OK);
		return response;
	}

	@DeleteMapping("/delete")
	public ResponseEntity<Employee> delete(Integer id) {
		ResponseEntity<Employee> response = new ResponseEntity<Employee>(service.delete(id), HttpStatus.OK);
		return response;
	}

	@GetMapping("/getall")
	public ResponseEntity<List<Employee>> getAll() {
		ResponseEntity<List<Employee>> response = new ResponseEntity<List<Employee>>(service.getAll(), HttpStatus.OK);
		return response;
	}

	@GetMapping("/getbyid/{id}")
	public ResponseEntity<Employee> getById(@PathVariable Integer id) {
		ResponseEntity<Employee> response = new ResponseEntity<Employee>(service.getById(id), HttpStatus.OK);
		return response;
	}
}
