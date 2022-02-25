package org.gt.trainning;

import java.util.Scanner;


public class A {
	
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int temp=n;
		int ans =0;
		int a=0;
		
		sc.close();
		
		while (n>0) {
			a = n%10;
			ans=ans+(a*a*a);
			n= n/10;
			
		}
		if (n==ans) {
			System.out.println("Armstrong Number");
			
		}
		else {
			System.out.println("Not an Armstrong Number");
		}
		sc.close();
	
	}
	
}
