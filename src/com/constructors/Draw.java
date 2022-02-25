package com.constructors;

public class Draw {
	
	String draw;
//	no argument constructor
	
	public Draw() {
		System.out.println("Draw object Created");
	}
// Parameterized constructor
	Draw(String toDraw){
		draw = toDraw;
		System.out.println("Drawing   " +toDraw);
	}
	public static void main(String[] args) {
		Draw draw =new Draw();
		Draw draw1=new Draw("Circle");
//		based on the parameter provided ,constructor will initialize the constructor either of two
//      Constructor Overloading
		
	}

}
