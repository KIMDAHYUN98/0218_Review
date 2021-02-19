package oop;

public abstract class Member {

	// 캡슐화
	private String name;
	String id;
	
	// getter : read
	// setter : writer
	
	public Member() {
		super();
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void sal() ; 
	// == 추상메소드(abstract) : 클래스에 하나라도 추상메소드가 있으면 추상클래스
	// body = { ... }

	public void print() {
		System.out.println(name);
	}

}