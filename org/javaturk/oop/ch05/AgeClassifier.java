package org.javaturk.oop.ch05;

import java.util.Scanner;

public class AgeClassifier {

	private static Scanner in = new Scanner(System.in);
	private static int childCount;
	private static int youngCount;
	private static int middleAgeCount;
	private static int oldCount;

	public static void main(String[] args) {
		System.out.println("This program classifies people based on their ages.");
		System.out.println("Here are the ranges:");
		System.out.println(" 1-12 : Child \n 13-30: Young \n 31-49: Middle age \n 60-  : Old \n");

		while (true) {
			System.out.println("Please enter the age:");
			int age = in.nextInt();
			if ((age <= 0) || (age > 120)) {
				System.out.println("Are you kidding me?");
				break;
			} else if ((1 <= age) & (age <= 12))
				childCount++;
			else if ((13 <= age) & (age <= 30))
				youngCount++;
			else if ((31 <= age) & (age <= 49))
				middleAgeCount++;
			else
				oldCount++;
		}
		System.out.println("Here is the classification:");
		System.out.println("There are " + childCount + " children.");
		System.out.println("There are " + youngCount + " young people.");
		System.out.println("There are " + middleAgeCount + " middle age people.");
		System.out.println("There are " + oldCount + " old people.");
	}
}
