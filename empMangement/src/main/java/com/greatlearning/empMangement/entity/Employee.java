package com.greatlearning.empMangement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "employee")

public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType. IDENTITY)
	@Column (name="emp id")
	private int empid;
	@Column(name="emp first name")
	private String empFirstName;
	@Column (name= "emp last name") private String emplatName;
	@Column (name="emp_id")
	private String empEmail;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmplatName() {
		return emplatName;
	}
	public void setEmplatName(String emplatName) {
		this.emplatName = emplatName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	
	
}
