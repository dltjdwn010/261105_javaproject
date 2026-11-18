package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		// 배열 생성
		// 5명의 점수를 입력받기 (0~100)
		// 합계와 평균을 출력
		// 입력값의 범위가 벗어나면 다시입력
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		int score= 0;
		int sum=0;
		for(int i =0; i<arr.length;i++) {
			System.out.print("점수를 입력 -> ");
			score= sc.nextInt();
//			System.out.println(a);
//			범위 확인 및 범위 벗어날시 재 입력
			while(score<0||score>100) {
				System.out.println("범위를 벗어났습니다. 다시 입력해주세요.");
				System.out.print("접수를 입력 -> ");
				score=sc.nextInt();
			}
//			범위 확인 종료
//			범위 정상일시 배열에 값 추가
			arr[i]=score;
//			값 누적
			sum+= arr[i];
		}
//			System.out.println(arr[i]);
//		평균값 도출
		double avg= (double)sum/arr.length;
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+1+"번째 점수 : "+arr[i]);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("합계 : "+sum);
//		System.out.println(sum+"/"+arr.length);
		System.out.println("평균 : "+avg);
		
		sc.close();

	}

}
