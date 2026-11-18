package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		// 배열
//		int arr[] = new int[5];
//		
//		for(int i =0; i<arr.length; i++) {
//			System.out.println("정수입력"); 
//			arr[i] = sc.nextInt();
//			System.out.println(arr[i]);
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		-----------------------------------------
//		0~100점 사이의 점수를 랜덤으로 입력
		int arr2[] = new int[20];
		int sum = 0;
		for(int i=0;i<arr2.length;i++) {
			int r = (int)(Math.random()*101);
			arr2[i]=r;
			sum+=arr2[i];
			System.out.println(i+1+"번째 : "+arr2[i]);
		}
		System.out.println(Arrays.toString(arr2));
		System.out.println("총 합계 : "+sum);
		double avg = (double)sum/arr2.length;
		System.out.println("총 합계 : "+avg);
		sc.close();

	}

}
