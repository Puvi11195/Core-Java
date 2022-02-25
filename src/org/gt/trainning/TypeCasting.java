package org.gt.trainning;

public class TypeCasting {
	public static void main(String[] args) {
		//widening type casting low to high
		
		byte a =15;
		int b =a;
		System.out.println(b);
		
		//narrowing type casting high to low
		double d = 22.01;
		short s = (short) d;
		System.out.println(s);
	}

}
