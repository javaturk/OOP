/* Ch 8
 * SuperExample.java
 */

package org.javaturk.oop.ch09.inheritance;

public class SuperExample {
    public static void main(String args[]){
        EE e = new EE();
        System.out.println(e.x);
        e.print1();
        
        FF f = new FF();
        System.out.println(f.x);
        f.print1();
        
        f.print2();
    }
}

class EE{
    int x = 10;
    public void print1(){ System.out.println("My name is EE");}
}

class FF extends EE{
    int x = 20;
    public void print1(){ System.out.println("My name is FF");}
    public void print2(){ System.out.println(super.x); super.print1();}
}
