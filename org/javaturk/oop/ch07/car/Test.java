package org.javaturk.oop.ch07.car;

public class Test {

	public static void main(String[] args) {
		Person person = new Person();
		person.tckn = "1";
		person.firstName = "Zeynep";
		person.lastName = "Kaya";
		// Following gives NullPointerException
//		String personInfo = person.getInfo();
//		System.out.println(personInfo);
		
		Car car = new Car();
		car.make = "Mercedes";
		car.model = "E200";
		car.year = "2011";
		car.speed = 80;
		car.distance = 3;
		
		car.owner = person;
		person.car = car;
		
		car.speed = 100;
		car.go(10);
		System.out.println(car.getInfo());
		System.out.println(person.getInfo());
	}
}
