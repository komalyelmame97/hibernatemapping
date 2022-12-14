package com.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	private int answerId;
	private String answer;
	
	@OneToOne(mappedBy = "answer")
	private Questions que_Id;

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Questions getQue_Id() {
		return que_Id;
	}

	public void setQue_Id(Questions que_Id) {
		this.que_Id = que_Id;
	}
	
	
}
