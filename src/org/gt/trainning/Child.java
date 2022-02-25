package org.gt.trainning;

public class Child extends Parent {
	public void PrintData() {
		System.out.println("Method of child class");
		
	}


public static void main(String[] args) {
	Parent obj = new Child();
	Child obj1 = new Child();
	obj.printData();
	obj1.PrintData();
	
}

}
