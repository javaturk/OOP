package org.javaturk.oop.ch09.ObjectClass;

public class ToStringExample {

	public static void main(String[] args) {
		
		Car c1 = new Car(2012, "Mercedes", "CLK200", 450);
		System.out.println(c1);
//		System.out.println(c1.toString());
		System.out.println(c1.hashCode());
		System.out.println(c1.getClass().getName());
		
		Car c2 = new Car(2006, "Skoda", "Fabia", 70);
		System.out.println(c2);
	}
}

class Car{
	int year;
	String brand;
	String model;
	int power;
	
	
	public Car(int year, String brand, String model, int power) {
		super();
		this.year = year;
		this.brand = brand;
		this.model = model;
		this.power = power;
	}	
	
	public String toString() {
		String s = new String();
		s += "Car Info\n";
		s += "Year: " + year + "\n";
		s += "Brand: " + brand + "\n";
		s += "Model: " + model + "\n";
		s += "Power: " + power + " HP \n";
		
		return s;
//		return year + " " + brand + " " + model + " " + power;
	}
}
