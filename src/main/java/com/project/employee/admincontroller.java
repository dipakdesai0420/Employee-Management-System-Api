package com.project.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.employee.model.adminloginmodel;
import com.project.employee.model.adminmodel;
import com.project.employee.model.adminmodel;
import com.project.employee.model.adminloginmodel;
import com.project.employee.repository.admRepository;
import com.project.employee.repository.admRepository;

@RestController
@CrossOrigin(origins = "*")
public class admincontroller {

		@Autowired
		private admRepository adRepo;
		
		@PostMapping("/admin_registration")
		public adminmodel signup(@RequestBody adminmodel adm) {
			return adRepo.save(adm);
			
		}
		
		@PostMapping("/admin_login")
		public String login(@RequestBody adminmodel adm) {
			adminmodel byEmailAndPassword = adRepo.findByEmailAndPassword(adm.getEmail(),adm.getPassword());
			if(byEmailAndPassword != null) {
				return "success";
			}
			else {
				return "fail";
			}
		}
}