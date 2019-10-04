package com.demo.springDemo;

public class Passanger{
	private String name;
	private Vehicle vehicle;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	
	/*public void travel(){
		System.out.println("passanger named:"+name);
	vehicle.move();
	
	}*/
	public void travel() {
		// TODO Auto-generated method stub
		
		System.out.println("pasanger name:"+name);
		
		vehicle.move();
	}

}
