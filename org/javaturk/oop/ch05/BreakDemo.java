/* Ch 5
 * Breakdemo.java
 */

package org.javaturk.oop.ch05;

public class BreakDemo {

	public static void main(String args[]) {
		for (int i = 1; i <= 5; ++i) {
			if (i == 4)
				break; // Terminate loop. Control to ***
			System.out.println(i + "\t" + Math.sqrt(i));
		} // end of for loop
		System.out.println("I'm here.");
	} // ***
}
