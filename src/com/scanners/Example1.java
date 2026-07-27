package com.scanners;
import java.util.Scanner;
public class Example1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Id : ");
		int studentId = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Student Name : ");
		String studentName = sc.nextLine();
		
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Course : ");
		String course = sc.nextLine();
		
		System.out.println("\nStudent Details");
        System.out.println("---------------");
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Age          : " + age);
        System.out.println("Course       : " + course);

	}

}
