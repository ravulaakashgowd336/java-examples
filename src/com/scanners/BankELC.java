package com.scanners;

import java.util.Scanner;

public class BankELC {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        long phone = sc.nextLong();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankApplication obj = new BankApplication(name, address, phone, balance);

        int choice;

        do {
            System.out.println("\n1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter Withdrawal Amount: ");
                double amount = sc.nextDouble();
                obj.withdraw(amount);

            } else if (choice == 2) {
                System.out.print("Enter Deposit Amount: ");
                double amount = sc.nextDouble();
                obj.deposit(amount);

            } else if (choice == 3) {
                obj.showBalance();

            } else if (choice == 4) {
                System.out.println("Thank You!");

            } else {
                System.out.println("Invalid Option");
            }

        } while (choice != 4);

        sc.close();
    }
}