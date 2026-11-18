package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// 야구게임
		/*
		 * 컴퓨터가 랜덤으로 3자리의 숫자를 생성 각 자리의 숫자는 0~9까지 중 랜덤 숫자 => 중복 불가 (중복안될때까지 재생성 반복) 배열로
		 * 저장
		 * 
		 * 유저는 3자리를 맞추는 게임 위치와 숫자가 맞으면 strike 숫자만 맞으면 ball Ex) com : 1 2 3 user : 1 9 8
		 * => 1s user : 2 3 8 => 2b user : 1 3 2 => 1s 2b user : 1 2 5 => 2s user : 7 8
		 * 9 => out!! user : 1 2 3 => 정답 break;
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		int userArr[] = new int[3];
		int userArr1[] = new int[3];
		int strike = 0;
		int ball = 0;
		int cnt=0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10);
		}
//		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				while (arr[i] == arr[j]) {
					arr[i] = (int) (Math.random() * 10);
					// 중복발생
					// 변수 = 값(저장)
					// if문일 경우 i--;
				}
			}
		}
//		System.out.println(Arrays.toString(arr));

		// user 한번에 받기 123=> 1 2 3
		// String으로 받아서 split "" => 한글자 씩 잘라 배열로 리턴 (Integer.parseInt)
		while (true) {
			// user 입력
			System.out.println("---");
			String s = sc.next();

			// 입력값에 대한 제한은 여기서
			
			// 한글자씩 나누어 배열에 저장
			String sArr[] = s.split(""); // return 자체가 배열
			for (int i = 0; i < sArr.length; i++) {
				userArr1[i] = Integer.parseInt(sArr[i]);
			}
			System.out.println(Arrays.toString(sArr));
			System.out.println(Arrays.toString(userArr1));
			strike = 0;
			ball = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == userArr1[i]) {
					strike++;
				}
				for (int j = 0; j < userArr.length; j++) {
					if (arr[i] == userArr1[j] && i != j) {
						ball++;
					}
				}
			}
			cnt++;
			if (strike == 3) {
				System.out.println("정답");
				System.out.println("시도횟수 : "+cnt);
				break;
			}
			System.out.println(strike > 0 ? strike + "s" : "");
			System.out.println(ball > 0 ? ball + "b" : "");
			if (strike == 0 && ball == 0) {
				System.out.println("아웃");
			}
		}
//		while (strike != 3) {
//			for (int i = 0; i < userArr.length; i++) {
//				System.out.println((i + 1) + "번째숫자 입력");
//				int select = sc.nextInt();
//				userArr[i] = select;
//			}
//			strike = 0;
//			ball = 0;
//			for (int i = 0; i < arr.length; i++) {
//				if (arr[i] == userArr[i]) {
//					strike++;
//				}
//				for (int j = 0; j < userArr.length; j++) {
//					if (arr[i] == userArr[j] && i != j) {
//						ball++;
//					}
//				}
//			}
//			if (strike == 3) {
//				System.out.println("정답");
//				break;
//			}
//
//			System.out.println(strike > 0 ? strike + "s" : "");
//			System.out.println(ball > 0 ? ball + "b" : "");
//			if (strike == 0 && ball == 0) {
//				System.out.println("아웃");
//			}
//		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(userArr1));

		int ran[] = new int[10];
		for (int i = 0; i < ran.length; i++) {
			ran[i] = i;
		}
		for (int tmp = 0; tmp < 3; tmp++) {

		}
		sc.close();
	}

}
