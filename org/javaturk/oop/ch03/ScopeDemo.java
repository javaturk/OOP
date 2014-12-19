package org.javaturk.oop.ch03;

public class ScopeDemo {
	// Instance variable
	private int i = 1;

	public static void main(String[] args) {
		int i = 2;
//		int ii;
		for (; i < 5; i++) {
			System.out.println(i);

			if (i < 3) {
//				Can't say this.
//				int i = 4;
				int ii = 3;
				f(ii);
			} else if (3 < i & i < 12) {
				int ii = 8;
				f(ii);

			} else {
				int ii = 17;
				f(ii);
			}
		}
	}

	// Empty statement
	;

	public static void f(int i) {
//		Can't say this.
//		int i = 4;
		System.out.println(i);
	}
	
	public void ff() {
		System.out.println(i);
	}
}
