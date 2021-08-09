package com.training.classes;

public class Employee {
	
	private int empCode;
	private String name;
	private String dept;
	
	public Employee() {
		super();
	}

	public Employee(int empCode, String name, String dept) {
		super();
		this.empCode = empCode;
		this.name = name;
		this.dept = dept;
	}

	public int getEmpCode() {
		return empCode;
	}

	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String toString()
	{
		return empCode+" "+name+" "+dept;
	}
}
