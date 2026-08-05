package com.inheritance;

class Vehicle{
	String make;
	String model;
	int year;
	public Vehicle(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}
	public void displayInfo() {
		System.out.println(make + " " + model + " " + year);
	}
}

class Car extends Vehicle{
	int numberOfDoors;
	public Car(String make, String model, int year, int numberOfDoors) {
		super(make, model, year);
		this.numberOfDoors = numberOfDoors;
	}
	
	public void displayCarInfo() {
		System.out.println("Number of Doors : " + numberOfDoors);
	}
}

class Truck extends Vehicle{
	int cargoCapacity;
	public Truck(String make, String model, int year, int cargoCapacity) {
		super(make, model, year);
		this.cargoCapacity = cargoCapacity;
	}
	public void displayTruckInfo() {
		System.out.println("Cargo Capacity : " + cargoCapacity);
	}
}

class Motorcycle extends Vehicle{
	boolean hasSideCar;
	public Motorcycle(String make, String model, int year, boolean hasSideCar) {
		super(make, model, year);
		this.hasSideCar = hasSideCar;
	}
	public void displayMotorcycleInfo() {
		System.out.println("Has Side Car : " + hasSideCar);
	}
}
		
		
public class VehicleHierarchy {

	public static void main(String[] args) {
		Vehicle car = new Car("toyota", "Corolla", 2022, 4);
		car.displayInfo();
		((Car) car).displayCarInfo();
		System.out.println();
		
		Vehicle truck = new Truck ("Ford", "F-150", 2021, 1000);
		truck.displayInfo(); 
		((Truck) truck).displayTruckInfo();
		System.out.println();
		
		Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Street Galide", 2023, true);
		motorcycle.displayInfo();
		((Motorcycle) motorcycle).displayMotorcycleInfo(); 
	} 

}
