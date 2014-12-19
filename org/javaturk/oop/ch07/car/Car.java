package org.javaturk.oop.ch07.car;

public class Car {
	String make;
	String model;
	String year;
	int speed;
	int distance;
	Person owner;
	
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
