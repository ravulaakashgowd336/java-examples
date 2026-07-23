package com.EmployeePromotion;

public class Employee {
	int empId;
	String name;
	String designation;
	double salary;
	int performanceRating;
	public Employee(int empId,String name,String designation,double salary,int performanceRating) {
		this.empId=empId;
		this.name=name;
		this.designation=designation;
		this.salary=salary;
		this.performanceRating=performanceRating;
		}
	public String getDesignation() {
		return designation;
	}
	public double getSalary() {
		return salary;
	}
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public int getPerformanceRating() {
		return performanceRating;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void promoteEmployee() {
		if(performanceRating >=4) {
			salary=salary+(salary*0.20);
			
			designation="Senior Developer";
			System.out.println("Employee Promoted Successfully:");
			System.out.println("After promotion:");
			System.out.println("Employee salary:"+salary);
			System.out.println("Employee Designation:"+designation);

			
		}
		else {
			System.out.println("Not Promoted :");
			System.out.println("Designation:"+designation);
			System.out.println("Salary: "+salary);
		}
	}
	
	

}