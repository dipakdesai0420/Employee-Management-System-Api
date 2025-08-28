package com.project.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.employee.model.assignmentmodel;
import com.project.employee.model.departmentviseemployee;
import com.project.employee.model.departmentvisesalary;
import com.project.employee.model.employeemodel;
import com.project.employee.model.ongoingproject;
import com.project.employee.model.projectmodel;
import com.project.employee.repository.assignRepository;
import com.project.employee.repository.empRepository;
import com.project.employee.repository.proRepository;

@RestController
@CrossOrigin(origins = "*")
public class reportingcontroller {
	
	@Autowired
	private assignRepository assignrepo;
	
	@Autowired
	private empRepository emprepository;

	@Autowired
	private proRepository prorepository;

	
	@GetMapping("/employee_report")
	public ArrayList<departmentviseemployee> getEmployeeReport() {
		ArrayList<String> dep= new ArrayList<String>();
		ArrayList<departmentviseemployee> de = new ArrayList<departmentviseemployee>();
		dep.add("Ui/UX");
		dep.add("java");
		
		for (String d : dep) {
			List<employeemodel> byDepartment = emprepository.findByDepartment(d);
			departmentviseemployee dve = new departmentviseemployee(d, byDepartment.size());
			de.add(dve);
		}
		
		return de;
		
	}
	
	@GetMapping("/total_salary")
	public ArrayList<departmentvisesalary> getTotalSalary() {
	    ArrayList<String> dep = new ArrayList<>();
	    ArrayList<departmentvisesalary> des = new ArrayList<>();
	    
	    dep.add("Ui/UX");
	    dep.add("java");
	   
	    for (String d : dep) {
	        
	        List<employeemodel> byDepartment = emprepository.findByDepartment(d);

	        int totalSalary = 0;
	        for (employeemodel e : byDepartment) {
	            totalSalary += e.getSalary(); 
	        }

	        departmentvisesalary dvs = new departmentvisesalary(d, totalSalary);
	        des.add(dvs);
	    }

	    return des;
	}
	
	
	@GetMapping("/assignment_report")
	public ArrayList<ongoingproject> ongoingProject(){
		List<projectmodel> allPrj = prorepository.findAll();
		ArrayList<ongoingproject> response= new ArrayList<ongoingproject>();
		for (projectmodel prjData : allPrj) {
			ongoingproject ogp = new ongoingproject();
			ogp.setProjectname(prjData.getProjectname());
			ArrayList<String> emps = new ArrayList<String>();
			List<assignmentmodel> byPrid = assignrepo.findByPrid(prjData.getPrid());
			for (assignmentmodel asm : byPrid) {
				Optional<employeemodel> byId = emprepository.findById(asm.getEmid());
				if(!byId.isEmpty())
				{
					employeemodel empData = byId.get();
					emps.add(empData.getName());
				}
			}
			ogp.setNames(emps);
			response.add(ogp);
		}
		return response;
	}

		
		

}
