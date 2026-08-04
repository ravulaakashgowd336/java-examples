package com.construtor.chaining;

class Bicycle{
	String tyres;
	String handle;
	String chain;
	String brakes;
	public Bicycle(String tyres, String handle, String chain, String brakes) {
		super();
		this.tyres = tyres;
		this.handle = handle;
		this.chain = chain;
		this.brakes = brakes;
		
		System.out.println("Bicycle Object Created.....");
	}
		
}

class Bike extends Bicycle{
	String tank;
	String engine;
	String lamp;
	public Bike(String tank, String engine, String lamp,String tyres, String handle, String chain, String brakes) {
		super(tyres, handle, chain, brakes);
		
		this.tank = tank;
		this.engine = engine;
		this.lamp = lamp;
		
		System.out.println("Bike Object Created...");
	}
	
	
}

public class Example3 {

	public static void main(String[] args) {
		
		Bicycle cycle = new Bike("Petrol", "150cc", "LED", "MRF", "Hero", "Herochain", "disc"); 

	}

}
