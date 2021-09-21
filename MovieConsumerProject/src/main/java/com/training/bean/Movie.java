package com.training.bean;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString


public class Movie {
	
	private long movieId;
	private String title;
	private String genre;
	private int stars;
	private String feedback;
	

}
