package com.training.classes;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DeSerDemo {

	public static void main(String[] args) {
		
		try {
			ObjectInputStream oIn = new ObjectInputStream(new FileInputStream("names.ser"));
			List<String> names = (List<String>) oIn.readObject();
			System.out.println(names);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
