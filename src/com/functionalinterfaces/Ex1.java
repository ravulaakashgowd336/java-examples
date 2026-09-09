package com.functionalinterfaces;
import java.util.function.Consumer;
public class Ex1 {
	public static void main(String[] args) {
		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String str) {
				System.out.println(str);
				
			}
			
		};
		consumer.accept("Akash is a Full Stack Developer....");
		
	}
}
