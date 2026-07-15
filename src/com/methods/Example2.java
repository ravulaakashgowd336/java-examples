package com.methods;

public class Example2 {
	public int a=10;
	public int b=20;
	public void getData() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		Example2 obj = new Example2();
		obj.getData();
		System.out.println(obj.a);
		System.out.println("------------");
		obj.a = 20;
		obj.b = 60;
		System.out.println(obj.a);
		obj.getData();




	}

}
