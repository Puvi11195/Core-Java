package org.gt.trainning;

import java.util.Scanner;

public class Armstrong {
public static void main(String[] args) {
	System.out.println("Enter the Limit : ");
	
	Scanner sc = new Scanner(System.in);
	int s = sc.nextInt();
	System.out.println("Armstrong number from 0 to 1000 are");
	
	for (int j = 0; j <=s; j++) {
		int temp =j;
		int ans = 0;
		int a =0;
		while (temp>0) {
			a =temp %10;
			ans= ans+(a*a*a);
			temp =temp/10;
			
		}
		if (j==ans) {
			System.out.println(j+" ");
			
		}
		
		
	}
}
}
