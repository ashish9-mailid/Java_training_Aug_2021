package com.training.clients;

import java.util.List;

import com.training.classes.Employee;
import com.training.dao.EmpDao;

public class JdbcClient {

	public static void main(String[] args) {
		
		EmpDao empDao = new EmpDao();
		
		//add
	//System.out.println(empDao.addEmployee(8976, "George", "Projects")+" record added");
		
		List<Employee> empList = empDao.getAllEmployees();
		
		empList.forEach(System.out::println);

	}

}
