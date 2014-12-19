package org.javaturk.oop.ch09.composition;

public class CarTest {
	
	public static void main(String[] args) {
		Car car = new Car("Mercedes Benz", "CLK 200", "2013", 2);
		car.start();
		car.accelerate(100);
		car.go(1000);
		car.stop();
	}
}
