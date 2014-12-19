package org.javaturk.oop.ch04;

public class OperatorPrecedence {

	public static void main(String[] args) {

		int a = 6;
		int b = 5;
		int c = 10;

		float rs = a + ++b * c / a * b;
		System.out.println("rs :" + rs);

		rs = a + (++b) * ((c / a) * b);
		System.out.println("rs :" + rs);

		a += b += c;
		System.out.println("a: " + a);

		int u = 3;
		// System.out.println("u:" + ++u+u--);
		System.out.println(++u + u--);
		System.out.println("u:" + u);

		int x = 10, y = 7, z = 3;
		System.out.println("x*y%z: " + x * y % z);
		System.out.println("x*y%z: " + x * (y % z));

		boolean b1 = false, b2 = true, b3 = true;
		boolean bool = b1 & b2 | b3;
		System.out.println("bool: " + bool);

		// The + operator is left associative
		System.out.println("Java" + 1 + 6);
		System.out.println(1 + 6 + "Java");
		System.out.println("1" + "6" + "Java");
		System.out.println('1' + '6' + "Java");
		System.out.println("Java" + (1 + 6));
		
		// Parameter evaluation
		String s = "Java";
		print(s, s = "Javaci", s);
	}

	static void print(String a, String b, String c) {
		System.out.println(a + " " + b + " " + c);
	}
}
