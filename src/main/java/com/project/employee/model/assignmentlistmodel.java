package com.project.employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class assignmentlistmodel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int assid;
	private String name;
	private String projectname;
	public int getAssid() {
		return assid;
	}
	public void setAssid(int assid) {
		this.assid = assid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public assignmentlistmodel(int assid, String name, String projectname) {
		super();
		this.assid = assid;
		this.name = name;
		this.projectname = projectname;
	}
	public assignmentlistmodel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
