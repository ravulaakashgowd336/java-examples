package com.scanners;

import java.util.Scanner;

public class StudentResultDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Student Name : ");
		String name = sc.nextLine();

		System.out.print("Enter Student ID : ");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Course Name : ");
		String course = sc.nextLine();

		System.out.print("Enter First Subject Marks : ");
		double marks = sc.nextDouble();

		StudentResult s = new StudentResult(name, id, course, marks);

		int choice;

		do {

			System.out.println("\n----- MENU -----");
			System.out.println("1. Add More Subject Marks");
			System.out.println("2. Calculate Grade");
			System.out.println("3. View Total Marks");
			System.out.println("4. Exit");

			System.out.print("Enter Choice : ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter Marks : ");
				double newMarks = sc.nextDouble();
				s.addMarks(newMarks);
				break;

			case 2:
				s.calculateGrade();
				break;

			case 3:
				s.viewTotalMarks();
				break;

			case 4:
				System.out.println("Thank You! Result Processing Completed.");
				break;

			default:
				System.out.println("Invalid option");
			}

		} while (choice != 4);

		sc.close();
	}
}