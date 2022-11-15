package com.training.spring_1;

import org.springframework.stereotype.Component;

@Component
public class Teacher implements Staff  {
	public void print() {
		System.out.println("I am a teacher");
	}

}
