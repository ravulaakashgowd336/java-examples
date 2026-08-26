package com.abstraction;

public class TestVehicle {

	public static void main(String[] args) {
		Vehicle vh;
		vh = new Car("Toyota Camry", "ABC123", "Toyota", 4, true);
		vh.startEngine();
		vh.fuelType();
		vh = new Bike("Yamaha R1", "XYZ789", "Yamaha", false);
		vh.startEngine();
		vh.fuelType();
		vh  new Truck("Volvo FH", "DEF456", "Volvo", 20000);
		vh.startEngine();
		vh.fuelType();
		
	}

}
