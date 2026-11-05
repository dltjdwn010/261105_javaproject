package day02;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// input class
		// console input : 콘솔에서 값을 입력받는 것을 의미
		// Scanner 클래스 : 입력받는 값의 형식 변환을 편리하게 해주는 클래스
		// 클래스 객체를 생성해야 사용할 수 있다. => new 키워드를 사용

		// 기본 자료형 => 타입 변수명 = 값; int num =1 ;
		// 클래스 자료형 => 클래스명 객체명 = new 클래스명(값);

		Scanner scan = new Scanner(System.in);

		// 입력을 받을 때 scan.메서드
		// scan.next() : 한 문자만 입력(한 단어) 공백미포함 => String
		// scan.nextLine() : 여러 단어를 입력 공백포함 => String
		// scan.nextInt() : 정수입력 => Int
		// scan.next자료형() : 해당 자료형으로 입력 => 자료형

		System.out.println("입력해주세요");
		String name = scan.next();
		System.out.println(name);

		// 나머지 데이터를 버리는 작업
		scan.nextLine();
		System.out.println("--------------------------");

		System.out.println("정수입력");
		int num = scan.nextInt();
		System.out.println("입력한 수는? " + num);

	
		// 숫자를 입력받아 짝수인지 홀수인지 출력
		System.out.println("짝수 홀수 확인");
		System.out.println(num%2== 0 ? "짝수" : "홀수");
		scan.nextLine();
		
		// char : 아스키 코드의 한글자 입력
		// scan.next().charAt(위치) : 입력받은 단어의 첫글자만 아스키 코드로 변환 => char 
		// 항상 첫번째 위치는 0부터 시작
		
		System.out.println("한글자만 출력");
		char b= scan.next().charAt(0);
		System.out.println("출력값"+b);
		
		scan.close();

	}

}
