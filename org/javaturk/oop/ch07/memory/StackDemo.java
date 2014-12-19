package org.javaturk.oop.ch07.memory;

public class StackDemo {

	static int callCount;
	
	public static void main(String[] args) {
		recursiveCall();
	}
	
	public static void recursiveCall(){
//		int i = 1024;
		String s = "Naber abi ansilsinf fsdkjfdskfsdkfhdsjfhdsfjghdgdfgfghdsghfja";
		callCount++;
		if(callCount%100 == 0)
			System.out.println(callCount);
		recursiveCall();
	}
}
