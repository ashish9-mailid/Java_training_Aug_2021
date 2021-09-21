package com.training.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {
	
	@GetMapping("/test")
	public String test()
	{
		return "test";
	}
	// mapping to get movie  based on Id
	
	// mapping to get all movies based on genre
	
	// mapping to get all movies based on title
}
