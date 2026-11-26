package day15;

//import java.util.ArrayList;
import java.util.HashMap;
//import java.util.List;

import java.util.Map;
import java.util.Scanner;

public class MapController {
	// 1. 단어 등록 put | 
	// 2. 단어 검색 contains |
	// 3. 단어 수정 replace |
	// 4.전체단어 출력 for |
	// 5. 단어삭제 remove |
	// 6. 종료
//	Map<String, List<String>> voca = new HashMap<>();
//	하나의 단어에 뜻이 여러개인 값을 저장하기 위한 클래스
//	private int no;
//	private String word;
//	private List<String> me = new ArrayList<String>();
//	List<클래스>
	
	
	public Map<String, String> map = new HashMap<>();
	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public void input(Scanner sc) {
		System.out.println("단어 입력");
		String key = sc.next();
		System.out.println("뜻 입력");
		// 공백처리하고싶으면 nextLine();
//		sc.nextLine();
		// 한줄 안비우면 공백만 가져와서 처리
		String mean = sc.next();
		map.put(key, mean);
	}
	
	public void search(Scanner sc) {
		System.out.println("단어 입력");
		String search = sc.next();
		if(map.containsKey(search)) {
			System.out.println(search+"="+map.get(search));
			
		}else {
			System.out.println("검색하신 단어가 없습니다.");
		}
		
	}
	public void modify(Scanner sc) {
		System.out.println("단어 입력");
		String ks = sc.next();
		if(map.containsKey(ks)) {
			System.out.println("뜻 입력");
			String mean = sc.next();
			map.replace(ks, mean);
		}else {
			System.out.println("검색하신 단어가 없습니다.");
		}
		
	}
	
	public void print() {
		if(map.size()>0) {
			
			for(String tmp : map.keySet()) {
				System.out.println(tmp+" = "+map.get(tmp));
			}
		}else {
			System.out.println("등록된 단어가 없습니다.");
		}
	}
	
	public void remove(Scanner sc) {
		System.out.println("단어 입력");
		String remove = sc.next();
		if(map.containsKey(remove)) {
			map.remove(remove);
			System.out.println("삭제하였습니다.");
		}else {
			System.out.println("검색하신 단어가 없습니다.");
		}
		
	}
}
