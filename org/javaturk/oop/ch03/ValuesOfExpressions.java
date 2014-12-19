package org.javaturk.oop.ch03;

public class ValuesOfExpressions {

	public static void main(String[] args) {	
		int k = 2147483647;
		
		int i = k + 1;
		System.out.println(i);	
		
		// Not an unreachable code :)
		int a = 10;
		int m;
		if(a < 11)
			m = 7;
		
		System.out.println();
		
//		System.out.println(m);
		
//		else
//			m = 9;
//		
//		System.out.println(m);
	}
}
