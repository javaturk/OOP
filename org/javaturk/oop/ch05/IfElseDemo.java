/* Ch 5
 * Grade.java
 */

package org.javaturk.oop.ch05;

public class IfElseDemo {
    
    public static void main(String[] args) {
    	
        String testscore = args[0];
        int score = (new Integer(testscore)).intValue();
        
        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {	// Comment out this else see what happens to grade variable
            grade = 'F';
        }
        System.out.println("Your grade = " + grade);
   
        boolean i;
        
        if(i = 63 > 6)
        		System.out.println("true");
    }
}
