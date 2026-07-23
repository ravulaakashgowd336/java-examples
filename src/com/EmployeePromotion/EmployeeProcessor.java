package com.EmployeePromotion;

public class EmployeeProcessor {

	public static void main(String[] args) {

		Employee obj=new Employee(201,"Bob","Developer",500000,3);
		
		System.out.println("Before Promotion:");
		System.out.println();
		System.out.println("Employee Id:"+obj.getEmpId());
		System.out.println("Employee Name:"+obj.getName());
		System.out.println("Employee Designation:"+obj.getDesignation());
		System.out.println("Employee salary:$"+obj.getSalary());
		System.out.println("Performance Rating:"+obj.getPerformanceRating());
		System.out.println();
	
		obj.promoteEmployee();
		


	}

}