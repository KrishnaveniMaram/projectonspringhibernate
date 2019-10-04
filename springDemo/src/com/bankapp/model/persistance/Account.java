package com.bankapp.model.persistance;

public class Account {
private int id;
private String name;
private int balance;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public Account(int id, String name, int balance) {
	this.id = id;
	this.name = name;
	this.balance = balance;
}
public Account() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
}



}
