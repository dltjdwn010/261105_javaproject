package day14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Exam01 {

	public static void main(String[] args) {
		// list를 생성하여 1~10까지 반복문을 이용하여 추가하고 => 출력
		// syso(list) 말고 반복문으로 돌려서 출력
		
		// 1. index = 4 값을 11로 변경
		
		// 2. list에 1의 값이 있는지 확인
		// list는 배열과 다르게 미리 칸을 준비하지 않음.
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i =1; i<=10;i++) {
			list.add(i); // 값 넣기 
			System.out.print(list.get(i-1)+" ");
			
		}
		System.out.println();
		
		System.out.println("== 향상된 for문 ==");
		
		// 향상된 for 문
		int sum=0;
		for(int tmp : list) {
			sum+=tmp;
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("합계 : "+sum);
		
		// Iterator (반복자) : index가 없는 구조를 출력하기 위한 객체
		// set, map 같은 index가 없는 구조에서 사용
		// 순서와 상관없이 값을 가져올 수 있는 구문
		// 향상된 for문과 동일하게 동작
		
		System.out.println("===Iterator출력===");
		Iterator<Integer> it = list.iterator();
//		System.out.println(it);
		while(it.hasNext()) { // 요소가 있는지 확인
			int tmp = it.next(); //요소 값 가져오기
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("=====Set, contains=====");
		
		System.out.println(list.set(4, 11));
		
		System.out.println(list.contains(1)); //true /false
		// list, set , map => index를 가지는건 list 뿐
		
		// indexOf(값) : 해당 값의 번지를 리턴 / 없으면 -1
		System.out.println(list.indexOf(10));
		
		list.clear();
		list.add(45);
		list.add(78);
		list.add(36);
		list.add(96);
		list.add(85);
		System.out.println(list);
		
		// 정렬
		Collections.sort(list); // 오름차순만 가능.
		System.out.println(list);
		
		
		
		
//		for(int i =0; i<10;i++) {
//			list.set(i,20+i); // 값 넣기  => 변겅 전 값을 리턴
//			System.out.print(list.get(i)+" ");
//			
//		}
//		System.out.println();
	}

}
