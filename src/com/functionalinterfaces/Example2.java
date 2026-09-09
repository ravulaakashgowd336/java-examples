package com.functionalinterfaces;
import java.util.function.Consumer;
class Employe{
	String name;

	public Employe(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employe [name=" + name + "]";
	}
}
public class Example2 {

	public static void main(String[] args) {
		Employe emp = new Employe("Akash");
		Consumer <Employe> consumer = new Consumer<Employe>() {

			@Override
			public void accept(Employe emp) {
				System.out.println(emp.name);
			}
			
		};
		consumer.accept(emp);
	}

}
