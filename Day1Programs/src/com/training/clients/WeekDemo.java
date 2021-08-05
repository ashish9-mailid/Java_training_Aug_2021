package com.training.clients;

import java.util.Scanner;

import com.training.classes.Operations;



/*Write a Java program that prints day of the week when user inputs a number.
a. Ex: 0 is for Sunday , 1 for monday so on..
b. Optimize the code without using switch case.
*/

public class WeekDemo {

	public static void main(String[] args) {
		System.out.println("Enter any number [0-6]");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //0
		
		if(n<0 || n > 6)
			System.out.println("Invalid Input| Enter [0-6]");
		else
			System.out.println(Operations.getWeek(n));

	}

}
