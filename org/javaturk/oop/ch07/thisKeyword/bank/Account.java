package org.javaturk.oop.ch07.thisKeyword.bank;

public class Account {
	int no;
	double balance;
	Customer owner;
	
	public Account(int no, double balance, Customer owner) {
		this.no = no;
		this.balance = balance;
		this.owner = owner;
		
//		Call Customer's setAccount method here to make sure that Customer know her account.
//		owner.setAccount(this);
		
//		printInfo();
	}

	public void printInfo() {
		System.out.println("Account [no=" + no + ", balance=" + balance + "]");
	}		
}
