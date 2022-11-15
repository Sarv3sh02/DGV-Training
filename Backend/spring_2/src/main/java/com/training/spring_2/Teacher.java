package com.training.spring_2;

public class Teacher {
	
	private int clas;
	
	
	public Teacher(int clas) {
		this.clas = clas;
	}


	public void print() {
		System.out.println("I am a teacher "+clas);
		
	}

}
