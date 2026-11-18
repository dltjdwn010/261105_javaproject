package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Array05 {

	public static void main(String[] args) {
		// 숫자 5개를 입력할 수 있는 배열을 생성
		// 랜덤으로 0~100까지의 숫자를 입력
		// 합계를 출력
		Scanner sc= new Scanner(System.in);
		int arr[]= new int[5];
//		int s=0;
		int sum=0;
		for(int i=0; i<arr.length;i++) {
//			System.out.println(i+1+"번째");
			arr[i]= (int)(Math.random()*101);
//			s=sc.nextInt();
//			while(s<0 || s>100) {
//				System.out.println("다시 입력해주세요");
//				s=sc.nextInt();
//			}
			sum+=arr[i];
		}
		System.out.println(Arrays.toString(arr)); //전체보기 비교, 연산 X
		System.out.println("합계 : "+sum);
		
		// 비교, 연산 O
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("---------------------");
		// 향상된 for문
		// for(출력할 리스트의 자료형 임의변수값 : 리스트){}
		// 원본의 리스트를 하나씩 순차적으로 임의 변수값에 저장 => 처리문 실행
		sum=0;
		for(int tmp : arr) { //무조건 처음부터
			System.out.println(tmp);
			if(tmp>=60) {
				sum+=tmp;
				
			}
		}
		System.out.println(": "+sum);
		
		sc.close();
	}

}
