package org.javaturk.oop.ch07;

public class ParameterPassing {

	public void f(A aa) {
		aa.j++;
	}

	public void f(int k) {
		k++;
	}

	public static void main(String[] args) {
		ParameterPassing o = new ParameterPassing();
		
//		Passing a primitive
		int i = 5;
		o.f(i);
		System.out.println(i);
		
//		Passing a reference
		A a = new A();
		System.out.println(a.j);
		o.f(a);
		System.out.println(a.j);
		o.f(a);
	}
}

class A {
	int j = 5;
}
