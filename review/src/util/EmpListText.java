package util;

public class EmpListText {
	public static void main(String[] args) {
		EmpList emplist = new EmpList();
		emplist.addEmp(new Emp(1, "홍길동", "인사"));
		emplist.addEmp(new Emp(2, "김기자", "기획"));
		emplist.addEmp(new Emp(3, "김유신", "개발"));
		
		// 1번 사원의 이름은?
		System.out.println("1번 사원의 이름 : " + emplist.getName(0));
		
		// 첫번째 사원 삭제
		emplist.delEmp(0);
		
		// 사원의 이름만 출력
		
		System.out.println(emplist.getNameStr());
		
		// 전체 list 출력
		emplist.getList();
	}
}
