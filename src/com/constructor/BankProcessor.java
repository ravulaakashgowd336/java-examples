package com.constructor;

public class BankProcessor {

	public static void main(String[] args) {
        BankAccount b = new BankAccount(949392,"dinesh",5000);
        System.out.println("Account holder Name:"+b.getAccountNumber());
        System.out.println("Account Number:"+b.getAccountHolderName());
        System.out.println("balance: "+ b.getBalance());
        b.deposit(5000);
        System.out.println("after deposit balance"+ b.getBalance());
        b.withdraw(2000);
        System.out.println("after withraw balance"+ b.getBalance());
	}

}