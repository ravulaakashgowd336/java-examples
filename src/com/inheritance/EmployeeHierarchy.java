package com.inheritance;

//Base Class
class Employee {
 String name;
 double baseSalary;

 Employee(String name, double baseSalary) {
     this.name = name;
     this.baseSalary = baseSalary;
 }

 public double calculateAnnualSalary() {
     return baseSalary;
 }
}

//Manager Class
class Manager extends Employee {
 double bonus;
 int numberOfEmployeesManaged;

 Manager(String name, double baseSalary, double bonus, int numberOfEmployeesManaged) {
     super(name, baseSalary);
     this.bonus = bonus;
     this.numberOfEmployeesManaged = numberOfEmployeesManaged;
 }

 public double calculateManagerSalary() {
     return baseSalary + bonus;
 }
}

//Engineer Class
class Engineer extends Employee {
 int projectCount;

 Engineer(String name, double baseSalary, int projectCount) {
     super(name, baseSalary);
     this.projectCount = projectCount;
 }

 public double calculateEngineerSalary() {
     return baseSalary + (projectCount * 1000);
 }
}

class Salesperson extends Employee {
 double commissionRate;
 double totalSales;

 Salesperson(String name, double baseSalary, double commissionRate, double totalSales) {
     super(name, baseSalary);
     this.commissionRate = commissionRate;
     this.totalSales = totalSales;
 }

 public double calculateSalespersonSalary() {
     return baseSalary + (commissionRate * totalSales);
 }
}

public class EmployeeHierarchy {
 public static void main(String[] args) {

     Manager m = new Manager("Akash", 50000, 10000, 5);
     System.out.println(m.calculateManagerSalary());

     Engineer e = new Engineer("Bob", 70000, 5);
     System.out.println(e.calculateEngineerSalary());

     Salesperson s = new Salesperson("Hari", 40000, 0.1, 200000);
     System.out.println(s.calculateSalespersonSalary());
 }
}