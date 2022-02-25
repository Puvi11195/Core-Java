package com.learningphase;

public class BankAccount_Datatypes {
	
	private void AccountHolderDetails() {
     int accountNumber=1234567892;
     String name = "John";
     short balance=450;
     
     System.out.println( "Ac No:"+  accountNumber);
     System.out.println("Name:"+  name);
     System.out.println("Balance:"+  balance);
	}
	
	public static void main(String[] args) {
		 BankAccount_Datatypes ba = new  BankAccount_Datatypes();
		 ba.AccountHolderDetails();
		
	}

}
