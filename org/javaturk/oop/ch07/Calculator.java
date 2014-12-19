package org.javaturk.oop.ch07;

public class Calculator {
	
	public void whoAreYou(){
		System.out.println("I'm a Calculator :)");
	}

	int add(int first, int second) {
		return first + second;
	}

	int subtract(int first, int second) {
		return first - second;
	}

	int multiply(int first, int second) {
		return first * second;
	}
	
	int multiplyByAdding(int first, int second) {
		int multiplication = 0;
		for(int i = 1; i <= second; i++)
			multiplication += first;
		System.out.println("Multiplication: " + multiplication);
		return multiplication;
	}

	double divide(int first, int second) {
		return (double)first / second;
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.whoAreYou();
		
		int i = calculator.add(12, 27);
		System.out.println("12 + 27 = " + i);
		
		double d = calculator.divide(82, 9);
		System.out.println("82 / 9 = " + d);
		
		System.out.println("83 - 56 = " + calculator.subtract(83, 56));
		System.out.println("8 * 7 = " + calculator.multiply(8, 7));
		
		// Calling it for its side effect
		calculator.multiplyByAdding(22, 5);
	}
}
