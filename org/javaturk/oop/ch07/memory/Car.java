package org.javaturk.oop.ch07.memory;

public class Car {
	String country;
	String usage;
	String make;
	String model;
	String year;
	long speed;
	long distance;
	Person owner;
	
	
	


	public Car(String country, String usage, String make, String model, String year, long speed, long distance,
			Person owner) {
		this.country = country;
		this.usage = usage;
		this.make = make;
		this.model = model;
		this.year = year;
		this.speed = speed;
		this.distance = distance;
		this.owner = owner;
	}

	public void go(int newDistance){
		distance += newDistance;
	}
	
	public void accelerate(int newSpeed){
		speed = newSpeed;
	}
	
	public void stop(){
		speed = 0;
	}
	
	public String getInfo(){
		return "Car Info: " + year + " " + make + " " + model + ". Distance: " + distance + " km. and traveling at " + speed + " kmph.";
	}
}
