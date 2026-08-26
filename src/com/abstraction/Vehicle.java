package com.abstraction;

public abstract class Vehicle {
	String modelName;
	String vehicleNumber;
	String company;
	public Vehicle(String modelName, String vehicleNumber, String company) {
		this.modelName = modelName;
		this.vehicleNumber = vehicleNumber;
		this.company = company;
	}
	public abstract void startEngine();
	public void fuelType() {
		System.out.println("Petrol");
	}
}
