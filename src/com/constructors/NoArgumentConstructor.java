package com.constructors;

public class NoArgumentConstructor {
	
	int employeeId;
	String name;
	
	
//	define no argument Constructor
//	User defined constructor
/*when we define a constructor , a default constructor will not work*/
	
	public NoArgumentConstructor() {
		employeeId=123;     //we can perform no of actions in this
		name= "John";
		System.out.println("Employee object is created");
	}
	public static void main(String[] args) {
		NoArgumentConstructor nc =new NoArgumentConstructor();
		
	}

}
