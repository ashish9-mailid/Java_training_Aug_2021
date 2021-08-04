package com.ewallet.oracle.utility;


import com.ewallet.oracle.classes.Customer;
import com.ewallet.oracle.classes.Employee;
import com.ewallet.oracle.classes.User;

public class UserUtility {
	public static void printDetails(User user)
	{
		System.out.println("name:"+user.getName());
		System.out.println("age:"+user.getAge());
		System.out.println("phone no:"+user.getPhoneNo());

		if(user instanceof Customer)
		{
			Customer c=(Customer)user;
			System.out.println("Cust Id:"+c.getCustId());
			System.out.println("Cust Email Id:"+c.getEmailId());
		}

		else if(user instanceof Employee)
		{
			Employee e=(Employee)user;
			System.out.println("Emp Code:"+e.getEmpCode());
			System.out.println("Dept:"+e.getDept());
		}
		else
		{
			System.out.println("Not Implemented..");
		}
	}

}
