package com.example.beans;

import lombok.Getter;
import lombok.Setter;

//@Setter @Getter
public class HelloWorld {  // POJO
	private String name;
	
	private Address add;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}
	
	
	
}
