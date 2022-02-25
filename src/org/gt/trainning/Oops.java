package org.gt.trainning;

public class Oops {
	public void studentName() {
		System.out.println("Santhosh");
	}
	public void rollNumber() {
		System.out.println(23456);
	}
	public void department() {
		System.out.println("civil");
	}
	public void section() {
		System.out.println("B Section");

	}
	public static void main(String[] args) {
		Oops details = new Oops();
		details.department();
		details.rollNumber();
		details.studentName();
		details.section();
	}

}
