package com.training.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.training.bean.Movie;

public class ConsumerController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	public Movie giveMovieRating(long isbn)
	{
		String url="http://localhost:8084/movie/getmovie/id/{id}";
		Map map=null;
		restTemplate.getForEntity(url,Movie.class, map);
		return null;
		
	}
	
	

}
