package com.project.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.employee.model.adminmodel;
import java.util.List;


public interface admRepository extends JpaRepository<adminmodel, Integer>{
	
	adminmodel findByEmailAndPassword(String email,String password);

}
