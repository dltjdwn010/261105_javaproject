package day06;

import java.util.Arrays;

public class Array06 {

	public static void main(String[] args) {
		// 10개의 숫자를 가지는 배열 생성
		// 0~100까지 랜덤수를 배열제 저장 => 출력
		// 합계, 평균, 최대, 최소 출력
		int arr[] = new int[10];
		int sum = 0;
		int max = arr[0];
		int min = 100;
		int max1 = arr[0]; // 배열의 값 중 가장 큰 값을 찾기
		int min1 = arr[0]; // 배열의 값 중 가장 작은 값을 찾기 위한 초기값
		// 현시점 arr 값은 전부 0
		double avg = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
			System.out.println(arr[i]);
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
//					System.out.println(min);
			sum += arr[i];
		}
		max1 = arr[0];
		min1 = arr[0];
		for (int tmp : arr) {
			if (max1 < tmp) {
				max1 = tmp;
			}
			if (min1 > tmp) {
				min1 = tmp;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("합계 : " + sum);
		avg = (double) sum / arr.length;
		System.out.println("평균 : " + avg);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("max : " + max1);
		System.out.println("min : " + min1);

	}

}
