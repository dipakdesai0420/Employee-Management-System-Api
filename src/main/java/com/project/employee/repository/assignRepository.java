package com.project.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.project.employee.model.assignmentmodel;

public interface assignRepository extends JpaRepository<assignmentmodel, Integer>{
	
	List<assignmentmodel> findByPrid(int id);

}
