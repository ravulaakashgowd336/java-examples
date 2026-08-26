package com.abstraction;

abstract class Vehicle {
    protected String modelName;
    protected String vehicleNumber;
    protected String company;

    Vehicle(String modelName, String vehicleNumber, String company) {
        this.modelName = modelName;
        this.vehicleNumber = vehicleNumber;
        this.company = company;
    }

    abstract void startEngine();

    void fuelType() {
        System.out.println("Petrol");
    }
}

class Car extends Vehicle {
    private int numberOfDoors;
    private boolean hasSunroof;

    Car(String modelName, String vehicleNumber, String company,
        int numberOfDoors, boolean hasSunroof) {
        super(modelName, vehicleNumber, company);
        this.numberOfDoors = numberOfDoors;
        this.hasSunroof = hasSunroof;
    }

    @Override
    void startEngine() {
        System.out.println("Starting engine with key ignition.");
    }
}

class Bike extends Vehicle {
    private boolean hasSidecar;

    Bike(String modelName, String vehicleNumber, String company,
         boolean hasSidecar) {
        super(modelName, vehicleNumber, company);
        this.hasSidecar = hasSidecar;
    }

    @Override
    void startEngine() {
        System.out.println("Starting engine with kick-start.");
    }
}

class Truck extends Vehicle {
    private int cargoCapacity;

    Truck(String modelName, String vehicleNumber, String company,
          int cargoCapacity) {
        super(modelName, vehicleNumber, company);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    void startEngine() {
        System.out.println("Starting engine with heavy-load warm-up.");
    }

    @Override
    void fuelType() {
        System.out.println("Diesel");
    }
}


public class Example1 {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota Camry", "ABC123", "Toyota", 4, true);
        car.startEngine();
        car.fuelType();

        Vehicle bike = new Bike("Yamaha R1", "XYZ789", "Yamaha", false);
        bike.startEngine();
        bike.fuelType();

        Vehicle truck = new Truck("Volvo FH", "DEF456", "Volvo", 20000);
        truck.startEngine();
        truck.fuelType();
    }
}
