package org.gt.trainning;

public class String_Immutable {

	public static void main(String[] args) {
			String s = "welcome To class";
			System.out.println(System.identityHashCode(s));
			
			String s1 = "welcome to class";
			System.out.println(System.identityHashCode(s1));
			
			
			s=s+ s1;
			System.out.println(s);
			System.out.println(System.identityHashCode(s));

	}

}
