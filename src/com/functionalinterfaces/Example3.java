package com.functionalinterfaces;
import java.util.function.Predicate;
public class Example3 {
	public static void main(String[] args) {
		Predicate<Integer> predicate = new Predicate<Integer>() {
			public boolean test(Integer i) {
				return i%2==0;
			}

		};
		System.out.println(predicate.test(40));
	}
}
