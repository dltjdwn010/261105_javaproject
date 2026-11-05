package day01;

public class Exam2 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 세 점수를 입력하고, 합계와 평균을 출력
		// 각 점수는 0~100점 사이 =>
		// 범위 이외의 숫자를 입력하면 점수가 잘못 입력되었습니다
		// pass : 60점 이상이면 합격
		int kor = 10;
		int eng = 10;
		int math = 100;

//		if (kor >= 0 && kor <= 100 && eng >= 0 && eng <= 100 && math >= 0 && math <= 100) {
//			System.out.println("국어 : " + kor + "점");
//			System.out.println("영어 : " + eng + "점");
//			System.out.println("수학 : " + math + "점");
//			int total = kor + eng + math;
//			double avg = (double) total / 3;
//			String pass = avg >= 60 ? "합격" : "불합격";
//
//			System.out.println("점수합계 : " + total);
//			System.out.println("점수평균 : " + avg);
//			if (kor == 100 && eng == 100 && math == 100) {
//				System.out.println("축하드립니다!");
//			}
//			System.out.println(pass);
//		} else{
//
//			System.out.println("점수표기가 잘못입력 되었습니다");
//		}

		if (kor >= 0 && kor <= 100) {
			if (eng >= 0 && eng <= 100) {
				if (math >= 0 && math <= 100) {
					System.out.println("국어 : " + kor + "점");
					System.out.println("영어 : " + eng + "점");
					System.out.println("수학 : " + math + "점");
					int total = kor + eng + math;
					double avg = (double) total / 3;
					// 삼항연산자는 연산자 안에 처리구문을 포함할 수 없다.
					String pass = avg >= 60 ? (avg == 100 ? "만점" : "합격") : (avg <= 30 ? "불합격" : "재시험");

					System.out.println("점수합계 : " + total);
					System.out.println("점수평균 : " + avg);
					if (kor == 100 && eng == 100 && math == 100) {
						System.out.println("축하드립니다!");

					}
					System.out.println(pass);
				} else {
					System.out.println("수학표기가 잘못 입력 되었습니다.");
				}
			} else {
				System.out.println("영어표기가 잘못 입력 되었습니다.");
			}
		} else {
			System.out.println("국어표기가 잘못 입력 되었습니다.");
		}

		// 2. 각 점수의 조건이 맞지않으면 계산하지 마시오.
		if ((kor > 100 || kor < 0) || (eng > 100 || eng < 0) || (math > 100 || math < 0)) {
			// 계산불가
			System.out.println("잘못입력됨");
		} else {
			if (kor >= 0 && kor <= 100) {
				if (eng >= 0 && eng <= 100) {
					if (math >= 0 && math <= 100) {
						System.out.println("국어 : " + kor + "점");
						System.out.println("영어 : " + eng + "점");
						System.out.println("수학 : " + math + "점");
						int total = kor + eng + math;
						double avg = (double) total / 3;
						// 삼항연산자는 연산자 안에 처리구문을 포함할 수 없다.
						String pass = avg >= 60 ? (avg == 100 ? "만점" : "합격") : (avg <= 30 ? "불합격" : "재시험");

						System.out.println("점수합계 : " + total);
						System.out.println("점수평균 : " + avg);
						if (kor == 100 && eng == 100 && math == 100) {
							System.out.println("축하드립니다!");

						}
						System.out.println(pass);
					}
				}
			}

		}

	}

}
