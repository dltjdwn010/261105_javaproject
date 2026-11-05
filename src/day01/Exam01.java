package day01;

public class Exam01 {

	public static void main(String[] args) {
		// % 나머지를 나타내는 연산자 / 삼항 연산자
		// number 의 수가 짝수인지 홀수인지 출력
		int number = 57;
		int num = number % 2;
		String num1 = num == 0 ? "짝수" : "홀수";
		System.out.println(num);
		System.out.println(num1);

	}

}
