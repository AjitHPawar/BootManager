package com.spring.SpringAllModule.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.SpringAllModule.Dto.EmployeeDto;
import com.spring.SpringAllModule.dao.EmployeeRepository;
import com.spring.SpringAllModule.model.Department;
import com.spring.SpringAllModule.model.Employee;
import com.spring.SpringAllModule.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repo;

	@Override
	public Employee add(EmployeeDto employee) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		BeanUtils.copyProperties(employee, emp);
		Employee Savedemp = repo.save(emp);

		return Optional.ofNullable(Savedemp).orElse(null);
	}

	@Override
	public Employee update(EmployeeDto employee) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		BeanUtils.copyProperties(employee, emp);
		Employee Savedemp = repo.save(emp);

		return Optional.ofNullable(Savedemp).orElse(null);
	}

	@Override
	public Employee delete(Integer id) {
		// TODO Auto-generated method stub
		Optional<Employee> emp = repo.findById(id);
		repo.deleteById(id);
		return emp.orElse(null);
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub

		return Optional.ofNullable(repo.findAll()).orElse(null);
	}

	@Override
	public Employee getById(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

}
