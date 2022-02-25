package com.constructors;

public class ChildClass extends ParentClass{
	
	public ChildClass() {
		super();
		System.out.println("ChildConstructor");
		
	}
	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		
	}

}
