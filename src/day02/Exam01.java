package day02;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 입력받아 합계, 평균, 합격여부 출력
		// 입력받은 점수는 0~100 범위 안에 있어야 함.
		// return : 해당 메서드를 빠져나오는 키워드
		Scanner scan = new Scanner(System.in);

// 국어 점수 입력--------------------------------
		System.out.println("국어점수를 입력해주세요");
		int kor = scan.nextInt();
// 국어 점수 범위 확인---------------------------
		if (kor <= 100 && kor >= 0) {
// 영어 점수 입력-------------------------------
			System.out.println("영어점수를 입력해주세요");
			int eng = scan.nextInt();
// 영어 점수 범위 확인---------------------------
			if (eng <= 100 && eng >= 0) {
// 수학 점수 입력-------------------------------
				System.out.println("수학점수를 입력해주세요");
				int math = scan.nextInt();
// 수학 점수 범위 확인---------------------------
				if (math <= 100 && math >= 0) {
//					-------------------------
					System.out.println("국어 : " + kor);
					System.out.println("영어 : " + eng);
					System.out.println("수학 : " + math);
//					-------------------------
					int total = kor + eng + math;
					double avg = total / 3;
					System.out.println("합계 : " + total);
					System.out.println("평균 : " + avg);
					System.out.println(avg >= 60 ? avg == 100 ? "만점" : "합격" : "불합격");
//					-------------------------
				} else {
					System.out.println("수학 점수를 잘못 입력했습니다 프로그램을 재실행 해주세요.");
				}
			} else {
				System.out.println("영어 점수를 잘못 입력했습니다 프로그램을 재실행 해주세요.");
			}
		} else {
			System.out.println("국어 점수를 잘못 입력했습니다 프로그램을 재실행 해주세요.");

		}
		// 비교
		// 0~100 범위가 맞지 않으면 빠져나가라
		//-------------------------국어
//		if (kor > 100 || kor < 0) {
//			System.out.println("국어점수 이상");
//			return;
//		}
//		//-------------------------영어
//		System.out.println("영어 입력");
//		int eng = scan.nextInt();
//		if (eng > 100 || eng < 0) {
//			System.out.println("영어점수 이상");
//			return;
//		}
//		//-------------------------수학
//		System.out.println("수학 입력");
//		int math = scan.nextInt();
//		if (math > 100 || math < 0) {
//			System.out.println("수학점수 이상");
//			return;
//		}
//		int total = kor + eng + math;
//		double avg = total / 3;
//		System.out.println("합계 : " + total);
//		System.out.println("평균 : " + avg);
//		System.out.println(avg >= 60 ? avg == 100 ? "만점" : "합격" : "불합격");
		scan.close();
	}

}
