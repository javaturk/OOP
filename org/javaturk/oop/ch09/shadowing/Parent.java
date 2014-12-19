package org.javaturk.oop.ch09.shadowing;

public class Parent {
	int i = 5;
	
	public void f() {
		System.out.println("f() in Parent");
	}
	
	public static void g(){
		System.out.println("g() in Parent");
	}
}
