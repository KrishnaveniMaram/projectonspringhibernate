package com.demo.springDemo;

public class Demo {

public static void main(String[] args) {
	
	Passanger passanger=new Passanger();
	
	//diP and ioc 
	
	
	Vehicle vehicle=new Car();
	passanger.setName("litya");
	passanger.setVehicle(vehicle);//pasanger is pulling vehicle 
	passanger.travel();
	
}
	
	
	
}
