package com.project.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.employee.model.employeemodel;
import com.project.employee.repository.empRepository;

@RestController
@CrossOrigin(origins = "*")
public class employeecontroller {

	@Autowired
	private empRepository emprepository;
	
	@PostMapping("/add_employee")
	public String create(@RequestBody employeemodel emp) {
		emprepository.save(emp);
		return "success";
	}
		
		@GetMapping("/list")
		public List<employeemodel> list(){
			return emprepository.findAll();
	}
		
		@GetMapping("edit/{id}")
		public ResponseEntity<employeemodel> getEmpById(@PathVariable int id){
			
			return emprepository.findById(id).map(ResponseEntity::ok)
					.orElse(ResponseEntity.notFound().build());
		} 
		
		@PostMapping("/edit_employee")
		public ResponseEntity<String> update(@RequestBody employeemodel empmaster){
			
			return emprepository.findById(empmaster.getEmid())
					.map(emp ->
					{
						emp.setName(empmaster.getName());
						emp.setEmail(empmaster.getEmail());
						emp.setDepartment(empmaster.getDepartment());
						emp.setSalary(empmaster.getSalary());
						emp.setDateOfjoin(empmaster.getDateofjoin());
						emprepository.save(emp);
						return ResponseEntity.ok("updated");
					})
					.orElse(ResponseEntity.notFound().build());
					
			
		}
		
		@PostMapping("/delete")
		public String deleteemployee(@RequestBody employeemodel empMaster ) {
			
			emprepository.deleteById(empMaster.getEmid());
			
			return"success";
		}

}
