package util;

import java.util.ArrayList;

public class ListUtil {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		// 추가
		
		list.add("애플망고");
		
		// 삽입 (순서 상관없이 아무곳에 삽입)
		
		list.add(0, "사과");
		
		// 수정
		
		list.set(1, "키위");
		
		// 삭제
		
		list.remove(0);
		
		// 한건 조회
		
		list.get(0);
		
		// 전체 조회
		
		System.out.println(list);
	}
}
