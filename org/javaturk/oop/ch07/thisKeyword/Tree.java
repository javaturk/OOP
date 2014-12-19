package org.javaturk.oop.ch07.thisKeyword;

public class Tree {

	private String type;
	private float height;

	public Tree(String type, float height) {
		this.type = type;
		this.height = height;
	}

	public Tree copy() {
		Tree copyTree = new Tree(type, height);
		return copyTree;
//		 return new Tree(type, height);
	}

	public Tree grow() {
		height++;
		return this;
	}

//	No need to use "this" here
	public void printInfo() {
		System.out.println("\nTree Info:");
		this.printType();
		this.printHeight();
	}

//	No need to use "this" here
	public void printType() {
		System.out.println("Type: " + this.type);
	}

//	No need to use "this" here
	public void printHeight() {
		System.out.println("Height: " + this.height);
	}

	public static void main(String[] args) {
		Tree tree = new Tree("Pine", 15.0f);
		tree.printInfo();
		Tree copyTree = tree.copy();
		copyTree.printInfo();

		
		tree.grow().grow().grow().printInfo();
		
		Tree t = tree.grow().grow().grow().grow();
		tree.printInfo();

		
		if(tree == t)
			System.out.println("Aynı");
		else
			System.out.println("Farklı");
		
		if(copyTree == tree)
			System.out.println("Aynı");
		else
			System.out.println("Farklı");
	}
}
