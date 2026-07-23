package com.constructor;

public class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;
    
    public BankAccount(int accountNumber,String accountHolderName,double balance) {
    	this.accountNumber = accountNumber;
    	this.accountHolderName =accountHolderName;
    	this.balance = balance;
    }
    

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getBalance() {
		return balance;
	}
    

	

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -=amount;
		}else {
			System.out.println("insufficent amount");
		}
	}	
}	
