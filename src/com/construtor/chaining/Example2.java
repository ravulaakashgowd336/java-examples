package com.construtor.chaining;


class X{
	public X() {
		System.out.println("this is parent class Constructor");
	}
	
}

class Y extends X{
	public Y() {
		super();
		System.out.println("this is child class constructor...");
	}
}

public class Example2 {

	public static void main(String[] args) {
		
		new Y();
	}

}
