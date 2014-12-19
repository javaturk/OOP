package org.javaturk.oop.ch07.car;


public class TestAttributeOnlyComposite {

	public static void main(String[] args) {
		PersonAttributeOnlyComposite person1 = new PersonAttributeOnlyComposite();
		person1.tckn = "1";
		person1.firstName = "Zeynep";
		person1.lastName = "Kaya";
		
		CarAttributeOnlyComposite car1 = new CarAttributeOnlyComposite();
		car1.make = "Mercedes";
		car1.model = "E200";
		car1.year = "2011";
		car1.speed = 80;
		car1.distance = 3;
		
		car1.owner = person1;
		
		person1.car = car1;
		
		System.out.println("Make of owner1's car: " + person1.car.make);
		System.out.println("First name of car1's owner: " + car1.owner.firstName);
		
		PersonAttributeOnlyComposite person2 = new PersonAttributeOnlyComposite();
		person2.tckn = "2";
		person2.firstName = "Mehmet";
		person2.lastName = "Ozturk";
		
		CarAttributeOnlyComposite car2 = new CarAttributeOnlyComposite();
		car2.make = "Honda";
		car2.model = "Accord";
		car2.year = "2004";
		car2.speed = 120;
		car2.distance = 25;
		car2.owner = person2;
		
		person2.car = car2;
		
		System.out.println("Speed of owner2's car: " + person2.car.speed);
		
		
//		Null part
		PersonAttributeOnlyComposite person3 = new PersonAttributeOnlyComposite();
		person3.tckn = "3";
		person3.firstName = "Berrin";
		person3.lastName = "Temiz";
		person3.car = null;
//		System.out.println("Make of owner3's car: " + person3.car.make);
		
		CarAttributeOnlyComposite car3 = new CarAttributeOnlyComposite();
		car3.make = "Volvo";
		car3.model = "S60";
		car3.year = "2012";
		car3.speed = 0;
		car3.distance = 0;
		car3.owner = null;
		System.out.println();
		
		person1.car = null;
		person3.car = car1;
		car1.owner = person3;	
	}
}
