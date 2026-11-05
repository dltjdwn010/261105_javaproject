package day02;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 정수 2개와 연산자 1개를 입력받아 두 정수의 연산 결과를 출력
		// 2 3 + => 2+3 = 5
		// 2 3 - => 2 - 3 = -1
		// 입력 가능한 연산자는 + - * / %
		// 이외의 문자열을 받으면 계산불가 문구
		// 연산자 입력은 char도 가능하고 String도 가능
		// String은 (equals)
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력");
		int a = sc.nextInt();
		sc.nextLine();

		System.out.println("두번째 숫자 입력");
		int b = sc.nextInt();
		sc.nextLine();

		System.out.println("연산자 입력");
		char bc = sc.next().charAt(0);
		sc.nextLine();
		int res = 0;
		switch (bc) {
		case '+':
			res = a + b;
			break;
		case '-':
			res = a - b;
			break;
		case '*':
			res = a * b;
			break;
		case '/':
			if (b == 0) {
				System.out.println("0으로 나눌수 없습니다");

			} else {
				res = a / b;
				break;
			}
		case '%':
			res = a % b;
			break;
		default:

			System.out.println("잘못된 연산자입니다");
		}
		if (bc == '+' || bc == '-' || bc == '*' || bc == '/' || bc == '%') {
			System.out.println(a + "" + bc + "" + b + "=" + res);
		}
//		System.out.println(a + "" + bc + "" + b + "=" + res);

		System.out.println("-----------------------------");
		System.out.println("-----------------------------");

		int e = (int) (Math.random() * 100);
		int f = (int) (Math.random() * 100);
		System.out.println("연산자 입력");
		String c = sc.next();
		sc.nextLine();
		System.out.println(e);
		System.out.println(f);
		System.out.println(c);
		if (c.equals("+")) {
			System.out.println("결과 : " + e + c + f + "=" + (e + f));
		} else if (c.equals("-")) {
			System.out.println("결과 : " + e + c + f + "=" + (e - f));
		} else if (c.equals("*")) {
			System.out.println("결과 : " + e + c + f + "=" + (e * f));
		} else if (c.equals("/")) {
			if (b == 0) {
				System.out.println("0으로 나눌수 없습니다");

			} else {
				System.out.println("결과 : " + e + c + f + "=" + (e / f));
			}

		} else if (c.equals("%")) {
			System.out.println("결과 : " + e + c + f + "=" + (e % f));
		} else {
			System.out.println("잘못된 연산자입니다.");
		}
//		if(c.equals("+")||c.equals("-")||c.equals("*")||c.equals("/")||c.equals("%")) {
//			System.out.println(a + ""+bc+"" + b + "=" + res);
//		}
		sc.close();
	}

}
