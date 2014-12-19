/* Ch 8
 * OrderOfConstructorCalls1.java
 */

package org.javaturk.oop.ch09.initialization;

public class InitializationOrder extends B1 {
	private static ZZ zz = new ZZ();
	private YY yy = new YY();

	public InitializationOrder() {
		System.out.println("InitializationOrder constructor");
	}

	public static void main(String[] args) {
//		InitializationOrder x = new InitializationOrder();
	}
}

class A1 {
	private static YY yy = new YY();
	A1() {
		System.out.println("A1 constructor");
	}
}

class B1 extends A1 {
	private ZZ zz = new ZZ();
	B1() {
		System.out.println("B1 constructor");
	}
}

class YY {
	public YY() {
		System.out.println("in YY");
	}
}

class ZZ {
	public ZZ() {
		System.out.println("in ZZ");
	}
}