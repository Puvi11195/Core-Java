package org.gt.trainning;

public class ChildClass extends ParentClass{
	
	@Override
	public void property(String a) {
		// TODO Auto-generated method stub
		super.property(a);
	}
	@Override
	public void geneformat(int b) {
		// TODO Auto-generated method stub
		super.geneformat(b);
	}
	
	
	public void Property1(String b ) {
		System.out.println(b);

	}
	
	
	
	public static void main(String[] args) {
		
		ChildClass c = new ChildClass();
		c.property("Family Property");
		c.Property1("no.123");
		c.geneformat(123456);
		System.out.println(c);
	}
	}


