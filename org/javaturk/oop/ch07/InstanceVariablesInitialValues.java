package org.javaturk.oop.ch07;

public class InstanceVariablesInitialValues {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    String str;
    
    void print() {
        System.out.println(
        "Data type      Initial value\n" +
        "boolean        " + t + "\n" +
        "char           [" + c + "] "+ (int)c +"\n"+
        "byte           " + b + "\n" +
        "short          " + s + "\n" +
        "int            " + i + "\n" +
        "long           " + l + "\n" +
        "float          " + f + "\n" +
        "double         " + d + "\n" +
        "String         " + str);
    }
    
    public static void main(String[] args) {
//		new InstanceVariablesInitialValues().print();
    	
//    		int i;
//    		System.out.println(i);
		
		InstanceVariablesInitialValues nesne = new InstanceVariablesInitialValues();
		nesne.print();
	}
}
