package org.javaturk.oop.ch03;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please @see <a
 *         href="http://www.javaturk.org">http://www.javaturk.org</a>
 *         </p>
 * 
 *         This is an example that shows how variables of different types are
 *         declared, initialized and defined.
 */
public class VariablesDemo {

	public static void main(String[] args) {

		// Declaring a variable
		int i;
		boolean b;
		String s1;
		// Do not use a variable before defining it!
		// System.out.println(i + " " + b + " " + s1);

		// Initializing a variable
		i = 8;
		b = false;
		s1 = "javaTurk.org";

		// After they are defined and we can use them.
		System.out.println(i + " " + b + " " + s1);

		// Defining a variable
		int j = 18;
		float sin30 = 0.6f;
		String s2 = new String("Selam :)");
		System.out.println(j + " " + sin30 + " " + s2);
	}
}
