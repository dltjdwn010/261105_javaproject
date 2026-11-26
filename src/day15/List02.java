package day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List02 {

	public static void main(String[] args) {
		// 리스트를 생성하여 과일 5가지 정도 저장하고 => 출력 (향상된 for문 /Iterator)
		List<String> fruit = new ArrayList<String>();
		fruit.add("사과");
		fruit.add("바나나");
		fruit.add("딸기");
		fruit.add("포도");
		fruit.add("키위");
		for(String tmp:fruit ) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("===========");
		Iterator<String> it = fruit.iterator();
		while(it.hasNext()) {
			String t = it.next();
			System.out.print(t+" ");
		}
		System.out.println();
		//1. 내 리스트에 '사과' 가 있으면 '사과판매' / 없으면 '재고없음'
		
			if(fruit.contains("사과")) {
				System.out.println("사과판매");
			}else {
				System.out.println("재고없음");
			}
			
		System.out.println(fruit.contains("사과") ? "사과판매" : "재고없음");
		if(fruit.indexOf("사과")!=-1) {
			System.out.println("사과판매");
		}else {
			System.out.println("재고없음"); 
			
		}
	}

}
