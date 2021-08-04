package com.application;

public class Book {
private int bookId;
private String title;
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
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
public Book() {
	super();
}
public Book(int bookId, String title, String status, String memCode) {
	super();
	this.bookId = bookId;
	this.title = title;
	this.status = status;
	this.memCode = memCode;
}
private String status;// borrowed,issued,renewed
private String memCode; // who has borrowed.

// complete the code
 
}
