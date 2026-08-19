package com.overriding;
class Animal{
	public void makeSound() {
		System.out.println("Animal sound");
	}
}

class Dog extends Animal{
	@Override
	public void makeSound() {
		System.out.println("Bark");
	}
}

public class Example1 {
	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();
		a.makeSound();
		d.makeSound();
	}
}
