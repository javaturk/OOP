/* Ch 5
 * SwitchDemo.java
 */

package org.javaturk.oop.ch05;

import java.util.Scanner;

public class SwitchDemo {
    
    public static void main(String[] args) {
    	System.out.println("A number :");
		Scanner stdin = new Scanner(System.in);
		int month = stdin.nextInt();

//		final int i = 8;
//		final int i =8;
		
        switch (month) {
            case 1:  System.out.println("January"); break;
            case 2:  System.out.println("February"); break;
            case 3:  System.out.println("March"); break;
            case 4:  System.out.println("April"); break;
            case 5:  System.out.println("May"); break;
            case 6:  System.out.println("June"); break;
            case 7:  System.out.println("July"); break;
            case 8:  System.out.println("August"); break;
            case 9:  System.out.println("September"); break;
            case 10: System.out.println("October"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December"); break;
            default: System.out.println("Error! Please enter the month number between 1 and 12"); break;
        }
    }
}


