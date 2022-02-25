package org.gt.trainning;

public class Employer extends Employee{
	
	
	public void employeeName(String a) {
   System.out.println(a);
		
	}
	
	public void employeeIdno(String a, int b) {
		
		super.employeeIdno(a, b);
	}
	@Override
	public void department(String a) {
		
		super.department(a);
	}
	public static void main(String[] args) {
		Employer obj = new Employer();
		obj.department("abc");
		//obj.employeeName("Shakthi");
		//obj.employeeIdno("ID no ", 765489);
		//obj.department("Production");
		Employee eyc =  new Employee();
		eyc.department("xyz");
		
		
	}
	public void department1() {
		// TODO Auto-generated method stub
		System.out.println("Production1");
	}
}
