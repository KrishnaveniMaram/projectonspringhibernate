package com.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name="customer_Table_3")
public class MoreAnnotations {
	@Id
	@GeneratedValue
 private int id;
@Column(name="cust_table",nullable=false, unique=true, length=60)
 private String regno;
@Column(name="cust_add",nullable=false)
 private String address;
@Column(name="cust_mobno",nullable=false)
 private String mobileno;
@Temporal(TemporalType.DATE)
private Date dateOfBirth;

public Date getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getRegno() {
	return regno;
}
public void setRegno(String regno) {
	this.regno = regno;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}
public MoreAnnotations(String regno, String address, String mobileno) {
	super();
	this.regno = regno;
	this.address = address;
	this.mobileno = mobileno;
}
public MoreAnnotations(int id, String regno, String address, String mobileno, Date dateOfBirth) {
	super();
	this.id = id;
	this.regno = regno;
	this.address = address;
	this.mobileno = mobileno;
	this.dateOfBirth = dateOfBirth;
}
public MoreAnnotations() {
	
}
@Override
public String toString() {
	return "MoreAnnotations [id=" + id + ", regno=" + regno + ", address=" + address + ", mobileno=" + mobileno + "]";
}
	
	
	
	
}
