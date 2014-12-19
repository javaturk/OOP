package org.javaturk.oop.ch03;

public class NumericLiteralsWithUnderscores_7 {

	public static void main(String[] args) {
		
		// This is binary literal starting with 0b or 0B
		byte byte1 = 0b0000_1111;
		System.out.println(byte1);
		
		byte byte2 = 0B0000_1111;
		System.out.println(byte2);
		
		int b1 = 0b111001001001;
		System.out.println(b1);
		
		int b2 = 0B1110_0100_1001;
		System.out.println(b2);
		
		short aShort = (short)0b1010_0001_0100_0101;
		System.out.println(aShort);

		int anInt = 10_000_000;
		System.out.println(anInt);

		long aLong = 2_147_483_648L;
		System.out.println(aLong);

		int intBinary = 0b0001_1100__0011_0111__0010_1011__1010_0011;
		System.out.println(intBinary);
		
		System.out.println(Integer.parseInt("00011100001101110010101110100011", 2));
	
		long longBinary = 0b1111_0001_1100__0011_0111__0010_1011__1010_0011L;
		System.out.println(longBinary);
		
		System.out.println(Long.parseLong("111100011100001101110010101110100011", 2));
	}

}
