/* Ch 8
 * InheritanceExample.java
 */

package org.javaturk.oop.ch09.inheritance;

public class InheritanceExample extends ParentClass1 {
	int u;

	public void g() {
		System.out.println("g in IE");
	}

	public static void main(String args[]) {
		ParentClass1 pc = new ParentClass1();
		pc.f();
		pc.t = 6;

		InheritanceExample ie = new InheritanceExample();
		ie.u = 7;
		ie.f();
		ie.g();
		System.out.println("x is " + ie.x);
		System.out.println("y is " + ie.y); // Only when they are in the same
											// package
		System.out.println("t is " + ie.t);
		// System.out.println("z is " + ie.z); // Does not compile
	}

}
