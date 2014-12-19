package org.javaturk.oop.ch07.thisKeyword.bank;

public class Bank {


	public static void main(String[] args) {
		Customer c1 = new Customer(1, "Fatma Sen");
		Account acc1 = new Account(1, 1000.0, c1);
		
//		How to get rid of this line. Because programmers keep forgeting it
//		causing NullPointerException
//		c1.account = acc1;

//		How to make following call safe?
		c1.printInfo();
	}
}
