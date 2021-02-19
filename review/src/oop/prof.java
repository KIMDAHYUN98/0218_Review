package oop;


// 교수 클래스
public class prof extends Member {
	
	String dept;

	@Override // overriding : 상속받은 메소드(in Member)를 재정의(나한테 맞게 수정하는 것)
	public void sal() {
		System.out.println("교수급여");
		
	}

	@Override
	public void print() {
		super.print(); // = 부모(=super)에 있는 프린트를 불러옴
		System.out.println("교수");
	}
	
}
