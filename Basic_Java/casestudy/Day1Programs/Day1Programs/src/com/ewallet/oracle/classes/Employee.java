package com.ewallet.oracle.classes;

public class Employee extends User{
	private String empCode;
	private String dept;
		
	public Employee() {
		super();
	}
	public Employee(String name, String phoneNo, int age, String empCode,
			String dept) {
		super(name, phoneNo, age); // calls User(name,phoneNo,age
		this.empCode = empCode;
		this.dept = dept;
	}
	public String getEmpCode() {
		return empCode;
	}
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return super.toString()+" "+empCode+" "+dept;
	}
	
	@Override
	public void giveOffers() {
		System.out.println("Employee gets a Cash back of 20%..");
		
	}
	
		
	

}
