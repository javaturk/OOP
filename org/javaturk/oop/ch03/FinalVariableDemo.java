package org.javaturk.oop.ch03;

public class FinalVariableDemo {

	public static void main(String[] args) {

		final int i = 8;
		//System.out.println(i);
		
//		Illegal
//		i = 7;
//		i = 9;
		
//		Following is not illegal
		final long l;
		
		l = 7;
		System.out.println(l);
//		l = 6;
	}
}
