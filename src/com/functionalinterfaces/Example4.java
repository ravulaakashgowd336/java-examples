package com.functionalinterfaces;
import java.util.function.Consumer;
import java.util.function.Predicate;
class Employe{
	String name;
	String desg;
	double Salary;
	public Employe(String name, String desg, double salary) {
		super();
		this.name = name;
		this.desg = desg;
		Salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employe [name=" + name + ", desg=" + desg + ", Salary=" + Salary + "]";
	}	
}
public class Example4 {
	public static void main(String[] args) {
		Predicate<Employe> check = new Predicate<Employe>() {

			@Override
			public boolean test(Employe emp) {
				return emp.getSalary()>10000;
			}
			
		};
		Consumer<Employe> consumer = new Consumer<Employe>() {
			@Override
			public void accept(Employe employ) {
				employ.setSalary(employ.getSalary()+(employ.getSalary()*0.10));
				System.out.println("Updated Salary: " + employ.getSalary());
			}
		};
		Employe emp1 = new Employe("Akash", "SD", 9000.0);
		Employe emp2 = new Employe("Teju", "SJ", 12000.0);
		Employe emp3 = new Employe("Sahithya", "SE", 4000.0);
		
		Employe[] employes = {emp1,emp2,emp3};
		for(Employe emps:employes) {
			if(check.test(emps)) {
				consumer.accept(emps);
			}
		}

	}
}
