package com.training.classes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

public class SerDemo {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("sam","ajay","peter");
		Employee emp =  new Employee(101, "sam", "sales");
		
		
		ObjectOutputStream oout;
		try {
			oout = new ObjectOutputStream(new FileOutputStream("emp.ser"));
		//	oout.writeObject(names);
			
			
			oout.writeObject(emp);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
