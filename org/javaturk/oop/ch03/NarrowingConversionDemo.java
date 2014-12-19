/* Ch 3
 * NarrowingConversion.java
 */

package org.javaturk.oop.ch03;

public class NarrowingConversionDemo {

	public static void main(String args[]) {
		byte b = 0;
		short s = 1000;
		char c;
		int i = 100;
		long l = 10000000000l;
		float f = 65.999999f;
		double d = 3.14353459485483d;

		// b = s; // compile error: possible loss of precision
		// c = i; // compile error: possible loss of precision
		// f = d; // compile error: possible loss of precision
//		System.out.println(f);

		b = (byte) s;
		System.out.println("s: " + s + "\t\tb: " + b);
		i = (int) l;
		System.out.println("l: " + l + "\t\ti: " + i);
		i = (int) f;
		System.out.println("f: " + f + "\t\ti: " + i);
		l = (long) f;
		System.out.println("f: " + f + "\t\tl: " + l);
		f = (float) d;
		System.out.println("d: " + d + "\t\tf: " + f);
		c = (char) i;
		System.out.println("i: " + i + "\t\tc: " + c);
		i = (int) d;
		System.out.println("i: " + i + "\t\td: " + d);
	}
}
