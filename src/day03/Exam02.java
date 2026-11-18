package day03;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 연도를 숫자로 입력받아 어린이(13살), 청소년(14~19살), 어른으로 구분
		// 어린이 5000원, 청소년 7000원, 성인 10000원 입장료 출력
		// ex) 2017 => 9살 어린이
		// 2026 - 생년
		// 생년의 유효한 값을 1900~2026년까지
		// 기준에 넘어간 데이터는 다시 입력하라고 요청

		// 한 가족(ex)5명)의 입장료
		// 반복적인 생년을 입력받고 싶음 => 종료 키워드 y
		// 반복이 종료되면 최종결제금액
		Scanner sc = new Scanner(System.in);
		int age = 0;
		int ip = 0;
		char check = 0;
//		String name = "";
		int sum = 0;
//		-------------------이름, 출생년도 입력후 범위 확인---------------------
		System.out.println("영유아 7세 미만, 어린이 13살, 청소년 14~19살, 20살 이상 성인");
		System.out.println("가격표 성인 : 10000원, 청소년 : 7000원, 어린이 : 5000원, 영유아 : 무료");
//		System.out.println("성함을 입력해주세요");
//		name = sc.nextLine();
		System.out.println("출생년도를 입력해주세요. 종료 = 0");
		ip = sc.nextInt();
		while (ip < 1900 || ip > 2026) {
			if(ip==0) {
				System.out.println("종료합니다");
				return;
			}
			System.out.println("출생년도를 잘못 입력했습니다. 다시 입력해주세요");
			sc.nextLine();
			ip = sc.nextInt();
		}

//		---------------------범위 확인 후 요금 계산---------------------

		age = 2026 - ip;
		System.out.println(/* name + "님의 나이는" + */ age + "살");
		if (age > 19) {
			System.out.println("10000원입니다.");
			sum += 10000;
		} else if (age > 13) {
			System.out.println("7000원입니다");
			sum += 10000;
		} else if (age > 6) {
			System.out.println("5000원입니다.");
			sum += 10000;
		} else {
			System.out.println("영유아 입니다.");
		}
		System.out.println("추가인원 등록하시겠습니까?");
		check = sc.next().charAt(0);
		if (check != 'y') {
			System.out.println("감사합니다.");
			System.out.println("총 결제금액은 " + sum + "원 입니다");
		}

//		------------------------------------

		while (check == 'y') {
//			System.out.println("성함을 입력해주세요");
//			name = sc.next();
//			sc.nextLine();
			System.out.println("출생년도를 입력해주세요.");
			ip = sc.nextInt();
			while (ip < 1900 || ip > 2026) {
				System.out.println("출생년도를 잘못 입력했습니다. 다시 입력해주세요");
				sc.nextLine();
				ip = sc.nextInt();
			}
//			--------------------------------------------------
			age = 2026 - ip;
			System.out.println(/* name + "님의 나이는" + */ age + "살");
			if (age > 19) {
				System.out.println("성인 요금인 10000원입니다.");
				sum += 10000;
			} else if (age > 13) {
				System.out.println("청소년 요금인 7000원입니다");
				sum += 7000;
			} else if (age > 6) {
				System.out.println("어린이 요금인 5000원입니다.");
				sum += 5000;
			} else {
				System.out.println("영유아 입니다.");
			}
			System.out.println("추가인원 등록하시겠습니까?");
			check = sc.next().charAt(0);
			if (check != 'y') {
				System.out.println("감사합니다");

				System.out.println("총 결제금액은 " + sum + "원 입니다");
				return;
			}
		}
		sc.close();
//		--------------------------------------------------

	}

}
