package org.gt.trainning;

public class BasicOperators {
	public static void main(String[] args) {
		
		int ageOfPerson=19;
		boolean indianCitizen=false;
		
		System.out.println(ageOfPerson==18 && indianCitizen==true);
		System.out.println(ageOfPerson==18 || indianCitizen==true);
		System.out.println(!indianCitizen==true);
		String name = ageOfPerson>=18?"eligible":"Not eligible";
		System.out.println(name);
		
		
		int number =10;
		//++number;
		System.out.println(++number);
		
		
		
		
	}

}
