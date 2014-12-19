package org.javaturk.oop.ch07.thisKeyword.bank;

public class Customer {
	int no;
	String name;
	Account account;
	
	public Customer(int no, String name, Account account) {
		this.no = no;
		this.name = name;
		this.account = account;
	}
	
	public Customer(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public void printInfo(){
		System.out.println("Customer [no=" + no + ", name=" + name  +"]");
		System.out.print("Account: ");
		account.printInfo();
	}
	
	public void setAccount(Account account){ 
		this.account = account;
	}
}
