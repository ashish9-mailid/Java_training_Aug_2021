package com.jdbcoperations;

import java.util.Date;

public class DispatchDetails {

	private int dispatch_ref;
	private String details;
	private Date date_of_dispatch;
	private int bookId;
	private int qty;
	public int getDispatch_ref() {
		return dispatch_ref;
	}
	public void setDispatch_ref(int dispatch_ref) {
		this.dispatch_ref = dispatch_ref;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Date getDate_of_dispatch() {
		return date_of_dispatch;
	}
	public void setDate_of_dispatch(Date date_of_dispatch) {
		this.date_of_dispatch = date_of_dispatch;
	}
	public int getBookId() {
		return bookId;
	}
	@Override
	public String toString() {
		return "["+dispatch_ref + " "+ details+" "+" "+ date_of_dispatch+" "+bookId+ " "+ qty + "]";
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
}
