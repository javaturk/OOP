package org.javaturk.oop.ch07.tree;

public class TreeWithArgumentConstructor {

	private String type;
	private float height;

	public TreeWithArgumentConstructor(String newType, float newHeight) {
		type = newType;
		height = newHeight;
//		System.out.println("TreeWithArgumentConstructor(String newType, float newHeight)");
	}
	
	public TreeWithArgumentConstructor() {
		
//		this("Pine", 1.0f);
		
		type = "Pine";
		height = 1.0f;
		
		System.out.println("Type: " + type);
		System.out.println("Height: " + height);
//		System.out.println("TreeWithArgumentConstructor");
	}

	public void printInfo(){
		System.out.println("\nTreeWithArgumentConstructor Info:");
		System.out.println("Type: " + type);
		System.out.println("Height: " + height);
	}
	
	public static void main(String[] args) {
		TreeWithArgumentConstructor tree1 = new TreeWithArgumentConstructor("Pine", 2.0f);
		tree1.printInfo();

		TreeWithArgumentConstructor tree2 = new TreeWithArgumentConstructor("Oak", 5.5f);
		tree2.printInfo();
		
		TreeWithArgumentConstructor tree3 = new TreeWithArgumentConstructor();
		tree3.printInfo();
	}
}
