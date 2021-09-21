package com.training.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BookController {
	
	@GetMapping("/")
	public String sayHello()
	{
		return "hello";
	}
	
	@GetMapping("/user/hello")
	public String sayHelloUser()
	{
		return "Hello User";
	}
	
	@GetMapping("/admin/hello")
	public String sayHelloAdmin()
	{
		return "Hello Admin";
	}
	
	@GetMapping("/admin/hello1")
	public String sayHelloAdmin1()
	{
		return "Hello Admin Again";
	}
	

}
