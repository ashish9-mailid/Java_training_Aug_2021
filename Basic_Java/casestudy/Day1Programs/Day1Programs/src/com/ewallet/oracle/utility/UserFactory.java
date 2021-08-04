package com.ewallet.oracle.utility;

import com.ewallet.oracle.classes.Customer;
import com.ewallet.oracle.classes.Employee;
import com.ewallet.oracle.classes.User;

public class UserFactory {

	public static User getUserInstance(String userType)
	{
		User user=null;
		switch(userType)
		{
		case "c":
				user=new Customer("sam", "423222", 32, "sam@gmail.com");
				break;
		case "e":
				user = new Employee("ram", "8722223", 34, "emp001", "sales");
				break;
				
		}
		return user;
	}
}
