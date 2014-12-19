/* Ch 5
 * BreakWithLabelDemo.java
 */

package org.javaturk.oop.ch05;

public class BreakAndContinueWithLabelDemo {

	public static void main(String[] args) {
		int[][] arrayOfInts = { { 32, 87, 3, 589 }, { 12, 1076, 2000, 12 }, { 622, 127, 12, 955 } };
		int searchfor = 12;

		int i = 0;
		int j = 0;
		boolean foundIt = false;

		search: for (; i < arrayOfInts.length; i++) {
			for (j = 0; j < arrayOfInts[i].length; j++) {

				if (arrayOfInts[i][j] == searchfor) {
					foundIt = true;
					System.out.println("Found " + searchfor + " at " + i + ", " + j);
					break search;
				}
			}
		}

		if (!foundIt)
			System.out.println(searchfor + "not in the array");
	}
}
