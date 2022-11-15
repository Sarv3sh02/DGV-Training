package com.training.spring_1;

public class SpringInjection {
	
	private Staff staff;
	
	public SpringInjection(Staff staff) {
		this.staff=staff;
	}
	
	public void print() {
		staff.print();
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}


}
