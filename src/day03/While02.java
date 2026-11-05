package day03;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		// 1~50까지의 짝수만 출력
		/*
		 * 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50
		 * 
		 * System.out.print(); : 줄바꿈 없음
		 */
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int c = 0;
//		5번 출력 후 줄바꿈 => 출력 count 변수 필요
		while (true) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
				c++;
				if (c == 5) {
					c = 0;
					System.out.println();
				}
				if (i == 50) {
					break;
				}
			}
			i++;
		}
		System.out.println();
		i = 1;
		while (i <= 50) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
				c++;
				if (c == 5) {
					System.out.println();
					c = 0;
				}
			}
			i++;
		}

		System.out.println();
		for (i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
				if (i % 10 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println("첫번째");
		int a = sc.nextInt();
		System.out.println("두번째");
		int b = sc.nextInt();
		System.out.println("세번째");
		int d = sc.nextInt();
		;
		boolean check = false;
//		do {
//			if (a < 0 || a > 9 || b < 0 || b > 9 || d < 0 || d > 9) {
//				
//				System.out.println("잘못된 값을 입력하셨습니다 다시 입력해주세요");
//				check = false;
//				System.out.println("첫번째");
//				a = sc.nextInt();
//				System.out.println("두번째");
//				b = sc.nextInt();
//				System.out.println("세번째");
//				d = sc.nextInt();
//			} if(a > 0 || a <= 9 || b > 0 || b <= 9 || d > 0 || d <= 9) {
//				check = true;
//				break;
//			}
//			System.out.println(check);
//		} while (check==false);
		System.out.println(check);
		while(check==false) {
			if (a < 0 || a > 9 || b < 0 || b > 9 || d < 0 || d > 9) {
				
				System.out.println("잘못된 값을 입력하셨습니다 다시 입력해주세요");
				check = false;
				System.out.println("첫번째");
				a = sc.nextInt();
				System.out.println("두번째");
				b = sc.nextInt();
				System.out.println("세번째");
				d = sc.nextInt();
		}else {
			check=true;
		}
		}
		while (check=true) {
			int ran = (int) (Math.random() * 9) + 1;
			int ran2 = (int) (Math.random() * 9) + 1;
			int ran3 = (int) (Math.random() * 9) + 1;
			
			System.out.println("------------------");
			System.out.println(a + "=" + ran);
			System.out.println(b + "=" + ran2);
			System.out.println(d + "=" + ran3);
			if (ran == a && ran2 == b && ran3 == d) break;			
		}
		sc.close();

	}

}
