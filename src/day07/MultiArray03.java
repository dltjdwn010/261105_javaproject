package day07;

import java.util.Scanner;

public class MultiArray03 {

	public static void main(String[] args) {
		// 성적표
		/*
		 * 전체인원 > 3 (입력) => 인원수 만큼 배열 생성 (int[][]) 이름 국어 영어 수학 합계 평균 등수 hong 89 78 88
		 * sum avg ? kim 85 99 23 sum avg ? lee 34 63 22 sum avg ?
		 * 
		 * 이름, 국어, 영어, 수학 점수를 입력받아 합계 평균 등수
		 */
		// 각각의 필요한 배열을 따로 생성, 같은 번지의 학생은 같은 값으로 정의
		Scanner sc = new Scanner(System.in);
		System.out.print("총 인원 ->");
		int a = sc.nextInt();

		System.out.println();

		String[] nameArr = new String[a];
		int sub=3;
		int[][] arr = new int[a][4];
//		int[] total= new int[a]; //합계 따로 배열 놓을때 쓰는 배열
		double avgArr[] = new double[a];
		int[] st = new int[a];
		double avg = 0;

		for (int i = 0; i <a; i++) {
			System.out.println(i+1+"번이름 입력");
			String name = sc.next();
			nameArr[i] = name;
			int sum = 0;
			avg = 0;
			//내부 for문 시작			
			for (int j = 0; j < sub; j++) {
//				System.out.println("점수입력");
//				int score=sc.nextInt();
				int score=(int)(Math.random()*101); //점수 랜덤 생성
				while (score < 0 || score > 100) {
					System.out.println("범위 초과 다시입력");
					score = sc.nextInt();
				}
				arr[i][j] = score;
				sum += score;
			}
			//내부 for문 끝
			arr[i][3] = sum;
			avg = (double)sum / sub;
			avgArr[i] = avg;

		}
		for (int i = 0; i < st.length; i++) {
			int s = 1;
			for (int j = 0; j < st.length; j++) {
				if (arr[i][3] < arr[j][3]) {
					/* 1번지 부터 0-st.length번지까지 비교
					 * 1번지가 (1+'반복횟수')번지보다 작을 경우 1번지의 등수값을 + (3개 값중에 1번지가 제일 작을경우 (3-1)번 비교하니까 등수값 +2 
					 * */
					s++;
				}
				st[i] = s;
			}
		}
////		2번째
//		int[][] arr = new int[a][4];
//		for (int i = 0; i <a; i++) {
//			System.out.println(i+1+"번이름 입력");
//			String name = sc.next();
//			nameArr[i] = name;
//			int sum = 0;
//			avg = 0;
//			//내부 for문 시작
//						
//			for (int j = 0; j < sub; j++) {
////				System.out.println("점수입력");
////				int score=sc.nextInt();
//				int score=(int)(Math.random()*101); //점수 랜덤 생성
//				while (score < 0 || score > 100) {
//					System.out.println("범위 초과 다시입력");
//					score = sc.nextInt();
//				}
//				arr[i][j] = score;
//				sum += score;
//			}
//			//내부 for문 끝
//			total[i] = sum;
//			avg = sum / sub;
//			avgArr[i] = avg;
//
//		}
//		for (int i = 0; i < st.length; i++) {
//			int s = 1;
//			for (int j = 0; j < st.length; j++) {
//				if (total[i] < total[j]) {
//					/* 1번지 부터 0-st.length번지까지 비교
//					 * 1번지가 (1+'반복횟수')번지보다 작을 경우 1번지의 등수값을 + (3개 값중에 1번지가 제일 작을경우 (3-1)번 비교하니까 등수값 +2 
//					 * */
//					s++;
//				}
//				st[i] = s;
//			}
//		}
//		출력
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t등수");
		for (int i = 0; i < a; i++) {
			System.out.print(nameArr[i] + "\t");                       
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
//			System.out.print(total[i]+"\t");
			System.out.printf("%.2f\t", avgArr[i] );
			System.out.println(st[i]);
		}
//		System.out.printf("%.2f", 56.250349); // 소수 2자리로 표현 방식

		sc.close();
	}

}
