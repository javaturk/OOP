package org.javaturk.oop.ch03;

public class PrimitivesDemo {

	public static void main(String[] args) {
		// Variables
		int anInteger = 18;
		boolean bool = false;
		float sin30 = 0.6f;
		double pi = 3.1415;
		char c = 'c';
		char nextLine = '\n';
		System.out.println(anInteger + " " + bool + " " + sin30);
		System.out.print(nextLine);
		System.out.println(pi + " " + c);


		// Naming
		float corporateCustomerSalesAmount;
		boolean isSeatBooked;
		char sex;

		int _count;
		float $amount;
		float €total;

		// Wrong naming
		// float x!;
		// int ?i;
		// boolean new;
		// char {oneCharacter};
		// short shorty-pant;
		// long white\black;

		// Many on one line
		float f;
		double d;
		f = 22 / 7;
		d = 22 / 7;
//		double total = price * tax;
		double price = 10.27, tax = 0.18, total = price * tax;

		// More complex ones
		int hour = 22;
		boolean areLightsOn = hour > 18;
		long distance = returnLong();

		// Exponentials
		double d1 = 1.6e-19;
		float f1 = 6.02E23F;
		System.out.println(d1 + " " + f1);

		// Overflows
		double lowestInt = -Math.pow(2, 31);
		double highestInt = Math.pow(2, 31) - 1;
		System.out.println("Range of int is from " + lowestInt + " to " + highestInt);

		int i = 2147483647;
		int k = 153000;
		int m = i * k;
		System.out.println("m is " + m);

		// byte b = 128;
		// long lo1 = 2147483648;
		long lo2 = 2147483648L;
		
		float lowestfloat = 1.40e-45f;
		float biggestfloat = 3.4028235e38f;
		System.out.println(lowestfloat + " - " + biggestfloat);
		
		double lowestDouble= 4.9e-323;  //1.40129846432481707e-45
		double biggestDouble = 1.7976931348623158e308;
		System.out.println(lowestDouble + " - " + biggestDouble);
		
		/*
		double lowestDouble1 = -Math.pow(2, 63);
		double highestDouble = Math.pow(2, 63) - 1;
		System.out.println("Range of double is from " + lowestDouble1 + " to " + highestDouble);
		*/
	}

	public static long returnLong() {
		return 5L;
	}
}
