package day04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// ---메뉴구성---
		/*
		 * 1. + 2. - 3.* 4. / 5. % 6. 종료
		 * 
		 * menu > 1 두 수를 입력 > 2 3 결과 => 2+3=5
		 * 
		 * 종료를 누를때까지 반복
		 * 
		 * 두번째 값이 0일경우 / % 연산자는 연산x 연살할수 없음 (0으로 나눌수 없음 출력 다시입력)
		 */
		Scanner sc = new Scanner(System.in);

		int as = 0;
		int num = 0;
		int num1 = 0;
		char bc = 0;
		int sum = 0;
		
//		-------------------------------------------------------------------
//		System.out.println("---메뉴---");
//		System.out.println("연산자 : 1. +, 2. -, 3. *, 4. / 5. %, 6. 종료");
////		------------------------
//		System.out.println("연산자 입력. 종료 : 6");
//		as = sc.nextInt();
////		------------------------
//
//		while (as != 6) {
////		6이 아니면 반복
//			if (as == 1 || as == 2 || as == 3 || as == 4 || as == 5) {
//
//				System.out.println("첫번째 숫자입력");
//				num = sc.nextInt();
//				System.out.println("두번째 숫자입력");
//				num1 = sc.nextInt();
//				switch (as) {
////		연산자 숫자에 맞는 조건문 실행
//				case 1:
//					System.out.println(num + "+" + num1 + "=" + (num + num1));
//					sum = sum + ((num + num1));
//					break;
//				case 2:
//					System.out.println(num + "-" + num1 + "=" + (num - num1));
//					sum = sum + (num - num1);
//					break;
//				case 3:
//					System.out.println(num + "*" + num1 + "=" + (num * num1));
//					sum = sum + ((num * num1));
//					break;
//				case 4:
//					if (num1 == 0) {
//						System.out.println("0은 나눌수 없습니다 처음부터 다시 해주세요");
//						break;
//					}
//					System.out.println(num + "/" + num1 + "=" + (num / num1));
//					sum = sum + ((num / num1));
//					break;
//				case 5:
//					if (num1 == 0) {
//						System.out.println("0은 나눌수 없습니다 처음부터 다시 해주세요.");
//						break;
//					}
//					System.out.println(num + "%" + num1 + "=" + (num % num1));
//					break;
//				}
////			조건문 종료
//				if (num1 != 0) {
//					System.out.println("다시입력?");
//					bc = sc.next().charAt(0);
//
//				}
////			반복 여부
//				if (bc != 'y') {
//					break;
//				}
//				System.out.println("연산자 입력. 종료 : 6");
//				as = sc.nextInt();
//			} else {
//				System.out.println("잘못 입력하셨습니다 다시 입력해주세요.");
//				System.out.println("연산자 입력. 종료 : 6");
//				as = sc.nextInt();
//			}
//		}
//		System.out.println("종료");
//		System.out.println("계산 총합 : " + sum);
		
//------------------------------------------------------
		do {
			System.out.println("---menu---");
			System.out.println("연산자 : 1. +, 2. -, 3. *, 4. / 5. %, 6. 종료");
			System.out.println("연산자 입력");
			as = sc.nextInt();

			if (as == 6) {
				System.out.println("종료");
				break;
			} else if (as > 1 && as > 6) {
				System.out.println("잘못된 입력");
			} else {
				System.out.println("두 수 입력");
				num = sc.nextInt();
				num1 = sc.nextInt();
			}
			switch (as) {
//			연산자 숫자에 맞는 조건문 실행
			case 1:
				System.out.println(num + "+" + num1 + "=" + (num + num1));
				sum = sum + ((num + num1));
				break;
			case 2:
				System.out.println(num + "-" + num1 + "=" + (num - num1));
				sum = sum + (num - num1);
				break;
			case 3:
				System.out.println(num + "*" + num1 + "=" + (num * num1));
				sum = sum + ((num * num1));
				break;
			case 4:
				if (num1 == 0) {
					System.out.println("0은 나눌수 없습니다 처음부터 다시 해주세요");
					break;
				}
				System.out.println(num + "/" + num1 + "=" + (num / num1));
				sum = sum + ((num / num1));
				break;
			case 5:
				if (num1 == 0) {
					System.out.println("0은 나눌수 없습니다 처음부터 다시 해주세요.");
					break;
				}
				System.out.println(num + "%" + num1 + "=" + (num % num1));
				break;
				
			}
			if (num1 != 0) {
				System.out.println("다시입력?");
				bc = sc.next().charAt(0);

			}if (bc != 'y') {
				System.out.println("종료");
				break;
			}
			
			

		} while (as != 6);
		sc.close();
	}

}
