package org.javaturk.oop.ch09.ObjectClass;

public class EqualityExample {

	public static void main(String[] args) {

		Product p1 = new Product(112, "Kan epe", 169.0);
		Product p2 = new Product(11, "Kanepe", 170.0);
//	 	 p1 = p2;
		//
//		if (p1 == p2)
//			System.out.println("The same");
//		else
//			System.out.println("Different");
//		//
		boolean b = p1.equals(p2);
		if (b)
			System.out.println("The same");
		else
			System.out.println("Different");
	}
}

class Product {
	int no;
	String name;
	double price;

	public Product(int no, String name, double price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
		new Object().equals(new Object());
	}

	public boolean equals(Product p1){
		boolean b = false;
//		Product p1 = (Product) o;
		if(no == p1.no)
			b = true;
		
		return b;
	}

}
