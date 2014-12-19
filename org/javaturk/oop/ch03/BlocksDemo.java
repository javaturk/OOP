package org.javaturk.oop.ch03;

public class BlocksDemo {
	
	long l;
	
	// Declaration block
	{
		boolean b;
	}

	// Initialization block
	{
		l = 17L;
	}

	// Definition block
	{
		int i = 6;
	}

	// Method block
	public static void main(String[] args) {
		BlocksDemo bd = new BlocksDemo();
		System.out.println(bd.l);
		
		{
			int t = 5;
			System.out.println(t);
		}

	}
	
	// Inner class block
	class InnerClass{}
	
	// Method block
	public void f(){
		
		// Local class block
		new BlocksDemo(){
			public void sop() {
				System.out.println(l);
			}
		};
	}

}
