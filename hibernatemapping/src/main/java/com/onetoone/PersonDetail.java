package com.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PersonDetail {
	
	@Id
	@GeneratedValue
	private int personDetailId;
	private String zipCode;
	private String job;
	private double salary;
	
	@Column (name = "detailId_PK")
	public int getPersonDetailId() {
		return personDetailId;
	}
	
	public void setPersonDetailId(int personDetailId) {
		this.personDetailId = personDetailId;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public String getJob() {
		return job;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
