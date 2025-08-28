package com.project.employee.model;

import java.util.ArrayList;

public class ongoingproject {
	
	private String projectname;
	private ArrayList<String> names;
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public ArrayList<String> getNames() {
		return names;
	}
	public void setNames(ArrayList<String> names) {
		this.names = names;
	}
	public ongoingproject(String projectname, ArrayList<String> names) {
		super();
		this.projectname = projectname;
		this.names = names;
	}
	public ongoingproject() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
