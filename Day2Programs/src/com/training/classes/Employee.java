package com.training.classes;

public class Employee extends User{

	private String empCode;
	public String getEmpCode() {
		return empCode;
	}
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}


	public Employee(String name,String empCode) {
		this.name=name;
		this.empCode = empCode;
	}
	public Employee() { }

	public void giveOffers()
	{
		System.out.println("You get 100 reward points");
	}

}
