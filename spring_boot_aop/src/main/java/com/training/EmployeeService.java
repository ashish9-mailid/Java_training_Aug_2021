package com.training;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	public Employee createEmployee(String name, int age) {

		Employee emp = new Employee();
		emp.setName(name);
		System.out.println("name set");

		
		emp.setAge(age);
		System.out.println("Age set");
		
		return emp;
	}
	
	public static Employee createEmployee1(String name, int age) {

		Employee emp = new Employee();
		emp.setName(name);
		System.out.println("name set");

		
		emp.setAge(age);
		System.out.println("Age set");
		
		return emp;
	}
	
	// around 
	//before
	public int testEmp(int age)
	{
		try {
		System.out.println("Entering test Emp..");
		if(age<18) throw new ArithmeticException("age less than 18");
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception handled..");
		}
		return age;
	}

}



