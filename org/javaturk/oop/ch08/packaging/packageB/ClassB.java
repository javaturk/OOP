package org.javaturk.oop.ch08.packaging.packageB;

import org.javaturk.oop.ch08.packaging.packageX.ClassX;
import org.javaturk.oop.ch08.packaging.packageX.ClassZ;

// ya da

import org.javaturk.oop.ch08.packaging.packageX.*;

public class ClassB {
	ClassX x;
	ClassZ z;
	
	public ClassB(ClassX x) {
		this.x = x;
	}

	public ClassB(ClassX x, ClassZ z) {
		super();
		this.x = x;
		this.z = z;
	}
}
