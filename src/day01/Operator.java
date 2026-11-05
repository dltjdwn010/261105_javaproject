package day01;

public class Operator {

	public static void main(String[] args) {
		// 연산자
		/*
		 * 대입연산자 : = 오른쪽에 있는 리터럴 값을 왼쪽의 변수에 저장 
		 * a = b b 변수의 값을 a변수로 덮어쓰기 (대입, 저장) 왼쪽은 반드시
		 * 변수여야한다. a = 10 / 10 = a(안됨)
		 */
		int a = 10;
		int b = 20;
		a = b + a;
		System.out.println(a);
		// 10 = a ; 에러발생

		// 문자 연결 : +
		System.out.println("a = " + a);
		// 문자 + 숫자의 연살 결과는 문자열로 표현(String)

		// 산술연산자 : + - * / %(나머지)
		System.out.println(4 + 3);
		System.out.println(4 - 3);
		System.out.println(4 * 3);
		System.out.println(4 / 3.0);
		System.out.println(4 % 3);

		double d1 = 1.5;
		double d2 = 2.5;
		/*
		 * 나누기 정수 / 정수 = 정수(소수점 버림) 
		 * 정수 / 실수 = 실수 
		 * 실수 / 정수 = 실수 
		 * 실수 / 실수 = 실수
		 */
		// 자료형 변환 casting (자료형)변수
		System.out.println((double) a / b);
		System.out.println((int) d2 * d1);
		System.out.println(d2 * d1);

		// ==(같다), !=(같지않다), >(초과), <(미만), >=(이상), <=(이하)
		// 비교연산의 결과는 항상 true or false
		System.out.println(a > b);
		System.out.println(a == b);

		// 논리연산자 : !(not), &&(and), ||(or)
		// 논리연산의 결과는 항상 true of false
		System.out.println(!(a == b));
		System.out.println((1 < 3) && (3 < 4));
		System.out.println(((1 > 3) || (3 < 4)));
		
		// 삼항연산자(조건선택연산자)
		// 조건식 ? true : false
		System.out.println(a==b ? "a와 b가 같다" : "a와 b가 다르다");
		
		// 증감연산자 : ++(1씩 추가), --(1씩 감소)
		System.out.println(a); //30
		a++;
		System.out.println(a); //31
		a--;
		System.out.println(a); //30
		System.out.println(a++); //30 출력 후 1 증가, 증가 후 출력시키고 싶으면 ++를 앞으로(++a)
		// 현재 a 값은 31
		a = a + 1; //32
		a++; //33
		System.out.println(++a);//34
		++a; //증가 우선
		a++; //나중 증가
		
		// 복합연산자 : +=
		a += 2; // a = a + 2 와 같은 의미 
		System.out.println(a); //36

	}

}
