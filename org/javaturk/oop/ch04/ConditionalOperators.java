/* 
 * ConditionalOperators.java
 * 
 * This example shows conditional operators & and | and their shortcuts && and ||.
 * See the effects of shortcuts.
 */

package org.javaturk.oop.ch04;

public class ConditionalOperators {

	public static void main(String args[]) {
		
		boolean b1 = true;
		boolean b2 = true;
		boolean b3 = b1 ^ b2;
//		System.out.println(b3);

		if ((getOne() == 7) && (getTwo() == 2)) {
			System.out.println("value1 is 1 AND value2 is 2");
		}
		
		if ((getOne() == 8) || (getTwo() == 1)) {
			System.out.println("value1 is 1 OR value2 is 1");
		}
		
		//Ternary operator
		int i = 8;
		int j = 11;
		int min = (i <= j) ? i : j;
		System.out.println(min);
		
		System.out.println(true ? "true" : "false" );
		System.out.println(false ? "true" : "false" );
		
//		String string1 = "I love Java";
//		String string2 = (string1 == "I love Java") ? string1 : "I love nothing";
		
//		String string2 = (string1.contains("Java".subSequence(0, 3))) ? string1 : "I love nothing";
//		System.out.println(string2);
////		string1 = "I love C# very much";
//		string2 = (string1.contains("Java".subSequence(0, 3))) ? string1 : "I love nothing";
//		System.out.println(string2);
		
		String string1 = "I love Java very much";
		String string2 = (string1.matches(".*Java.*")) ? string1 : "I love nothing";
		System.out.println(string2);
		
		if(string1.matches(".*Java.*"))
			string2 = string1;
		else
			string2 = "I love nothing";
		System.out.println(string2);
		
//		(i<j) ? System.out.println(i) : System.out.println(j); // Can't do this.
	}

	public static int getOne() {
		System.out.println("In getOne()");
		return 8;
	}

	public static int getTwo() {
		System.out.println("In getTwo()");
		return 9;
	}
}
