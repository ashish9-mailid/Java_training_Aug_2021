package com.training.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.training.classes.Employee;

public class CsvDemo {

	public static void main(String[] args) {
		/*try(FileWriter fw=new FileWriter("d:\\data.csv",true))
		{
			fw.write("101,sam,sales\n");
			fw.write("203,peter,design");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}*/


		//read the csv file  store the records in List<Employee> -- empcode , name and dept

		String line="";
		List<Employee> empList = new ArrayList<>();
		try(BufferedReader br=new BufferedReader(new FileReader("d:\\data.csv")))
		{
			while((line=br.readLine())!=null)
			{
				String data[] = line.split(",");
				Employee emp = new Employee(Integer.parseInt(data[0]), data[1], data[2]);
				empList.add(emp);
			}
			//print the list
			for(Employee e:empList)
			{
				System.out.println(e);
			}
		}
		catch( FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}



	}

}
