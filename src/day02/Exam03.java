package day02;

public class Exam03 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 랜덤으로 생성(정수로 0~100점까지)
		// 출력, 합계, 평균, 합격여부
		// 합격여부는 80이상이면 상, 60이상이면 중, 나머지는 하

		int kor = (int) (Math.random() * 101);
		int eng = (int) (Math.random() * 101);
		int math = (int) (Math.random() * 101);
		int sum = 0;
		double avg = 0;
		String pass = "";
		System.out.println("국어 : " + kor + "점");
		System.out.println("영어 : " + eng + "점");
		System.out.println("수학 : " + math + "점");
		sum = kor + eng + math;
		avg = (double)sum / 3;
		// --------------------------------------
		System.out.println("합계 : " + sum + "점");
		System.out.println("평균 : " + avg + "점");
		if (avg >= 80) {
			pass="상";
			System.out.println(pass);
		} else if (avg < 80 && avg >= 60) {
			pass="중";
			System.out.println(pass);
		} else {
			pass="하";
			System.out.println(pass);
		}
		
//---------------------------------------------------
		for (int i = 0; i < 5; i++) {
			System.out.println((i+1)+"번마");
			kor = (int) (Math.random() * 101);
			eng = (int) (Math.random() * 101);
			math = (int) (Math.random() * 101);
			sum = 0;
			//-----------------------------점수출력
			avg = 0;
			System.out.println("국어 : " + kor + "점");
			System.out.println("영어 : " + eng + "점");
			System.out.println("수학 : " + math + "점");
			sum = kor + eng + math;
			avg = (double)sum / 3;
			// ------------------------------합계, 평균
			System.out.println("합계 : " + sum + "점");
			System.out.println("평균 : " + avg + "점");
			//----------------------------상 중 하
			if (avg >= 80) {
				pass="상";
				System.out.println(pass);
			} else if (avg < 80 && avg >= 60) { 
				// (avg>=60 && avg < 80) 80점을 거르고 들어온 상태여서 굳이 avg <80은 쓸 필요는 없다
				pass="중";
				System.out.println(pass);
			} else {
				pass="하";
				System.out.println(pass);
			}
		}
	}

}
