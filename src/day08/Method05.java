package day08;

import java.util.Arrays;

import day07.Exam01;

public class Method05 {
	/*
	 * 메서드 생성 1. 배열을 받아서 출력하는 메서드 2. 배열을 받아서 오름차순 정렬 3. 배열을 받아서 합계, 평균, 최대, 최소 출력
	 * 메서드 - 합계 평균은 다른 메서드 호출 - 최대, 최소(따로따로 생성)
	 */
//	매개변수 : int[]
//	리턴타입 : int[]
	public int[] a(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		return arr;
	}

//	매개변수 : int[]
//	리턴타입 : void
	public void arraySort(int[] arr) {
		if (arr == null) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
	}

//	매개변수 : int[]
//	리턴타입 : int
	public int max(int[] arr) {
		if (arr == null) {
			return -999999;
		}
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

//	매개변수 : int[]
//	리턴타입 : int

	public int min(int[] arr) {
		if (arr == null) {
			return -999999;
		}
		int min = arr[0];
		for (int tmp : arr) {
			if (min > tmp) {
				min = tmp;
			}
		}
		return min;
	}

	// 메서드는 같은이름의 메서드 가능 . => 메서드 오버로딩
	// 오버로딩 조건
	// 매개변수가 달라야함.(타입이 다르거나 갯수가 달라야함)
	
	
	
	
	public static void main(String[] args) {
		/*
		 * 메서드 생성 1. 배열을 받아서 출력하는 메서드 2. 배열을 받아서 오름차순 정렬 3. 배열을 받아서 합계, 평균, 최대, 최소 출력
		 * 메서드 -합계 평균은 다른 메서드 호출
		 * 
		 */
//		Method04 m4= new Method04();
		Exam01 e01 = new Exam01();
		Method05 m5 = new Method05();

		int[] arr = { 56, 45, 87, 45, 67, 54, 78, 89, 92, 30, 21, 63, 99 };
		m5.a(arr);
		int sum = e01.sum1(arr);
		double avg = e01.avg1(arr);
		int max = m5.max(arr);
		int min = m5.min(arr);

//		--------------------------
		System.out.println("오름차순 : " + Arrays.toString(arr));
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		if (max == -999999) {
			System.out.println("배열 오류");
		} else {
			System.out.println("최대값 : " + max);
		}
		if (min == -999999) {
			System.out.println("배열 오류");
		} else {
			System.out.println("최소값 : " + min);
		}
//		--------------------------
//		--------랜덤 생성 -----------
		int[] arr1 = new int[15];
		for (int i = 0; i < arr1.length; i++) {
			int a = (int) (Math.random() * 101);
			arr1[i] = a;
		}
		m5.arraySort(arr1);
		int sum1 = e01.sum1(arr1);
		double avg1 = e01.avg1(arr1);
		int max1 = m5.max(arr1);
		int min1 = m5.min(arr1);
//		--------------------------

		System.out.println("오름차순 : " + Arrays.toString(arr1));
		System.out.println("합계 : " + sum1);
		System.out.println("평균 : " + avg1);
		System.out.println("최대값 : " + max1);
		System.out.println("최소값 : " + min1);
//		--------------------------
	}

}
