package com.samul.javaсorelessons.lesson18.vehicle;

public class Car extends Vehicle{
	public String carBrand;

	public Car(int numberOfWheels, String carBrand) {
		super("Car", numberOfWheels);
		this.carBrand = carBrand;
	}
	
	public void displayCarInfo() {
		System.out.println("Car brand: " + carBrand);
	
	}

}
