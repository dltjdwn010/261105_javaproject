package day01;

public class Casting {

	public static void main(String[] args) {
		// casting : 자료형 변환
		// a = b; 두 변수의 자료형이 맞지 않다면 오류
		// 자동 자료형 변환 : auto casting
		// byte < short < char < int < long | 같은 형이지만 사이즈가 다를 경우 오토 캐스팅 가능
		// float < double | 다만 큰 수에서 작은수로 변환은 불가능
		// 명시적 자료형 변환 : 변수 앞에 (타입)변수
		
		byte b = 11;
		int a = b; // auto casting
		
		int aa = 200;
		byte c = (byte)aa; // 명시적 캐스팅 (데이터 보존 보장x)
		
		System.out.println(c);
		System.out.println(a);
		
		double d =3.14159;
		int pi = (int)d; // 소수점 버림
		System.out.println(d);
		System.out.println(pi);
		
		int number = 100;
		double num = number; //소수점 생성
		System.out.println(num);
		
		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		// 문자를 숫자로 : String -> int
		// "123" 
		String str = "123";
		System.out.println(str + 10);
		
		// 기본 8 자료형 클래스 타입의 타입이 존재
		// 추가 기능을 제공 (래퍼 클래스 : Wrapper class)
		// int -> Integer / long -> Long / char -> Character
		// float -> Float / double -> Double / boolean -> Boolean
		// long -> Long / byte -> Byte / short -> Short
		
		int strNum = Integer.parseInt(str);
		
		//Parse = 해석하다 + Integer(정수)
		System.out.println(strNum + 10);

}

}
