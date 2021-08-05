package com.training.clients;

import com.training.classes.Address;
import com.training.classes.Car;
import com.training.classes.Employee;

public class TestOOP1 {

	public static void main(String[] args) {
		
		Car car ; // reference stack
		
		car = new Car(); //object in heap
		
		Car car1=new Car("alto","blue"); // para constructor
		car1.moves();

		Car car2=new Car("Hyundai","silver");
		car2.moves();
		
		car2.setColor("red");
		car2.moves();
		
		System.out.println(car2.getModel());
		
		Address address1 = new Address("101", "Mg Rd", "Bengaluru", "KA");
		
		Employee sam = new Employee("samson", "sam@gmail.com",address1);
		System.out.println("Your emp id:"+sam.getEmpId());
		
		sam.travels(car2);
		
		sam.livesIn();
		
		Address address2 = new Address("345", "Church st", "Chennai", "TN");
		
		
		Employee peter = new Employee("Peterson", "pet@gmail.com", address2); 
		System.out.println("Your emp id:"+peter.getEmpId());
		
		System.out.println("no of emps:"+Employee.getCount());
	}

}
