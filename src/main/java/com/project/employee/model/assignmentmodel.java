package com.project.employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class assignmentmodel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int assid;
	private int prid;
	private int emid;
	
	
	public int getAssid() {
		return assid;
	}
	public void setAssid(int assid) {
		this.assid = assid;
	}
	public int getPrid() {
		return prid;
	}
	public void setPrid(int prid) {
		this.prid = prid;
	}
	public int getEmid() {
		return emid;
	}
	public void setEmid(int emid) {
		this.emid = emid;
	}
	public assignmentmodel(int assid, int prid, int emid) {
		super();
		this.assid = assid;
		this.prid = prid;
		this.emid = emid;
	}
	public assignmentmodel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
