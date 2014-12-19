package org.javaturk.oop.ch02;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 * <p>
 * For more info please @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * </p>
 */
public class CarTest {
	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.make = "Mercedes";
		car1.model = "C200";
		car1.year = "2012";
		car1.distance = 0;
		car1.speed = 0;
		
		String infoCar1 = car1.getInfo();
		System.out.println("1: " + infoCar1);
		
		car1.accelerate(80);
		car1.go(10);
		
		infoCar1 = car1.getInfo();
		System.out.println("2: " + infoCar1);
		
		car1.accelerate(120);
		car1.go(20);
		
		infoCar1 = car1.getInfo();
		System.out.println("3: " + infoCar1);
		
		
		Car car2 = new Car();
		car2.make = "Ferrari";
		car2.model = "Enzo";
		car2.year = "2012";
		car2.distance = 10;
		car2.speed = 240;
		String infoCar2 = car2.getInfo();
		System.out.println("4: " + infoCar2);
	}
}
