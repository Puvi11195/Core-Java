package org.conditionstatement;

import java.util.Scanner;

public class Ifelse_Ifladder {
	public static void main(String[] args) {
		System.out.println("enter your marks");
		Scanner sc = new Scanner(System.in);
		 {
			
		}
		int marks = sc.nextInt();
		
		if (marks<50) {
			System.out.println("Fail");
		}
		else if (marks>=50 && marks<60) {
			System.out.println("D grade");
		}
		else if (marks>=60 && marks<70) {
			System.out.println("D grade");
		}
		else if (marks>=70 && marks<80) {
			System.out.println("D grade");
		}
		else if (marks>=80 && marks<90) {
			System.out.println("D grade");
		}
		else if (marks>=90 && marks<=100) {
			System.out.println("D grade");
		}
		else {
			System.out.println("null");
		}
	}

}
