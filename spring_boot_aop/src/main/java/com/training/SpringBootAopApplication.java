package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(proxyTargetClass=true)
@SpringBootApplication
public class SpringBootAopApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAopApplication.class, args);
	}
	@Autowired
	private EmployeeService employeeService;
	
	@Override
	public void run(String... args) throws Exception {
	//employeeService.createEmployee("sam", 15);
	
	//Employee emp=employeeService.createEmployee1("john", 34);
	
	System.out.println(employeeService.testEmp(13));
	}

}
