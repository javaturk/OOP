package org.javaturk.oop.ch09.shadowing;

public class StaticOverridingExample {

	public static void main(String[] args) {
		Parent.g();
		Child.g();
		
//		Parent p = new Child();
//		p.g();
	}

}
