package org.gt.inheritance;

public  class Child implements Mom,Dad  {
	@Override
	public void Gift() {
		System.out.println("Bike");
	}
	@Override
	public void Gift1() {
		System.out.println("Car");
	}
	public static void main(String[] args) {
		Child Presents = new Child();
		Presents.Gift();
		Presents.Gift1();
	}

}
