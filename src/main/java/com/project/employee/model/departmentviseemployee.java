package com.project.employee.model;

public class departmentviseemployee {
	
	public String department;
	public int totalemp;
	
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getTotalemp() {
		return totalemp;
	}
	public void setTotalemp(int totalemp) {
		this.totalemp = totalemp;
	}
	public departmentviseemployee(String department, int totalemp) {
		super();
		this.department = department;
		this.totalemp = totalemp;
	}
	public departmentviseemployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
