package org.javaturk.oop.ch07;

public class StaticDemo {
	static int i = 10;

	public static void main(String args[]) {

		System.out.println(StaticDemo.i);

		StaticDemo.increment();

		System.out.println(StaticDemo.i);

		StaticDemo st1 = new StaticDemo();
		StaticDemo st2 = new StaticDemo();

		// Unethical access :)
		System.out.println(st1.i);
		System.out.println(st2.i);

		// Unethical access :)
		st1.increment();
		st2.increment();

		System.out.println(st1.i);
		System.out.println(st2.i);
		System.out.println(StaticDemo.i);
	}

	static void increment() {
		i++;
	}
}