
package org.javaturk.oop.ch05;

public class StringInSwitchDemo {

	public static void main(String[] args) {
		String dayInEnglish = args[0];
		
		final String s = "sunday";
		
		switch(dayInEnglish){
			case "monday":		System.out.println("Pazartesi"); break;
			case "tuesday":		System.out.println("Sali"); break;
			case "wednesday":	System.out.println("Çarsamba"); break;
			case "thursday":	System.out.println("Persembe"); break;
			case "friday":		System.out.println("Cuma"); break;
			case "saturday":	System.out.println("Cumartesi"); break;
			case s:				System.out.println("Pazar"); break;
		}
	}
}
