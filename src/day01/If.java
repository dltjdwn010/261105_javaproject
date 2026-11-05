package day01;

public class If {

	public static void main(String[] args) {
		// 조건문 : if, switch
		// 삼항연산자 : 조건 선택 연산자
		// if (조건식){...} 조건식이 참이면 실행
		// 처리문이 1줄이면 {생략}

		int number = 11;
		int num = 14748364;
		if (number % 2 == 0) {
			// 조건식이 참일 때 실행하는 구문
			System.out.println("짝수");
		}

		if (number % 2 == 0) {
			System.out.println("짝수");
			System.out.println("if 참일경우 출력");
		} else {
			System.out.println("홀수");
		}

		// number가 0보다 크면 양수
		// number가 0보다 작으면 음수
		// 나머지 == 0
		// else if(조건식)
		if (num > 0) {

			System.out.println("양수");
		} else if (num < 0) {
			System.out.println("음수");
		} else {
			System.out.println(0);
		}

		{
			// scope(스코프) : 해당 값이 영향을 미치는 범위{}
			// 중괄호 내부에 변수를 지정하면 그 바깥에서는 인식되지않음
			// int number = 1; /scope 겹침 사용못함
			// 자동 정렬 : ctrl + shift + f
		}
	}

}
