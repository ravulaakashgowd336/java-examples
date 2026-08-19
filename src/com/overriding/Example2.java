package com.overriding;
class Vechicle{
	public void start() {
		System.out.println("Vehicle started");
	}
}

class Car extends Vechicle{
	@Override
	public void start() {
		System.out.println("Car started");
	}
}
public class Example2 {
	public static void main(String[] args) {
		Vechicle v = new Vechicle();
		Car c = new Car();
		v.start();
		c.start();
	}
}
