package com.overloading;
 class Student {
	void calculateResult(int a, int b) {
		int total = a + b;
		System.out.println("Total = " + total);
		System.out.println("Average = " + total / 2.0);
	}
	void calculateResult(int a, int b, int c) {
		int total = a + b + c;
		System.out.println("Total = " + total);
		System.out.println("Average = " + total / 3.0);
	}
	void calculateResult(int a, int b, int c, int d, int e) {
		int total = a + b + c + d + e;
		System.out.println("Total = " + total);
		System.out.println("Average = " + total / 5.0);
	}
 }
public class StudentMarks{
	public static void main(String[] args) {
		Student s = new Student ();
		s.calculateResult(10, 20);
		s.calculateResult(10, 20, 30);
		s.calculateResult(10, 20, 30, 40, 50);
		
	}
}
