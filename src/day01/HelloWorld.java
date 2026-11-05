package day01;


public class HelloWorld {

	public static void main(String[] args) {
		// 메서드 (method) : 함수 (function)
		// main method는 실행을 담당(콘솔 실행)
		// 주석 : 실행과 상관없는 영영 (메모 느낌), 단축키 : ctrl + /
		// 여러줄 드래그하고 단축키 쓰면 한번에 주석처리됨 
		/* 여러줄 주석
		 * 
		 * java 
		 * package => class => method 규칙을 지켜야 실행됨
		 * 
		 * main : 실행을 담당
		 * println() : 괄호안에 값을 출력 (줄바꿈 포함)
		 * print() : 괄호안에 값을 출력 (줄바꿈 x)
		 * 
		 * 마지막 끝처리는 ;(없으면 끝처리 안됨)
		 * 
		 * 문자 : String 클래스를 사용
		 *  */
		System.out.println(12345); //자동 줄바꿈(엔터처리)
		System.out.print(88848-1557+" "); //줄바꿈 x (엔터처리 안함) 문자와 같이쓰고싶다면 + 부호 필수
		System.out.println(12345); //한줄로 출력
		/* 숫자 : +, - (부호), 사칙연산 (맨 처음이나 맨 끝에 놓으면 문자로 출력)
		 * 문자 : "문자는 모두 큰 따옴표 필수(아니면 에러남)"
		 * 한글자의 문자 : 'a'  => char
		 * ''만 출력하면 글자 하나가 나오지만 사칙연산에 포함시키면 아스키코드 기반의 숫자로 계산됨
		 * */
		System.out.println("HelloWorld");
		System.out.println(223-'a'); //char 타입의 a라 숫자로 환산해서 뺄셈
		
		// = (대입) : 오른쪽의 리터럴 값을 왼쪽의 변수에 넣는다.
		int number = 342576; 
		number = 20; //number 값 변경
		System.out.println(number);
		
		String str = "abc";
		System.out.println(str);
		//-------------------------------
		byte b = 20;
		short s = 100;
		long l = 120L; // 접미사 l/L int값 넘어서면 필수
		float f = 1.8f; // 접미사  f/F
		double d = 1.1;
		char ch = 'a';
		System.out.println(b+s+l+d+ch+f);
	}

}
