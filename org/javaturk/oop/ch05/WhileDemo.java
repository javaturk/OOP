/* Ch 5
 * WhileLoop.java
 */

package org.javaturk.oop.ch05;

public class WhileDemo {
    public static void main(String[] args) {
    	
        double r = Math.random();
        
        while(r < 0.8d) {
            r = Math.random();
            System.out.println(r);
        }
    }
}
