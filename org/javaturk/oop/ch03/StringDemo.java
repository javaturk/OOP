package org.javaturk.oop.ch03;

public class StringDemo {

	public static void main(String[] args) {

		String s1 = new String("http://www.JavaTurk.org");
		String s2 = new String("http://java.sun.com");
		
		System.out.println(s1 + " \t " + s2); 
		
		String tmp = s1;
		s1 = s2;
		s2 = tmp;
		
		System.out.println(s1 + " \t " + s2);
		
		s2.concat(" naber?");
		
		System.out.println(s1 + " \t " + s2);
//		
//		s1'i null yapınca sonraki iki satırda neler olur?
		s1 = null;
		System.out.println(s1);
		System.out.println(s1.charAt(0));
	}
}
