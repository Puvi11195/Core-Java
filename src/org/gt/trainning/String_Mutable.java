package org.gt.trainning;

public class String_Mutable {
	
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Welcome to class");
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		
		StringBuffer s1 = new StringBuffer("Welcome to class");
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		
		
//		StringBuffer append = s.append(s1);
//		System.out.println(append);
		
		StringBuffer reverse = s.reverse()	;
		System.out.println(reverse);
		
		
		
		
		
	}

}
