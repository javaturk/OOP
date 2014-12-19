package org.javaturk.oop.ch07.car;

public class Person {
	String tckn;
	String firstName;
	String lastName;
	Car car;
	
	public String getInfo(){
		return "Person Info: " + tckn + " " + firstName + " " + lastName + " and has a car: " + car.getInfo();
	}
}
