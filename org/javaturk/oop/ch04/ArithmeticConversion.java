package org.javaturk.oop.ch04;

public class ArithmeticConversion {
	public static void main(String[] args) {
		byte b1 = 5;
		byte b2 = 8;
		// byte b3 = b1 * b2; // compile error: possible loss of precision
		byte b3 = (byte) (b1 * b2); // OK
		System.out.println(b3);

		int i = 12;
		double d = 8.524431;
//		 int k = i * d; // compile error: possible loss of precision
		int k = (int) (i * d);
		System.out.println(k);

		short s1 = 187;
		short s2 = 8;
		// short s3 = s1 % s2;
		int s3 = s1 % s2;
		System.out.println(s3);
		
		byte b4 = 8;
		byte b5 = (byte) -b4;
		//-b4;

		// Compound assignments
		i = 5;

		i = i + 3; // i şimdi 8
		i += 3; // i şimdi 11
		System.out.println(i);

		i -= 4; // i şimdi 7;
		System.out.println(i);
		i *= 2; // i şimdi 14
		i /= 7; // i şimdi 2
		System.out.println(i);
	}
}
