/* Ch 4
 * UnaryPromotion.java
 */

package org.javaturk.oop.ch04;

public class UnaryOperators {

	public static void main(String args[]) {
		unaryPromotion();
		// autoIncDec();
		// weirdBehavior();
	}

	public static void weirdBehavior() {
		// For a good explanation:
		// http://skeletoncoder.blogspot.com/2006/09/java-tutorials-i-i.html and
		// http://forums.devx.com/archive/index.php/t-27360.html
		int i = 0;
		// i = i++ + 2;
		i = i++;
		System.out.println("i: " + i);

		// int j = i++;
		// System.out.println("i: " + i);
		// System.out.println("j: " + j);
		//
		// int k = i++;
		// System.out.println("i: " + i);
		// System.out.println("k: " + j);
	}

	public static void autoIncDec() {
		int i = 1;
		prt("i   : \t" + i);
		prt("++i : \t" + ++i); // Pre-increment
		prt("i++ : \t" + i++); // Post-increment
		prt("i   : \t" + i);
		prt("--i : \t" + --i); // Pre-decrement
		prt("i-- : \t" + i--); // Post-decrement
		prt("i   : \t" + i);
	}

	public static void unaryPromotion() {
		byte b1 = 18;
		short s1 = 44;
		byte b2 = ++b1; // OK. No need to implicitly cast
		short s2 = --s1; // OK. No need to implicitly cast
		System.out.println("b2: " + b2);
		System.out.println("s2: " + s2);

		// -b1; // compile error: not a statement
		// byte b3 = -b1; // compile error: possible loss of precision
		byte b3 = (byte) -b1;
		// byte b4 = +b2; // compile error: possible loss of precision

		long l = 5;
		l = -l;
		System.out.println(l);

		boolean isTrue = true;
		isTrue = !isTrue;
		// !isTrue; // compile error:
	}

	static void prt(String s) {
		System.out.println(s);
	}
}
