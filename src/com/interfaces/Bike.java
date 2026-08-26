package com.interfaces;

public class Bike implements Vehicle{

	@Override
	public void accelarate() {
		System.out.println("Bike moving....");
		
	}

	@Override
	public void breaking() {
		System.out.println("Bike stop Moving....");

	}

	@Override
	public void lights() {
		System.out.println("Bike in now-a-days used Disco Lights...."); 

	}
}
