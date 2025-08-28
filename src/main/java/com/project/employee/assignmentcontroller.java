package com.project.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.employee.model.assignmentlistmodel;
import com.project.employee.model.assignmentmodel;
import com.project.employee.model.employeemodel;
import com.project.employee.model.projectmodel;
import com.project.employee.repository.assignRepository;
import com.project.employee.repository.empRepository;
import com.project.employee.repository.proRepository;

@RestController
@CrossOrigin(origins = "*")
public class assignmentcontroller {
	
	@Autowired
	private assignRepository assignrepo;
	
	@Autowired
	private empRepository emprepository;

	@Autowired
	private proRepository prorepository;

	
	@PostMapping("/assignment_create")
	public String create(@RequestBody assignmentmodel assMaster) {
		assignrepo.save(assMaster);
		return "success";
	}
	
	
	@GetMapping("/assignment_list")
	public List<assignmentlistmodel> list(){
		ArrayList<assignmentlistmodel> al = new ArrayList<assignmentlistmodel>();
		List<assignmentmodel> all = assignrepo.findAll();
		System.out.println("All = "+ all.size());
		for (assignmentmodel adata : all) {
			System.out.println(adata.getEmid());
			Optional<employeemodel> emp = emprepository.findById(adata.getEmid());
			Optional<projectmodel> prj = prorepository.findById(adata.getPrid());
			String name="";
			String projectname="";
			if(!emp.isEmpty())
			{
				employeemodel empData = emp.get();	
				name=empData.getName();
				System.out.println("name");
				System.out.println(name);
			}
			if(!prj.isEmpty())
			{
				projectmodel prData = prj.get();
				projectname=prData.getProjectname();
				System.out.println("pname");
				System.out.println(projectname);
			}
			assignmentlistmodel a  = new assignmentlistmodel(adata.getAssid(), name, projectname);
			al.add(a);
		}
		return al;
		
	}
	
	@PostMapping("/assignment_delete")
	public String deleteAssignment(@RequestBody assignmentmodel assMaster ) {
		
		assignrepo.deleteById(assMaster.getAssid());
		
		return"success";
	}
	
	

}
