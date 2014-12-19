/* Ch 5
 * Continue.java
 */

package org.javaturk.oop.ch05;

public class ContinueDemo {

	public static void main(String args[]) {
		for (int i = 1; i <= 5; ++i) {
			if (i == 4)
				continue; // Skip the rest for this iteration
			System.out.println(i + "\t" + Math.sqrt(i));
		} // end of for loop
	}
}
