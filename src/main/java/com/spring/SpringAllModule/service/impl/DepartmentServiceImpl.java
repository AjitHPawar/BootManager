package com.spring.SpringAllModule.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.SpringAllModule.Dto.DepartmentDto;
import com.spring.SpringAllModule.dao.DepartmentRepo;
import com.spring.SpringAllModule.model.Department;
import com.spring.SpringAllModule.service.DepartmentService;

import exceptions.RecordNotFoundException;
import exceptions.RecordNotSavedEsception;
import exceptions.RecordNotUpdatedException;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepo repo;

	@Override
	public Department add(DepartmentDto obj) {
		DepartmentDto dto = (DepartmentDto) obj;
		Department department = new Department();
		BeanUtils.copyProperties(dto, department);
		Department dept = repo.save(department);

		return Optional.of(dept).orElseThrow(()->new RecordNotSavedEsception());
	}

	@Override
	public Optional<Department> update(DepartmentDto object) {
		Department department = new Department();
		BeanUtils.copyProperties(object, department);

		Department dept = repo.save(department);

		return Optional.ofNullable(Optional.ofNullable(dept).orElseThrow(() -> new RecordNotSavedEsception()));
	}

	@Override
	public void deleteById(Integer pk) {
		// TODO Auto-generated method stub
		repo.deleteById(pk);
	}

	@Override
	public void deleteAll(Integer[] pk) {
		// TODO Auto-generated method stub
		Stream.of(pk).forEach(p -> repo.deleteById(p));
	}

	@Override
	public Optional<List<Department>> getAll() {
		// TODO Auto-generated method stub
		return Optional.ofNullable(Optional.ofNullable(repo.findAll()).orElseThrow(()->new RecordNotFoundException()));
	}

	@Override
	public Optional<Department> getById(Integer pk) {
		// TODO Auto-generated method stub
		return Optional.ofNullable(repo.findById(pk).orElseThrow(()->new RecordNotFoundException()));
		
	}

}
