package com.training.classes;

public class Car {
	
	//attributes instance variables
	private String model; //null
	private String color; //null
		
	public Car() {
		super();
	}

	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void moves()
	{
		System.out.println(model+" "+color+ " Car Moves..");
	}

}
