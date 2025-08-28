package com.project.employee.model;

public class adminloginmodel {
	
	private String email;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public adminloginmodel(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public adminloginmodel() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
