/* Ch 5
 * ForExample.java
 */

package org.javaturk.oop.ch05;

public class ForDemo {

	public static void main(String[] args) {

		for (int i = 1, j = i + 10; (i < 5 & j > 2); i++, j = i * 2) {
			System.out.println("i= " + i + " j= " + j);
		}

		int t = 7;
		for (; t < 8; t += 2) {
			System.out.print(t + "*");
		}
		System.out.println(t);

		//
		for (int k = 8; k < 8; k++) {
			System.out.println(k);
		}
		//Following for is ok but causes dead code.
		int i = 0;
		for (;;) {
			System.out.println(i);
			if (true)
				break;
			i++; // This is dead code.
		}
	}
}
