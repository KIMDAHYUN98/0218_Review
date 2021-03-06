package util;

public class MapUtilTest {
	public static void main(String[] args) {
		MapUtil map = new MapUtil();
		map.addEmp(new Emp(1, "홍길동", "인사")); // 1=> key
		map.addEmp(new Emp(2, "김기자", "기획"));
		map.addEmp(new Emp(3, "김유신", "개발"));
		
		// 2번 사번의 이름을 출력
		String name = map.getName(2);
		System.out.println("2번 사원의 이름 : " + name);
		
		// 2번 사원 삭제
		map.delEmp(2);
		
		// 전체 출력
		System.out.println(map.getMap());
	}
}
