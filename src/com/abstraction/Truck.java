package com.abstraction;

public class Truck extends Vehicle{
	int cargoCapacity;

	public Truck(String modelName, String vehicleNumber, String company, int cargoCapacity) {
		super(modelName, vehicleNumber, company);
		this.cargoCapacity = cargoCapacity;
	}
	public void startEngine() {
		System.out.println("Starting engine with heavy_load warm_up.");

	}
	@Override
	public void fuelType() {
		System.out.println("Diesel");
	}
}
