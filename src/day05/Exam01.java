package day05;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/*
		 * --menu-- 1. 과자(2000원) | 2. 라면(3000원) | 3. 사탕(500원) | 4.젤리(500원) | 5. 종료 menu
		 * > 1 과자 1개를 선택했습니다. 2000원 menu > 2 라면 1개를 선택했씁니다. 3000원 menu > 5 과자 1개, 라면 2개
		 * 총 금액 : 종료를 누를때까지 반복 1~5를 벗어난 메뉴는 다시 입력 각 배열의 같은 번지는 같은 값
		 */
		Scanner sc = new Scanner(System.in);
		String menu[] = { "과자", "라면", "사탕", "젤리", "아이스크림" };
		int price[] = { 2000, 3000, 500, 500, 1500 };
		int choice = 0;
		int select = 0;
		int cnt[] = new int[menu.length];
		int sum = 0;
//		System.out.println("1. 과자(2000원) | 2. 라면(3000원) | 3. 사탕(500원) | 4.젤리(500원) | 5. 아이스크림(1500원)| 6. 종료");
//		System.out.print("메뉴 선택 ->");
//		choice=sc.nextInt();
		do {

			System.out.println("1. 과자(2000원) | 2. 라면(3000원) | 3. 사탕(500원) | 4.젤리(500원) | 5. 아이스크림(1500원) | 6. 종료");
			System.out.print("메뉴 선택 -> ");
			choice = sc.nextInt();
			if (choice == 6) {
				System.out.println("종료");
				break;
//				안넣으면 렝스 익셉션 오류 발생
			}
			if (choice <= 0 || choice > 6) {
				System.out.println("잘못입력 하였습니다 다시 입력해주세요");
			} else {
				System.out.println(menu[choice - 1]);
				System.out.print("갯수 선택 -> ");
				select = sc.nextInt();
				cnt[choice - 1] += select;
				System.out.println(menu[choice - 1] + " " + cnt[choice - 1] + "개 = "
						+ (price[choice - 1] * cnt[choice - 1]) + "원");
			}
		} while (choice != 6);

		for (int i = 0; i < menu.length; i++) {
			if (cnt[i] != 0) {
				System.out.println(menu[i] + " " + cnt[i] + "개 = " + (price[i] * cnt[i]) + "원");

			}
			sum += (price[i] * cnt[i]);
		}
		System.out.println("총 가격 : " + sum + "원");
		sc.close();
	}

}
