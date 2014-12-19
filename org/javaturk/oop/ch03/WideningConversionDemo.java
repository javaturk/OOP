/* Ch 3
 * WideningConversionDemo.java
 */

package org.javaturk.oop.ch03;

public class WideningConversionDemo {  
    
    public static void main(String args[]){        
        byte  b =  126;
        short s = 1000;
        char  c = 65;
        int i = 2147483647;
        long l;
        float f = 3.14f;
        double d;
        /*
        c = b;  // compile error: possible loss of precision
        c = s;  // compile error: possible loss of precision
        i = d;  // compile error: possible loss of precision*/
        s = b;
        l = i;
//        Loss of precision
        f = i;
        System.out.println(f);
        
        l = i + 1;
//      Loss of precision
        f = l;
        System.out.println(f);
        d = f; 
        i = c;
    }
}
