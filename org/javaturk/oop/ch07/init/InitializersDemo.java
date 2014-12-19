package org.javaturk.oop.ch07.init;

public class InitializersDemo {

	int minAge = 18;
	static double percentage = 5.8;
	boolean isOpen = isDoorOpen();
	
//	No forward references!
//	int i = j;
//	AA a = new AA(j);
//	int j = 8;
	
//	But following is ok and it may cause a inconsistent state
	
	int i = getJ();
//	{
//		System.out.println("In initialization block.");
//		System.out.println("i: " + i);
//	}
	int j = 8;
	
//	getD must also be static
	static double pi = getPi();

	public static void main(String[] args) {
		InitializersDemo  demo = new InitializersDemo();
		System.out.println("i: " + demo.i);
		System.out.println("isOpen: " + demo.isOpen);
	}

	private static double getPi() {
		return Math.PI;
	}

	private boolean isDoorOpen() {
		return true;
	}
	
	public int getJ(){
		return j;
	}
}

class AA {
	public AA(int i){}
}
