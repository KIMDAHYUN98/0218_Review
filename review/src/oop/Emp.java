package oop;

public class Emp extends Member {

	String dept;
	String ho;
	
	@Override
	public void print() {
		super.print();
		System.out.println("직원");
	}
	
	@Override
	public void sal() {
		System.out.println("직원급여");
		
	}
	
	public void meth() {
		System.out.println("자체관리");
	}
	
	
	
}
