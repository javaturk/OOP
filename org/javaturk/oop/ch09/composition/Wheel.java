package org.javaturk.oop.ch09.composition;

class Wheel {
	private String name;
	
	public Wheel(String name) {
		this.name = name;
		System.out.println("A wheel is created: " + name);
	}
	
	public void rotate(){
		System.out.println("Wheel is rotating.");
	}
}
