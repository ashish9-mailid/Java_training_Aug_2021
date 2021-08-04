package com.application;

public class Cd {
	private int cdCode;
	private String description;
	private String status;// borrowed,issued,renewed
	private String memCode; // who has borrowed.
	// constructors,getters,setters.
	public int getCdCode() {
		return cdCode;
	}
	public void setCdCode(int cdCode) {
		this.cdCode = cdCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMemCode() {
		return memCode;
	}
	public void setMemCode(String memCode) {
		this.memCode = memCode;
	}
	
	public Cd() {
		super();
	}
	public Cd(int cdCode, String description, String status, String memCode) {
		super();
		this.cdCode = cdCode;
		this.description = description;
		this.status = status;
		this.memCode = memCode;
	}
	
	//logic
	

}
