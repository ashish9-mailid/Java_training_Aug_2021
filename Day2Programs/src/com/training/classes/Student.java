package com.training.classes;

public class Student extends User{
	
	private long regNo;
	
	public Student() { }

	public long getRegNo() {
		return regNo;
	}

	public void setRegNo(long regNo) {
		this.regNo = regNo;
	}

	public Student(String name, long regNo) {
		super(name);
		this.regNo = regNo;
	}

	@Override
	public void giveOffers() {
		System.out.println("you get discount of 20%");
		
	}



}
