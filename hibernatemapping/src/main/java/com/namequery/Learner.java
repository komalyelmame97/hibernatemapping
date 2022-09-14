package com.namequery;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@NamedQueries({@NamedQuery(name = "findLearnerbyId",query = "from Learner where id =:Id1"),
	@NamedQuery(name = "findLearnerbyName",query = "from Learner where name like 'a%' "),
	@NamedQuery(name = "findLearnerbyIdDesc",query = "from Learner order by name desc\n"),
	@NamedQuery(name = "findCitybyName",query = "from Learner where name =:lname")
})
@Entity
public class Learner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Learner_Id")
	private int id;
	@Column(name = "Learner_Name")
	private String name;
	@Column(name = "Learner_City")
	private String city;
	
	
	public Learner() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Learner(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
}
