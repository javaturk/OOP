package org.javaturk.oop.ch09.factory;

public class Test {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Ali", 8, "Production");
		e1.printInfo();
		System.out.println("Maaşı: " + e1.calculateSalary());

		Manager m1 = new Manager(2, "Fatma", 3, "Production", "Production");
		m1.printInfo();
		System.out.println("Maaşı: " + m1.calculateSalary());

		Director d1 = new Director(4, "Mehmet", 20, "Management", "Management", 3000);
		d1.printInfo();
		System.out.println("Maaşı: " + d1.calculateSalary());
	}
}
