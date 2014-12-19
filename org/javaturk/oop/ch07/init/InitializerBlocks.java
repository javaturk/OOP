package org.javaturk.oop.ch07.init;

public class InitializerBlocks {

	// Compiler error! Use block instead
	int i;
	{
		i = 8;
	}

	int j;
	boolean b1;

	{
		System.out.println("Instance initializer");
		j = 8;
		b1 = true;
	}

	// Initialization by method a call
	boolean b2 = initializeBoolean(); // Can't initialize b1 this way using a
										// method call!s

	static double k;
	// k = 5.0;
	static char c;

	static {
		System.out.println("Static initializer");
		k = 5.0;
		c = 'c';
	}

	// Can't do this
	// static boolean[] b;
	//
	// static{
	// b = {true, true, false};
	// }

	 static int[] ints = new int[10];

	// If static don't exists, it is not initialized as static
	// Look what happens when you intentionally throw an exception in this
	// block.
	static  {
		System.out.println("\nInitializing the array");
		for (int i = 0; i < ints.length; i++)
			ints[i] = i * 10;
	}

	// No purpose of doing this because it is local to the block.
	{
		int m = 8;
	}


	public static void main(String[] args) {
		for (int i : ints)
			System.out.print(i + " ");

		System.out.println();

		
		//
		// System.out.println("Array: ");
		// for(int i:ints)
		// System.out.print(i + " ");

//		new InitializerBlocks();

	}

	public boolean initializeBoolean() {
		return true;
	}
}
