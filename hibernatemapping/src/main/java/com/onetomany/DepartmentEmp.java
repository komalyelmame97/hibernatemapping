package com.onetomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "E_Department")
public class DepartmentEmp {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Emp_Record")
	private int e_recodid;
	@Column(name = "Department_Name")
	private String e_departName;
	
	@OneToMany(mappedBy = "depart")
	private List<Employee> employee;

	public int getE_recodid() {
		return e_recodid;
	}

	public void setE_recodid(int e_recodid) {
		this.e_recodid = e_recodid;
	}

	public String getE_departName() {
		return e_departName;
	}

	public void setE_departName(String e_departName) {
		this.e_departName = e_departName;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
	

}
