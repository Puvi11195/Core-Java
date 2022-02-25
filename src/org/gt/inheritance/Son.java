package org.gt.inheritance;

public class Son extends Father{
	public void son() {
		System.out.println("George");
	}
	public static void main(String[] args) {
		Son name = new Son();
		name.son();
		name.Father();
		
		
	}

}
