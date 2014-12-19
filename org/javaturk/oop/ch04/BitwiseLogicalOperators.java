package org.javaturk.oop.ch04;

public class BitwiseLogicalOperators {

	public static void main(String[] args) {
		int i = 4;
		int j = 8;
		
		int k = i & j;
		System.out.println(k);
		
		k = i | j;
		System.out.println(k);
		
		k = i ^ j;
		System.out.println(k);
		
		long u = 6;
		long v = 2;
		long w = u & v;
		System.out.println(w);
		
		byte m = 6;
		byte n = 2;
		byte l = (byte) (m & n);
		System.out.println(l);
		
		System.out.println(~l);
	}
}
