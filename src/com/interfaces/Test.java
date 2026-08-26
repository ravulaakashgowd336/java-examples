package com.interfaces;

public class Test {

	public static void main(String[] args) {
		Vehicle v;
		
		v = new Bike();
		v.accelarate();
		v.breaking();
		v.lights();
		System.out.println("==============================");
		v = new Car();
		v.accelarate();
		v.breaking();
		v.lights();
	}

}
