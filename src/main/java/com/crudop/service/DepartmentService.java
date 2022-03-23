package com.crudop.service;

import java.util.List;

import com.crudop.model.Department;

public interface DepartmentService {

	public Department save(Department department);

	public List<Department> fetchDepartmentList();

	public Department updateDepartment(Department department, Long departmentId);

	// Delete operation
	public void deleteDepartmentById(Long departmentId);
}
