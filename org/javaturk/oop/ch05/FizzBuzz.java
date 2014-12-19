package org.javaturk.oop.ch05;

import java.util.Scanner;

public class FizzBuzz {
	private int constant1 = 3;
	private int constant2 = 5;
	private int multiplesOfConstant1;
	private int multiplesOfConstant2;
	private int multiplesOfMultiplication;
	private int numbers;

	public static void main(String[] args) {
		FizzBuzz fb = new FizzBuzz();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the upper limit: ");
		int limit = sc.nextInt();
//		fb.printFizzBuzzWithMod(limit);
//		fb.printFizzBuzzWithMultiples1(limit);
		fb.printFizzBuzzWithMultiples2(limit);
	}

	public void printFizzBuzzWithMod(int k) {
		// In case this method runs after the other method
		multiplesOfConstant1 = 0;
		multiplesOfConstant2 = 0;
		multiplesOfMultiplication = 0;
		numbers = 0;

		long start = System.currentTimeMillis();
		for (int i = 1; i <= k; i++) {
			if (i % constant1 == 0 && i % constant2 == 0) {
//				System.out.println("FizzBuzz");
				multiplesOfMultiplication++;
			} else if (i % constant1 == 0) {
//				System.out.println("Fizz");
				multiplesOfConstant1++;
			} else if (i % constant2 == 0) {
//				System.out.println("Buzz");
				multiplesOfConstant2++;
			} else {
//				System.out.println(i);
				numbers++;
			}
		}
		long end = System.currentTimeMillis();
		printCounts();
		System.out.println("Time: " + (end - start) + " ms.");
	}

	public void printFizzBuzzWithMultiples1(int k) {
		int iteratonLimit = (int)(k/constant1);
		// In case this method runs after the other method
		multiplesOfConstant1 = 0;
		multiplesOfConstant2 = 0;
		multiplesOfMultiplication = 0;
		numbers = 0;
		
		long start = System.currentTimeMillis();
		String[] fizzbuzz = new String[k];
		// First fill the array with numbers up to k
		for (int i = 0; i < k; i++)
			fizzbuzz[i] = new Integer(i + 1).toString();

		for (int i = 1; i <= iteratonLimit; i++) {
			// For multiples of 3
			int u = i * 3;
			if (!fizzbuzz[u - 1].equals("FizzBuzz")){
				fizzbuzz[u - 1] = "Fizz";
				multiplesOfConstant1++;
			}

			// For multiples of 5
			int v = i * constant2;
			if (v <= k && !fizzbuzz[v - 1].equals("FizzBuzz")){
				fizzbuzz[v - 1] = "Buzz";
				multiplesOfConstant2++;
			}

			// For multiples of 3*5
			int w = i * constant1 * constant2;
			if (w <= k){
				fizzbuzz[w - 1] = "FizzBuzz";
				multiplesOfMultiplication++;
			}
		}
		long end = System.currentTimeMillis();



//		for (String string : fizzbuzz) {
//			System.out.println(string);
//			if (string.equals("Fizz"))
//				multiplesOfConstant1++;
//			else if (string.equals("Buzz"))
//				multiplesOfConstant2++;
//			else if (string.equals("FizzBuzz"))
//				multiplesOfMultiplication++;
//			else
//				numbers++;
//		}
		printCounts();
		System.out.println("Time: " + (end - start) + " ms.");
	}

	public void printFizzBuzzWithMultiples2(int k) {
		// In case this method runs after the other method
		multiplesOfConstant1 = 0;
		multiplesOfConstant2 = 0;
		multiplesOfMultiplication = 0;
		numbers = 0;
		
		long start = System.currentTimeMillis();
		int[] fizzbuzz = new int[k];
		// First fill the array with numbers up to k
		for (int i = 0; i < k; i++)
			fizzbuzz[i] = 0;

		for (int i = 1; i <= 33; i++) {
			// For multiples of 3
			int u = i * 3;
			if (fizzbuzz[u - 1] != 3){
				fizzbuzz[u - 1] = 3;
				multiplesOfConstant1++;
			}

			// For multiples of 5
			int v = i * constant2;
			if (v <= k && fizzbuzz[v - 1] != 5){
				fizzbuzz[v - 1] = 5;
				multiplesOfConstant2++;
			}

			// For multiples of 3*5
			int w = i * constant1 * constant2;
			if (w <= k){
				fizzbuzz[w - 1] = 15;
				multiplesOfMultiplication++;
			}
		}
		long end = System.currentTimeMillis();



//		for (String string : fizzbuzz) {
//			System.out.println(string);
//			if (string.equals("Fizz"))
//				multiplesOfConstant1++;
//			else if (string.equals("Buzz"))
//				multiplesOfConstant2++;
//			else if (string.equals("FizzBuzz"))
//				multiplesOfMultiplication++;
//			else
//				numbers++;
//		}
		printCounts();
		System.out.println("Time: " + (end - start) + " ms.");
	}

	public void printCounts() {
		System.out.println("Multiples of" + constant1 + ": " + multiplesOfConstant1);
		System.out.println("Multiples of" + constant2 + ": " + multiplesOfConstant2);
		System.out.println("Multiples of" + constant1 * constant2 + ": " + multiplesOfMultiplication);
		System.out.println("Others: " + numbers);
	}
}
