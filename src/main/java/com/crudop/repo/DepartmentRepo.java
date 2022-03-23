package com.crudop.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.crudop.model.Department;
@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {
//@Query(value="SELECT * FROM Department ORDER BY departmentName",nativeQuery =true )
//public List<Department> getDepartment(); 
}
