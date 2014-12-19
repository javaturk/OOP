package org.javaturk.oop.ch09.factory;

public class Director extends Manager {
	protected double bonus;
	
	public Director(int no, String name, int year, String workingDepartment, String managingDepartment, double bonus) {
		super(no, name, year, workingDepartment, managingDepartment);
//		System.out.println("in Director");
		this.bonus = bonus;
	}
	
	public void printInfo(){
		System.out.println("\nDirector Info");
		super.printInfo();
	}
}
