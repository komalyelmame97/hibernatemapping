package com.manytomanybidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Demo {
	@Id
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
