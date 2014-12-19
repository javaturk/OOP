package org.javaturk.oop.ch07.thisKeyword;

public class ThisDemo {
	 int i = 0;
	 int k = 5;
	 
	 {this.k = this.i;}
	 
	 int j = this.k;

}
