package org.javaturk.oop.ch07;

public class ObjectPassing {
	public static void main(String[] args) {
		ObjectPassing o = new ObjectPassing();
		
		W w = new W(3, false);
		o.f(w);
		System.out.println("i of w is " + w.i + "  and b of w is " + w.b);
	}

	public void f(W objectW) {
		objectW.i = 5;
		objectW.b = true;
		W ww = new W(8, true);
		objectW = ww;
		objectW.i = 12;
		objectW.b = false;
		System.out.println("i of objectW is " + objectW.i + "  and b of objectW is " + objectW.b);
	}
}

class W {
	int i;
	boolean b;

	public W(int i, boolean b) {
		this.i = i;
		this.b = b;
	}
}
