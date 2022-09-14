package com.manytomanybidirectional;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Student_Id")
	private long id;
	
	@Column(name = "Student_Fname")
	private String firstname;
	
	@Column(name = "Student_Lname")
	private String lastname;
	
	@Column(name = "Student_Age")
	private int age;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Student_Course",
	joinColumns = {@JoinColumn(name = "Student_Id")},
	inverseJoinColumns ={@JoinColumn(name = "Course_Id")})
	private List<Course> course = new ArrayList<Course>();

	
	


	public Student(String firstname, String lastname, int age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	
	


	

}
