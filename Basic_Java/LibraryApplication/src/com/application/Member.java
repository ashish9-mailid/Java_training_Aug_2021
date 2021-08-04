package com.application;

import java.util.Date;

public class Member {
private String memberCode;
private String memberName;
private char memberType;  // c for cd,b for book
private Date dateOfMembership;

public Member(String memberCode, String memberName, char memberType,Date dateOfMembership) {
	super();
	this.memberCode = memberCode;
	this.memberName = memberName;
	this.memberType = memberType;
	this.dateOfMembership=dateOfMembership;
	// complete the code;
}
public String getMemberCode() {
	return memberCode;
}
public void setMemberCode(String memberCode) {
	this.memberCode = memberCode;
}
public String getMemberName() {
	return memberName;
}
public void setMemberName(String memberName) {
	this.memberName = memberName;
}
public char getMemberType() {
	return memberType;
}
public void setMemberType(char memberType) {
	this.memberType = memberType;
}
public Date getDateOfMembership() {
	return dateOfMembership;
}
public void setDateOfMembership(Date dateOfMembership) {
	this.dateOfMembership = dateOfMembership;
}
public Member() {
	super();
}
public String toString()
{
	return memberCode+" "+memberName+" "+memberType;
}
}
