package org.gt.inheritance;

public class Daughter extends Mother{
	private void daughterName() {
		System.out.println("Elayapiratti Kunthavai");
		

	}
	public static void main(String[] args) {
		Daughter name = new Daughter();
		name.grandMotherName();
		name.motherName();
		name.daughterName();
	}

}
