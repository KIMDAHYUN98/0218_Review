package util;

import java.util.ArrayList;

public class EmpList {

	ArrayList<Emp> list;
	public EmpList() {
		list = new ArrayList<>();
	}
	
	// 추가
	
	public void addEmp(Emp emp) {
		// to do
		list.add(emp);
	}
	
	// 해당 사원 이름 조회
	
	public String getName(int index) {
		// to do
		String name = "";
		name = list.get(index).name;
		return name;
	}
	
	// 삭제

	public void delEmp(int index) {
		// to do
		
	}
	
	// 전체 이름 조회
	
	public void getNames() {
//		String name = "";
//		for(int i=0; i < list.size(); i++) {
//			name += list.get(i).name;
//			name += " ";
		for(Emp e : list) {
			System.out.println(e.name);
		}
	}
	
	public String getNameStr() {
		String names = "";
		//for()
		for(Emp e : list) {
			names += e.name;
		}
		return names;
	}
	
	// list  조회
	public ArrayList<Emp> getList() {
		return list;
	}
}
