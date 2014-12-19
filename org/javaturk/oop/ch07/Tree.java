package org.javaturk.oop.ch07;

public class Tree {
	int height;
	String type;

	public Tree() {
		System.out.println("Planting a seedling. Height: " + this.height);

	}

	public Tree(int height, String type) {
		this.height = height * 2;
		System.out.println("Creating a new Tree that is " + this.height + " meter tall");

	}

	public static void main(String args[]) {
		Tree t = new Tree();
		
		System.out.println("Height: " + t.height + "m.");
		
		for (int i = 0; i < 5; i++) {
			t = new Tree(i, "Cam");
			System.out.println("Height: " + t.height + "m.");
		}
		
		System.out.println("Height: " + t.height + "m.");
	}

}
