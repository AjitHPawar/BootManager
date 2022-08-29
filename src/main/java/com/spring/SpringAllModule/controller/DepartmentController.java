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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.SpringAllModule.Dto.DepartmentDto;
import com.spring.SpringAllModule.model.Department;
import com.spring.SpringAllModule.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService service;

	@PostMapping("/dept/add")
	public ResponseEntity<Department> add(@RequestBody DepartmentDto dto) {
		System.out.println(dto);
		return ResponseEntity.ok().body(service.add(dto));
	}

	@PutMapping("/dept/update")
	public ResponseEntity<Department> update(@RequestBody DepartmentDto dto) {
		// TODO Auto-generated method stub
		return ResponseEntity.ok().body(service.update(dto).get());
	}

	@DeleteMapping("/dept/deleteByIds")
	public ResponseEntity<String> deleteByIds(@RequestBody DepartmentDto dto) {
		// TODO Auto-generated method stub
		Integer[] ids = dto.getIds();
		service.deleteAll(dto.getIds());
		return new ResponseEntity<String>("All Record Deleted By Given Ids", HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/dept/deleteById")
	public ResponseEntity<String> deleteById(@RequestParam(name = "id") Integer id) {
		// TODO Auto-generated method stub
		service.deleteById(id);
		return new ResponseEntity<String>("Record Deleted By Id :"+id, HttpStatus.ACCEPTED);
	}

	@GetMapping("/dept/getAll")
	public ResponseEntity<List<Department>> getAll() {
		// TODO Auto-generated method stub
		Optional<List<Department>> deptList = service.getAll();
		return new ResponseEntity<List<Department>>(deptList.get(), HttpStatus.OK);
	}

	@GetMapping("/dept/getByid/{id}")
	public ResponseEntity<Department> getById(@PathVariable("id") Integer pk) {
		// TODO Auto-generated method stub
		Optional<Department> dept = service.getById(pk);
		return new ResponseEntity(dept.get(), HttpStatus.OK);
	}
}
