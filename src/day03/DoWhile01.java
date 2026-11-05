package day03;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		// 반복문
		/*
		 * do{실행문; }while(조건식); 실행문을 먼저 실행하고, 조건식을 나중에 비교하는 구문 for, while :조건식먼저 확인후 실행
		 * (조건식 안맞으면 실행x)
		 * 
		 * do~while : 반드시 한번은 실행한 후 조건식 확인
		 * 
		 * 변수는 기본적으로 연산을 하지않으면 값이 들어가지 않아도 지정 가능
		 */
		Scanner sc = new Scanner(System.in);
		int i = 1;
		do {
			System.out.println(i + "번째 실행문 실행");
			i++;
		} while (i <= 5);

		// 한글자를 입력받아 출력 입력형식 : char
		// String = "문자열" / char ='a'
		// y 를 입력하면 종료
		char bc;
		do {
			System.out.println("종료하시려면 y를 눌러주세요");
			bc = sc.next().charAt(0);
			System.out.println("입력값 : " + bc);
		} while (bc != 'y');
		System.out.println("종료되었습니다.");
		sc.close();
	}

}
