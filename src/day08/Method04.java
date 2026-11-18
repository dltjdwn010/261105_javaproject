package day08;

import java.util.Random;

//import java.util.Arrays;

public class Method04 {

	// 멤버변수
	Random r = new Random();

	/*
	 * 매개변수 : int 메서드명 : ran 리턴타입 : int[]
	 */
	public int[] ran() {
		int arr[] = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);

			System.out.print(arr[i] + " ");
		}
		System.out.println();
		return arr;

	}

	// 정수 배열을 받아 평균값을 리턴하는 메서드
	// - 단 정수 배열이 없거나, 갯수가 0이면 처리불가
	/*
	 * 매개변수 : 정수배열 => int[] arr 메서드명 : avg 리턴타입 : 평균값 => double
	 */
	public void avg(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		System.out.println("합계 : " + sum);
		System.out.println(sum + "/" + arr.length);
		System.out.println("평균 : " + (double)sum / arr.length);

	}
	public double avg1(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return (double)sum/arr.length;
	}

	public void print(int[] arr) {
		if (arr.length == 0 || arr == null) {
			System.out.println("배열을 처리할 수 없습니다.");
			return;
		}
		for(int num:arr) {
			System.out.println(num+" ");	
		}
		
		

	}

	public static void main(String[] args) {
		// 메서드 활용
		/*
		 * 1. 랜덤수(0~100) 정수 5개를 담는 배열을 생성하여 리턴하는 메서드 2. 정수 배열을 받아 평균값을 리턴하는 메서드 - 단 정수
		 * 배열이 없거나, 갯수가 0이면 처리불가 (평균을 처리할 수 없습니다.) 3. 정수 배열을 받아서 출력하는 메서드 - 78 96 85 48
		 * 58 이런식으로 출력
		 * 
		 * 배열 생성=> 배열 출력 => 평균 출력(처리 불가시 평균을 처리할수 없습니다 출력
		 */
		Method04 m = new Method04();
		int[] arr = m.ran();
		if (arr.length == 0 || arr == null) {
			System.out.println("배열을 처리할 수 없습니다.");
		} else {
			m.avg(arr);
		}
		double avg = m.avg1(arr);
		System.out.println("avg1 = "+avg);
		m.print(arr);
	}

}
