package com.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean,DisposableBean {

private String  name;
private Vehicle vehicle;


public void myInitmethod(){
	System.out.println("i am init method xml version for person");
}
@PostConstruct
public void myInitmethodAnno(){
	System.out.println("i am init method annotation version for person");
}


public void myDestroyMethod(){
	System.out.println("i am destroy method xml version for person");
}
@PreDestroy
public void myDestroyMethodAnno(){
	System.out.println("i am destroy method annotation version for person");
}



public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Vehicle getVehicle() {
	return vehicle;
}
public void setVehicle(Vehicle vehicle) {
	this.vehicle = vehicle;
}
public Person(String name, Vehicle vehicle) {
	super();
	this.name = name;
	this.vehicle = vehicle;
}
public Person() {
	System.out.println("cntr of person is called");
}

public void travel()
{
	System.out.println("paasanger name:"+name);
	vehicle.move();
}


@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("i am destroy  method of annotation for person");
}


@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("i am after propertiesset method of initialization for person");

}

}


