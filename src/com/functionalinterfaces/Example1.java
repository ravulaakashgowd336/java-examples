package com.functionalinterfaces;
import java.util.function.Consumer;
class Parent implements Consumer<String>{
	@Override
	public void accept(String str) {
		System.out.println(str);
	}
}
public class Example1 {

	public static void main(String[] args) {
		Consumer<String> consumer = new Parent();
		consumer.accept("This is Akash......");
	}

}
