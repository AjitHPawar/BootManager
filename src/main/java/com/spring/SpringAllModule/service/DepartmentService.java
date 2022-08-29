package com.spring.SpringAllModule.service;

import java.util.List;
import java.util.Optional;

import com.spring.SpringAllModule.Dto.DepartmentDto;
import com.spring.SpringAllModule.model.Department;

public interface DepartmentService {

	public Department add(DepartmentDto obj);
	
	public Optional<Department> update(DepartmentDto object);
	
	public void deleteById(Integer pk);
	
	public void deleteAll(Integer[] pk);
	
	public Optional<List<Department>> getAll();
	
	public Optional<Department> getById(Integer pk);
	
}
