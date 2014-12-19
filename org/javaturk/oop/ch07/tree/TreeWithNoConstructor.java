package org.javaturk.oop.ch07.tree;

public class TreeWithNoConstructor {
	private String type;
	private float height;
	
	public void printInfo(){
		System.out.println("\nTreeWithNoConstructor Info:");
		System.out.println("Type: " + type);
		System.out.println("Height: " + height);
	}

	public static void main(String[] args) {
		TreeWithNoConstructor tree = new TreeWithNoConstructor();
		tree.printInfo();
		tree.type = "Oak";
		tree.height = 8.74f;
		tree.printInfo();
	}
}
