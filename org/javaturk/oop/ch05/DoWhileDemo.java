/* Ch 5
 * DoWhileLoop.java
 */

package org.javaturk.oop.ch05;

public class DoWhileDemo {
    public static void main(String[] args) {
    	
        double r = 0;
        
        do {
            r = Math.random();
            System.out.println(r);
        }while(r < 0.8d);
    }
}
