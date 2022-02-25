package org.gt.trainning;

public class Constructor {
	
	public Constructor() {
		System.out.println("Default Constructor");
	}
	public Constructor(String a ) {
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		Constructor obj = new Constructor();
		Constructor obj1= new Constructor("Parameterised Constructor");
		
	}
	
}
	


