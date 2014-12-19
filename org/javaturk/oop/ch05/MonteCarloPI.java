package org.javaturk.oop.ch05;

import java.util.Scanner;

public class MonteCarloPI {
	public static void main(String[] args) {
		int dotsInCircle = 0;
		System.out.print("Number of points: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		double start = System.currentTimeMillis();
		for(int i = 0; i<n; i++){
			double x = Math.random();
			double y = Math.random();
//			double distance = Math.pow(x, 2) + Math.pow(y,2);
			double distance = x*x + y*y;
			if(distance <= 1.0)
				dotsInCircle++;
		}
		double finish = System.currentTimeMillis();
		
		double seconds = (finish-start)/1000;
		double myPI = (double) 4*dotsInCircle/n;
		System.out.println("My PI is: " + myPI + " and Java's PI is: " + Math.PI);
		System.out.println("Time is: " + seconds);
	}
}
