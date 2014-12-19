package org.javaturk.oop.ch02;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 * <p>
 * For more info please @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * </p>
 */
public class Car {

	String make;
	String model;
	String year;
	int speed;
	int distance;
	 
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
