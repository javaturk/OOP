package org.javaturk.oop.ch07.tree;

public class TreesWithoutReferences {
	private String type;
	private float height;

	public TreesWithoutReferences(String newType, float newHeight) {
		System.out.println("in TreesWithoutReferences");
		type = newType;
		height = newHeight;
	}

	public static void main(String[] args) {
		
		TreesWithoutReferences t = new TreesWithoutReferences("Pine", 5.0f);
//		t = null;
		
		System.out.println("Height: " + t.height + " m.");

		for (int i = 0; i < 5; i++) {
			t = new TreesWithoutReferences("Pine", i);
			System.out.println("Height: " + t.height + " m.");
		}

		System.out.println("Height: " + t.height + " m.");

		new TreesWithoutReferences("Pine", 5);
	}
}
