package org.javaturk.oop.ch07.memory;

public class Person {
	String tckn;
	String firstName;
	String lastName;
	String address;
	String phone;
	String cellPhone;
	
	public Person(String tckn, String firstName, String lastName, String address, String phone, String cellPhone) {
		this.tckn = tckn;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.cellPhone = cellPhone;
	}
	

	public String getInfo(){
		return "Person Info: " + tckn + " " + firstName + " " + lastName;
	}
}
