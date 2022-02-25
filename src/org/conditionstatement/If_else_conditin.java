package org.conditionstatement;

import java.util.Scanner;

public class If_else_conditin {
	public static void main(String[] args) {
		System.out.println("Enter your age");
		@SuppressWarnings("resource")
		Scanner ac = new Scanner(System.in);
		int age = ac.nextInt()	;
		if (age>=18) { 
			System.out.println("Eligible to vote");
		} 
		else {
			System.out.println("Not eligible to vote");
		}
	}

}
