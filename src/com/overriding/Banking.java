package com.overriding;

public class Banking {
	class BankAccount{
		void deposit() {
			System.out.println("Bank deposit");
		}
		void withdraw() {
			System.out.println("Bank withdraw");
		}
	}
	class SavingAccount extends BankAccount{
		void deposit() {
			System.out.println("Saving Account deposit");
		}
		void withdraw() {
			System.out.println("Saving Account withdraw");
		}
	}
	class CurrentAccount extends BankAccount{
		void deposit() {
			System.out.println("Current Account deposit");
		}
		void withdraw() {
			System.out.println("Current Account withdraw");
		}
	}
	public static void main(String[] args) {
		Banking obj = new Banking();
		BankAccount ba;
		ba =obj.new SavingAccount();
		ba.deposit();
		ba.withdraw();
		ba =obj.new CurrentAccount();
		ba.deposit();
		ba.withdraw();
	}
}
