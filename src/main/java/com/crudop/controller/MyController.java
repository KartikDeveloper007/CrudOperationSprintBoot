package com.crudop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crudop.model.Department;
import com.crudop.repo.DepartmentRepo;
import com.crudop.service.DepartmentService;

@RestController
public class MyController {

	@Autowired
	private DepartmentService departmentService;

	
	@PostMapping("/save")
	public Department save(@RequestBody Department department) {
		return this.departmentService.save(department);

	}

	// Read operation
	@GetMapping("/read")
	public List<Department> fetchDepartmentList() {
		return this.departmentService.fetchDepartmentList();
	}

	@PutMapping("/update/{id}")
	public Department updateDepartment(@RequestBody Department department, @PathVariable("id") Long departmentId) {
		return departmentService.updateDepartment(department, departmentId);
	}

	// Delete operation
	@DeleteMapping("/delete/{departmentId}")
	public void deleteDepartmentById(@PathVariable("departmentId") Long departmentId) {
			departmentService.deleteDepartmentById(departmentId);
	}
}
