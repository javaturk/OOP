package org.javaturk.oop.ch07.init;

public class InitializationOrder {
	static A a = new A();
	public InitializationOrder() {
		System.out.println("in InitializationOrder");
	}
	public static void main(String args[]) {
//		System.out.println("in main");
		InitializationOrder oi = new InitializationOrder();
//		new InitializationOrder();
//		new InitializationOrder();
//		new InitializationOrder();
//		B b = new B();
//		b.f();	
	}
	C c = new C();
	static int[] ints = new int[10];
	static { // If static don't exists, it is not initialized as static
		System.out.println("Initializing the array");
		for (int i = 0; i < ints.length; i++)
			ints[i] = i * 10;
	}
}
class A {
	C c = new C();
	public A() {
		System.out.println("in A");
	}
}
class B {
	public B() {
		System.out.println("in B");
	}
	public void f() {
		System.out.println("in f()");
	}
}
class C {
	static B b = new B();
	public C() {
		System.out.println("in C");
	}
	static void g() {
		System.out.println("in g()");
	}
}
