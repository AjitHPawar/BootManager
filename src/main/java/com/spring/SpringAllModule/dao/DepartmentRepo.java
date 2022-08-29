package com.spring.SpringAllModule.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.SpringAllModule.model.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {

	public void deleteById(Integer id);
	
}
