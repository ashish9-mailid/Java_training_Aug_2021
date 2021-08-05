package com.training.classes;

public class Factory {


	public static User getUserInstance(char type) {
		User user = null;

		if(type=='C' || type=='c') {
			user = new Customer("sam", "sam@gmail.com");


		}
		else if(type=='E' || type=='e') {

			user =  new Employee("Peter", "23456");


		}
		else if(type=='S' || type=='s') {

			user =  new Student("john", 34567);


		}
		return user;
	}

}
