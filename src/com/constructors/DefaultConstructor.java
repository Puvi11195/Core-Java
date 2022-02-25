package com.constructors;

import java.lang.reflect.Array;

public class DefaultConstructor {
	
	String name;
	int rollNo;
	long level;
	boolean a;
	Integer i;
	Array ar;
	
//	constructors special kind of fuctions
	
public static void main(String[] args) {
	DefaultConstructor dc = new DefaultConstructor();
	System.out.println(dc.name);
	System.out.println(dc.rollNo);
	System.out.println(dc.level);
	System.out.println(dc.a);
	System.out.println(dc.i);
	System.out.println(dc.ar);
	
}

}
