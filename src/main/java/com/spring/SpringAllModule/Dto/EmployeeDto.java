package com.spring.SpringAllModule.Dto;

import com.spring.SpringAllModule.model.Department;

public class EmployeeDto {

	private int id;

	private String name;

	private String address;

	private String pincode;

	private Integer departmentId;

	private String department_Name;

	private Department department;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartment_Name() {
		return department_Name;
	}

	public void setDepartment_Name(String department_Name) {
		this.department_Name = department_Name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
