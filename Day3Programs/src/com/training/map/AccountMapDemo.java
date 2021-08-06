package com.training.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AccountMapDemo {

	public static void main(String[] args) {
		
		Map<String,String> accounts=new LinkedHashMap<>();
		accounts.put("sam", "sam123");
		accounts.put("sam", "abcd"); //replaces previous object
		accounts.put("peter", "pet123");
		
		System.out.println(accounts);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username");
		String username = sc.next();
		
		String password = accounts.get(username);
		if(password==null)
			System.out.println("User does not exist");
		else
		{
			System.out.println("Enter password");
			String pwd = sc.next();
			if(pwd.equals(password))
				System.out.println("Login successful");
			else
				System.out.println("Invalid password");
		}
		

	}

}
