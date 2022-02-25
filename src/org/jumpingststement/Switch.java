package org.jumpingststement;

import java.util.Scanner;

public class Switch {
public static void main(String[] args) {
	
	System.out.println("Enter ID Number");
	 
	for (int i = 0; i < 6; i++) {
		
	
	Scanner sc = new Scanner(System.in);
	int karthi = sc.nextInt();
	
	switch (karthi) {
	case 2345:
		System.out.println("lazy karthi");
		break;
	case 2355:
		System.out.println("Active karthi");
		break;
	case 2365:
		System.out.println("Sports karthi");
		break;
	case 2375:
		System.out.println("Topper karthi");
		break;
		
	default:
		System.out.println("Invalid ID Number");
		break;
	}
	}	
}

}