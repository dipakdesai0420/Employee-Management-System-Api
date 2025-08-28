package com.project.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.employee.model.employeemodel;

public interface empRepository extends JpaRepository<employeemodel, Integer>{
	
	List<employeemodel> findByDepartment(String d);

}
