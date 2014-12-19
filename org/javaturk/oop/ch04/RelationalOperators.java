/* Ch 4
 * BooleanOperators.java
 */

package org.javaturk.oop.ch04;

import java.util.*;

public class RelationalOperators {

	public static void main(String[] args) {

		Random rand = new Random();
		int i = rand.nextInt() % 100;
		int j = rand.nextInt() % 100;

		prt("i = " + i);
		prt("j = " + j);
		prt("i > j is " + (i > j));
		prt("i < j is " + (i < j));
		prt("i >= j is " + (i >= j));
		prt("i <= j is " + (i <= j));
		prt("i == j is " + (i == j));
		prt("i != j is " + (i != j));

		boolean b1 = true;
		boolean b2 = false;
		if (b1 == b2)
			prt("The same");
		else
			prt("Different");
		
		if (b1)
			prt("true!");
		
		String s1 = new String("String");
		String s2 = new String("String");
//		s1 = s2;
		if (s1 == s2)
			prt("The same");
		else
			prt("Different");

	}

	static void prt(String s) {
		System.out.println(s);
	}
}
