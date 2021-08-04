package com.ewallet.oracle.clients;


import java.util.Scanner;

import com.ewallet.oracle.classes.Customer;
import com.ewallet.oracle.classes.Employee;
import com.ewallet.oracle.classes.User;
import com.ewallet.oracle.utility.UserFactory;
import com.ewallet.oracle.utility.UserUtility;

public class EWalletClient {
	
	public static void main(String[] args) {
		
		/*User user=new Customer("sam", "423222", 32, "sam@gmail.com");
		UserUtility.printDetails(user);
		
		System.out.println("-------------------------");
		user = new Employee("ram", "8722223", 34, "emp001", "sales");
		UserUtility.printDetails(user);*/
		
		System.out.println("Enter c, e ,s");
		Scanner s = new Scanner(System.in);
		String userType = s.next();
		
		User user = UserFactory.getUserInstance(userType);
		user.giveOffers();
		UserUtility.printDetails(user);
		
	}

}







