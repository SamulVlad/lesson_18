package com.samul.javaсorelessons.lesson18.vehicle;

public class Vehicle {
	public String vehicleType;
	public int numberOfWheels;
	
	public Vehicle(String vehicleType, int numberOfWheels) {
		super();
		this.vehicleType = vehicleType;
		this.numberOfWheels = numberOfWheels;
	}
	
	public void dysplayInfo() {
		System.out.println("Vehicle type: " + vehicleType + " Number of wheels: " + numberOfWheels);
	}
	
}
