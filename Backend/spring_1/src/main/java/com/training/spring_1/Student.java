package com.training.spring_1;

import org.springframework.stereotype.Component;

@Component
public class Student implements Staff{
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println("I am a student "+ name);
	}

}
