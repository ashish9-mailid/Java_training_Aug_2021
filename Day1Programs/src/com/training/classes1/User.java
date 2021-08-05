package com.training.classes1;

public class User {      //extends Object
	protected String id;
	protected String name;

	public User() {
		//Object()
	}

	public User(String id, String name) {
		
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString()
	{
		return id+" "+name;
	}


}
