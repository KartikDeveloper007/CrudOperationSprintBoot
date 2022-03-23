package com.crudop.serviceImpl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudop.model.Department;
import com.crudop.repo.DepartmentRepo;
import com.crudop.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentRepo departmentRepo;

	@Override
	public Department save(Department department) {
		// TODO Auto-generated method stub
		return departmentRepo.save(department);
	}

	@Override
	public List<Department> fetchDepartmentList() {

		return (List<Department>) departmentRepo.findAll();
	}

	@Override
	public Department updateDepartment(Department department, Long departmentId) {
		Department depDB = departmentRepo.findById(departmentId).get();

		if (Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
			depDB.setDepartmentName(department.getDepartmentName());
		}

		if (Objects.nonNull(department.getDepartmentAddress())
				&& !"".equalsIgnoreCase(department.getDepartmentAddress())) {
			depDB.setDepartmentAddress(department.getDepartmentAddress());
		}

		if (Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())) {
			depDB.setDepartmentCode(department.getDepartmentCode());
		}

		return departmentRepo.save(depDB);
	}

	   @Override
	    public void deleteDepartmentById(Long departmentId)
	    {
	        departmentRepo.deleteById(departmentId);
	    }
	}

