package com.overriding;
class Shape{
	public void draw() {
		System.out.println("Drawing Shape");
	}
}
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}
}
class Square extends Shape{
	@Override
	public void draw() {
		System.out.println("Drawing Square");
	}
}
public class Example5 {
	public static void main(String[] args) {
		Circle c = new Circle();
		Square s = new Square();
		c.draw();
		s.draw();
	}
}
