package org.javaturk.oop.ch05;

public class ListCharactersWithIf {

	public static void main(String[] args) {

		for (char c = 0; c < 256; c++) {
			System.out.print("\t" + (int) c + " : " + c);
			if (c % 10 == 0 & c != 0)
				System.out.print("\n");
		}
	}
}