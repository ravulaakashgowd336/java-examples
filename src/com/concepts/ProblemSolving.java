package com.concepts;
class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    protected double balance;

    // Constructor
    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit : " + amount);
        System.out.println("Balance : " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw : " + amount);
            System.out.println("Balance : " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance        : " + balance);
    }
}

// Child class
class SavingsAccount extends BankAccount {

    SavingsAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    // Method overriding
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 1000) {
            balance -= amount;
            System.out.println("Withdraw : " + amount);
            System.out.println("Balance : " + balance);
        } else {
            System.out.println("Withdrawal denied!");
            System.out.println("Minimum balance of ₹1000 must be maintained.");
        }
    }
}

// Child class
class CurrentAccount extends BankAccount {

    CurrentAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    // Method overriding
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -5000) {
            balance -= amount;
            System.out.println("Withdraw : " + amount);
            System.out.println("Balance : " + balance);
        } else {
            System.out.println("Withdrawal denied!");
            System.out.println("₹5000 overdraft limit exceeded.");
        }
    }
}

// Main class
public class ProblemSolving {
    public static void main(String[] args) {

        // RuntimePolymorphism
        BankAccount account;

        System.out.println("Savings Account");
        System.out.println("---------------");

        account = new SavingsAccount(101, "Rahul", 20000);

        account.displayDetails();
        System.out.println();

        account.deposit(5000);
        System.out.println();

        account.withdraw(10000);

        System.out.println("\n");

        System.out.println("Current Account");
        System.out.println("---------------");

        account = new CurrentAccount(102, "Arjun", 10000);

        account.displayDetails();
        System.out.println();

        account.deposit(5000);
        System.out.println();

        account.withdraw(18000);
    }
}
