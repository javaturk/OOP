package org.javaturk.oop.ch09.shadowing;

public class ShadowingExample {

	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.i);
		p.f();

		Child c = new Child();
		System.out.println(c.i);
		c.f();
		c.printInfo();
		
//		Parent p1 = new Child();
//		System.out.println(p1.i);
	}
}
