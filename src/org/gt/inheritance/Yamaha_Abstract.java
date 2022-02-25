package org.gt.inheritance;

public  class Yamaha_Abstract  extends Government_Abstract{
	 @Override
	public void colour() {
		System.out.println("Black");
		
	}
	 @Override
	public void model() {
		System.out.println("ZY");
	}
	 @Override
	public void price() {
		System.out.println("1.5 lakhs");
		
	}
	 public static void main(String[] args) {
		 Yamaha_Abstract pro = new Yamaha_Abstract();
		 pro.engine();
		 pro.colour();
		 pro.cc();
		 pro.model();
		 pro.price();
		 
		 
	}
	

}
