package com.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.demo.CompositeKey.CustomerPk;
@Entity
@Table(name="customer_table_3")
public class Customer {
@Id
@GeneratedValue
  private CustomerPk  id;
	@Column(name="cust_address" ,nullable=false,length=60)
	private String address;
	private String phoneno;
	public CustomerPk getId() {
		return id;
	}
	public void setId(CustomerPk id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public Customer(CustomerPk id, String address, String phoneno) {
		super();
		this.id = id;
		this.address = address;
		this.phoneno = phoneno;
	}
	public Customer() {
		
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", address=" + address + ", phoneno=" + phoneno + "]";
	}
	
	

}
