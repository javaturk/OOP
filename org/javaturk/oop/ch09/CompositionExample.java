
package org.javaturk.oop.ch09;

public class CompositionExample {
	public static void main(String args[]) {
		new Bicycle();
	}
}

class Bicycle {
	private Wheel frontWheel;
	private Wheel rearWheel;
	private Seat seat;
	private Cadence cadence;

	public Bicycle() {
		frontWheel = new Wheel();
		rearWheel = new Wheel();
		seat = new Seat();
		cadence = new Cadence();
		System.out.println("A bicycle is created");
	}
	
	public void go(){
		if(cadence == null)
			cadence = new Cadence();
		cadence.drive();
	}
}

class Wheel {
	public Wheel() {
		System.out.println("A wheel is created");
	}
}

class Seat {
	public Seat() {
		System.out.println("A seat is created");
	}
}

class Cadence {
	public Cadence() {
		System.out.println("A cadence is created");
	}
	
	public void drive(){
		System.out.println("Cadence is driving!");
	}
}
