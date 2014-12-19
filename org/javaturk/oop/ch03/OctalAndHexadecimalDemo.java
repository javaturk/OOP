package org.javaturk.oop.ch03;

public class OctalAndHexadecimalDemo {


	public static void main(String[] args) {

		int sayi1 = 0132;
		int sayi2 = 0x5a;

		System.out.println(sayi1 + " " + sayi2);
		
		int sayi3 = sayi1 + sayi2;
		int sayi4 = sayi1 * sayi2;
		
		System.out.println(sayi3);
		System.out.println(sayi4);
	}
}
