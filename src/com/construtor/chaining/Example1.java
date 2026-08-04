package com.construtor.chaining;

class Example1 {
	
	public Example1() {
		this(36);
		System.out.println("this is no parameteroised constructor..");
	}
	public Example1(int a) {
		System.out.println("this is parameteroised constructor");
	}

	public static void main(String[] args) {
		new Example1();
	}

}
