package com.learningphase;

public class ReturnTypes {


	int collectAmount= 1000;

	private int collectAmoutAndGiveItToMe() {
		System.out.println("Daddy i have collected Rupees  "+collectAmount+"  sent it to you");
		return collectAmount;
	}	
	
	public static void main(String[] args) {
		ReturnTypes mySon = new ReturnTypes();
		int amount=mySon.collectAmoutAndGiveItToMe();
		System.out.println("got my amount "+amount);
		
		
		
	}



}
