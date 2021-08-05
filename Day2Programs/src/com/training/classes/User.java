package com.training.classes;

public abstract class User {
	protected String name;

	public User(String name) {
		super();
		this.name = name;
	}

	public User() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void giveOffers();
	
}







