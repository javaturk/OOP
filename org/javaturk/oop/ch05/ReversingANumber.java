package org.javaturk.oop.ch05;

import java.util.Scanner;

public class ReversingANumber {
	private static Scanner in;
	
	public static void main(String[] args) {
		System.out.println("This program reverses the number you enter.");
		System.out.println("Please enter a natural number that has digits between 2 and 9.");
		while (true) {
			int number = 0;
			String numberString = null;
			in = new Scanner(System.in);
				numberString = in.next();
				if(numberString.equalsIgnoreCase("X"))
					break;
				try {
					number = Integer.parseInt(numberString);
			} catch (NumberFormatException e) {
				System.out.println("Please enter a number thas at least two digits and at most 9 digits:");
				continue;
			}
			
			numberString = String.valueOf(number);
			int length = numberString.length();
			if((length < 2) || (length > 9) || number < 0){
				System.out.println("Please enter a positive number thas at least two digits and at most 9 digits:");
				continue;
			}
			
			StringBuilder sb = new StringBuilder(length);
			for(int i = length-1; i >= 0; i--){
				sb.append(numberString.charAt(i));
			}
			String reversedNumberString = sb.toString();
			System.out.println("Number you entered: " + numberString);
			System.out.println("Reverse of your number: " + reversedNumberString);
			System.out.println("\nPlease enter a natural number that has digits between 2 and 9.");
		}
		in.close();
	}
}
