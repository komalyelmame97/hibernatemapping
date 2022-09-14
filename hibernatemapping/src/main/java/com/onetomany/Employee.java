package com.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Employees")
public class Employee {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "Emp_Id")
		private int e_id;
		@Column(name = "Emp_Name")
		private String e_name;
		@Column(name = "Emp_Age")
		private int e_age;
		
		@ManyToOne
		private DepartmentEmp depart;

		public int getE_id() {
			return e_id;
		}

		public void setE_id(int e_id) {
			this.e_id = e_id;
		}

		public String getE_name() {
			return e_name;
		}

		public void setE_name(String e_name) {
			this.e_name = e_name;
		}

		public int getE_age() {
			return e_age;
		}

		public void setE_age(int e_age) {
			this.e_age = e_age;
		}

		public DepartmentEmp getDepart() {
			return depart;
		}

		public void setDepart(DepartmentEmp depart) {
			this.depart = depart;
		}
		
		
}
