package org.gt.trainning;

public class Variable {
	
	//local variable and class variable
	
	int a=123;
	
	public void add() {
			int a =345;
			System.out.println(a);

	}
		public void multi() {
			
			System.out.println(a);
				

		}
	
	
	
	public static void main(String[] args) {
		Variable v = new Variable();
		v.add();
		v.multi();
		
	
		
		
	}

}
