package com.scanners;

public class BankApplication {

    String customerName;
    String customerAddress;
    long phoneNumber;
    double balance;

    public BankApplication(String customerName, String customerAddress, long phoneNumber, double balance) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.phoneNumber = phoneNumber;
        this.balance = balance;

        System.out.println("Account Created Successfully!");
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful");
            System.out.println("Available Balance: " + balance);
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount");
        } else if (amount > balance) {
            System.out.println("Insufficient Funds");
        } else {
            balance -= amount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        }
    }

    public void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}