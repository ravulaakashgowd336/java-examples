package com.overriding;

public class CabBooking {
	static class Cab{
		void fare() {
			System.out.println("Cab fare");
		}
	}
	static class SmallCab extends Cab{
		void fare() {
			System.out.println("Small Cab fare = 100");
		}
	}
	static class SedanCab extends Cab{
		void fare() {
			System.out.println("Sedan Cab fare = 200");
		}
	}
	static class LuxuaryCab extends Cab{
		void fare() {
			System.out.println("Luxuary Cab fare = 400");
		}
	}
	public static void main(String[] args) {
		Cab c;
		c = new SmallCab();
		c.fare();
		c = new SedanCab();
		c.fare();
		c = new LuxuaryCab();
		c.fare();
	}

}
