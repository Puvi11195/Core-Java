package org.jumpingststement;

public class Continue {
	public static void main(String[] args) {
		for (int i = 0; i < 30; i++) {
			if (i==15 || i==22) {
				continue;
				
			}
			System.out.println(i);
		}
	}

}
