package com.overriding;
class Parent {
    void print() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
	void print() {
        System.out.println("Child");
    }
}

public class Example4 {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        p.print();
        c.print();
    }
}

