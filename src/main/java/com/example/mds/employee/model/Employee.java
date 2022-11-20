package com.example.mds.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 
	 @Column(nullable = false)
	 private String ename;

	public Employee(int id, String ename) {
		super();
		this.id = id;
		this.ename = ename;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}


	
	
}
