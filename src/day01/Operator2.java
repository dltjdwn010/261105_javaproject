package day01;

public class Operator2 {

	public static void main(String[] args) {
		// kor, eng, math 점수를 변수에 저장하고
		// 세 점수의 합과, 평균을 출력

		int kor = 72;
		int eng = 65;
		int math = 80;

		// 합계를 변수로 선언
		int total = kor + eng + math;

		// 평균을 변수로 선언
		double avg = (double) total / 3;
		// 자료형 변환을 하지않으면 total의 변수데이터인 정수값로 계산후 실수값로 변환

		System.out.println("국어 : " + kor + "점");
		System.out.println("영어 : " + eng + "점");
		System.out.println("수학 : " + math + "점");
		System.out.println("합계 : " + total + "점");
		System.out.println("평균 : " + avg + "점");

		// 삼항연산자를 이용하여 avg가 60이상이면 합격 아니면 불합격

		System.out.println(avg >= 60 ? "합격" : "불합격");
		
		String pass = avg >= 60 ? "생존" : "탈락";
		System.out.println(pass);
	}

}
