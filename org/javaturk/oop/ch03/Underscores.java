package org.javaturk.oop.ch03;

public class Underscores {

	public static void main(String[] args) {

		int anInt = 10_000_000;
		System.out.println(anInt);
		
		int anotherInt = 10_00_00;
		System.out.println(anotherInt);
		
		int otherInt = 10__0_0____0_0;
		System.out.println(otherInt);
		
		int otherInt2 = 1________0;
		System.out.println(otherInt2);
		
		int otherInt3 = 0________0;
		System.out.println(otherInt3);

		long aLong = 2_147_483_648L;
		System.out.println(aLong);
		
		float aFloat = 3.14_15F;
		System.out.println(aFloat);
		
		double aDouble = 3.1_4_1_5;
		System.out.println(aDouble);
		
		
//		int otherInt2 = 10__0_0____0_0_;
//		int otherInt2 = _10__0_0____0_0;
		int otherInt6 = 10________0;
		int otherInt5 = 010________0;
		int otherInt4 = 10________0;

		int aBinary = 0b0001_1100__0011_0111__0010_1011__1010_0011;
		System.out.println(aBinary);
		
		System.out.println(Integer.parseInt("00011100001101110010101110100011", 2));

	}
}
