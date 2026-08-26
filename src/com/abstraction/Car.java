package com.abstraction;

public class Car extends Vehicle{
	int numberOfDoors;
	boolean hasSunroof;
	public Car(String modelName, String vehicleNumber, String company, int numberOfDoors, boolean hasSunroof) {
		super(modelName, vehicleNumber, company);
		this.numberOfDoors = numberOfDoors;
		this.hasSunroof = hasSunroof;
	}
	public void startEngine() {
		System.out.println("Starting engine with key ignition.");
	}
}
