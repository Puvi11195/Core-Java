package com.constructors;

public class ParameterizedConstructor {
	String animalName;
	String animalType;
	
	public ParameterizedConstructor(String name,String type) {
		 animalName=name;
		 animalType=type;
		}
	private void sayAboutAnimal() {
		System.out.println("Animal name is "+ animalName+" and type is "+animalType);
		}
	
	public static void main(String[] args) {
		 ParameterizedConstructor pc =new  ParameterizedConstructor("Tiger", "Wild");
		 pc.sayAboutAnimal();
		 ParameterizedConstructor pc1 =new  ParameterizedConstructor("Lion", "Wild");
		 pc1.sayAboutAnimal();
		 
	}

}
