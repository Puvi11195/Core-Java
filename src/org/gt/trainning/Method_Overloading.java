package org.gt.trainning;

public class Method_Overloading {
	public void propertyDetails(String a) {
		System.out.println(a);
	}
	public void propertyDetails(String a,int b) {
		System.out.println(a+b);
	}
	public void propertyDetails(boolean a) {
		System.out.println(a);
	}
	public void propertyDetails(char a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		Method_Overloading obj = new Method_Overloading();
		obj.propertyDetails("Chennai OMR");
		obj.propertyDetails("Survey.No", 456);
		obj.propertyDetails('a');
		obj.propertyDetails(true);
		
				
	}
	
	
	
}
