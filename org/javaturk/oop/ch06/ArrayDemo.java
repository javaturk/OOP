/* Ch 7
 * ArrayExample.java
 */

package org.javaturk.oop.ch06;

import java.util.Random;

public class ArrayDemo {

	int[] intArray = new int[10];
	Pizza[] pizzalar = new Pizza[3];
	boolean[] flags = { true, false };

	public ArrayDemo() {
		
		for (int i = 0; i < intArray.length; i++) {
			Random r = new Random();
			int randomInt = r.nextInt();
			int sayi = randomInt % 100;
			intArray[i] = sayi;
		}
		
//		foreach
//		for(int a:intArray){
//			Random r = new Random();
//			int randomInt = r.nextInt();
//			int sayi = randomInt % 100;
//			a = sayi;
//		}

		pizzalar[0] = new Pizza("Peynirli");
		pizzalar[1] = new Pizza("Sucuklu");
		pizzalar[2] = new Pizza("Sebzeli");
	}

	public static void main(String args[]) {
		(new ArrayDemo()).print();
	}

	public void print() {
		System.out.println("Fifth element of intArray is " + intArray[5]);
		System.out.println("First element of flags is " + flags[0]);
		System.out.println("Name of the last element of pizzalar is " + pizzalar[2].name);

		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
		
//		foreach
		for(int a:intArray)
			System.out.print(a + " ");
		
		System.out.println();
		
//		long index can't be used
//		long l = 5;
//		Pizza pizza = pizzalar[l]; 
		
//		Negative index causes ArrayIndexOutOfBoundsException
//		int i = -2;
//		Pizza pizza = pizzalar[i];
		
		short s = 2;
		Pizza pizza = pizzalar[s];
		System.out.println(pizza.name);
	}
}

class Pizza {
	String name;

	Pizza(String name) {
		this.name = name;
	}
}
