package org.javaturk.oop.ch09.shadowing;

public class Child extends Parent {
	int i = 6;

	public void f() {
		System.out.println("f() in Child");
	}
	
	public static void g(){
		System.out.println("g() in Child");
	}

	public void printInfo() {
		System.out.print("\nInfo: ");
		System.out.println(i);
	}
}
