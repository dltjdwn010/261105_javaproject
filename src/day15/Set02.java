package day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Set02 {

	public static void main(String[] args) {
		// 로또 번호 6개 출력
		// set을 사용하여 1~45까지의 랜덤수를 6개
		// 출력
		Set<Integer> lotto = new HashSet<Integer>();
		while(lotto.size()!=6) {
			int r= (int)(Math.random()*45)+1;
			lotto.add(r);
		}
		System.out.println(lotto);
		
		System.out.println("----------------");
		
		// 부모 타입으로 자식의 객체를 생성
		// 부모 타입으로 선언하면 자식의 본인만 가지고 있는 메서드 사용X
		// 자식 타입으로 자식 객체를 생성
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		
		while(set2.size()!=6) {
			int r= (int)(Math.random()*45)+1;
			set2.add(r);
		}
		// 트리구조로 다음 들어오는 값이 현재값보다 작으면 앞으로, 크면 뒤로 보내는 구조
		System.out.println(set2);
		
		// first() : 가장 앞에 있는 값 / last() : 가장 뒤에 있는 값
		System.out.println(set2.first());
		System.out.println(set2.last());


		//headSet(값) / tailSet(값) : 기준앞으로 앞/뒤 출력
		System.out.println(set2.headSet(15)); // 기준값보다 작은 값
		System.out.println(set2.tailSet(15)); // 기준값보다 큰 값
		
		// subSet(start, end) : 범위 값 출력 (end는 미포함)
		System.out.println(set2.subSet(10, 20));
		
		
		List<Integer> list = new ArrayList<Integer>(lotto);
		System.out.println("==== 오름차순");
		Collections.sort(list);
		System.out.println(list);
	}

}
