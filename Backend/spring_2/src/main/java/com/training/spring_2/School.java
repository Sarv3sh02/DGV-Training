package com.training.spring_2;

import org.springframework.beans.factory.annotation.Autowired;

public class School {
	
	@Autowired
	public Teacher teacher;
	
	public void print() {
		System.out.println("I am a School");
		teacher.print();
	}

}
