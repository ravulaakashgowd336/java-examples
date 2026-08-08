package com.thiskeyword;

public class Employee {
	private String empName;
	private String empDesg;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesg() {
		return empDesg;
	}
	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}
	
	public void showData() {
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee Desg : " + empDesg);
	}

}