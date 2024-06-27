package com.samul.javaсorelessons.lesson18.vehicle;

public class Bicycle extends Vehicle{
	
	public String bicycleType;

	public Bicycle(int numberOfWheels, String bicycleType) {
		super("Bycicle", numberOfWheels);
		this.bicycleType = bicycleType;
	}
	
	public void displayBiCycleInfo() {
		System.out.println("Bicycle type: " + bicycleType);
	
	}


}
