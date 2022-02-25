package org.conditionstatement;

import java.util.Scanner;

public class Ifelse_ladder {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 7; i++) {
			
		System.out.println("enter your marks");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		
		if (marks<50) {
			System.out.println("fail");
			
		}
		else if (marks>=50 && marks <60) {
			System.out.println("D grade");
		}
		else if (marks>=60 && marks <70) {
			System.out.println("c grade");
		}
		else if (marks>=70 && marks <80) {
			System.out.println("b grade");
		}
		else if (marks>=80 && marks <90) {
			System.out.println("a grade");
		}
		else if (marks>90 && marks <=100) {
			System.out.println("s grade");
		}
		else {
			System.out.println("Absence");
		}}
		
		
		}}
	


