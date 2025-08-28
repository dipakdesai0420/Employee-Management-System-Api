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
import com.project.employee.model.projectmodel;
import com.project.employee.repository.proRepository;

@RestController
@CrossOrigin(origins="*")
public class projectcontroller {
	
	@Autowired
	private proRepository prorepository;
	
	@PostMapping("/project_create")
	public String project_create(@RequestBody projectmodel pm) {
		prorepository.save(pm);
		 return "success";
	}
	
	@GetMapping("/project_list")
	public List<projectmodel> list(){
		return prorepository.findAll();
}

	@GetMapping("project/edit/{id}")
	public ResponseEntity<projectmodel> getprojectById(@PathVariable int id){
		
		return prorepository.findById(id).map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	} 
	
	@PostMapping("/edit_project")
	public ResponseEntity<String> update(@RequestBody projectmodel pm){
		
		return prorepository.findById(pm.getPrid())
				.map(pmaster ->
				{
					pmaster.setProjectname(pm.getProjectname());
					pmaster.setClientname(pm.getClientname());
					pmaster.setStartdate(pm.getStartdate());
					pmaster.setEnddate(pm.getEnddate());
					pmaster.setBudget(pm.getBudget());
					prorepository.save(pm);
					return ResponseEntity.ok("updated");
				})
				.orElse(ResponseEntity.notFound().build());
				
		
	}
	
	@PostMapping("project/delete")
	public String deleteemployee(@RequestBody projectmodel empMaster ) {
		
		prorepository.deleteById(empMaster.getPrid());
		
		return"success";
	}
	

}
