package com.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answers {
	@Id
	private int aid;
	private String solution;
	
	@ManyToOne
	private Questions que;//object provide in qustion 

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}

	public Questions getQustions() {
		return que;
	}

	public void setQustions(Questions qustions) {
		this.que = qustions;
	}
	
	
}
