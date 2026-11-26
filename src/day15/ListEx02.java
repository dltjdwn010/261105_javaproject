package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListEx02 {

	public static void main(String[] args) {
		// 숫자를 입력받아 리스트로 출력
		/* 출력 => 전체 합계
		 * 입력 형식 String => split =>[]=>list<Integer>
		 * 47,85,96,45,69,85,63,26,15 enter
		 * */
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int sum=0;
		System.out.println("숫자입력");
		String num= sc.next(); // 공백 x => 넣고싶다면? => nextLine();
		System.out.println(Arrays.toString(num.split(",")) );
		for(int i=0;i<num.split(",").length;i++) {
			sum+= Integer.parseInt(num.split(",")[i]);
			int a=Integer.parseInt(num.split(",")[i]);
			list.add(a);
		}
		System.out.println("합계 : "+sum);
		System.out.println("===리스트");
		System.out.println(list);
		System.out.println("=== 오름차순 정렬");
		Collections.sort(list);
		System.out.println(list);
		sc.close();
	}

}
