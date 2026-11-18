package day10;

import java.util.Scanner;

public class ReportMain {

	public static void main(String[] args) {
		// Report class 객체 생성 => 실행
		// 성적 산출 인원 > 3 (입력)
		/* 이름 	국어	 영어	 수학	 합계	 평균	 등수 \t
		 * hong 10	 20	 30	 0	 0	 0
		 * kim  10	 20	 30	 0	 0	 0
		 * lee  10	 20	 30	 0	 0	 0
		 * */
		// Report[] = new Report[cnt];
		// Report 객체가 들어가는 배열
		// Report r = new Report{"이름", 10 ,20 ,30};
		// report[0] = r;
		// 1. 국영수 입력 => 합계 계산 => 합계를 이용한 평균 계산
		// 2. 등수는? 입력을 하나만 해서 등수 계산 불가
		// 3. 계산하려면? 국영수 추가 입력
		// 4. 다시 입력하면 기존값은 사라지는데? 기존 값을 저장할 공간 찾기 => 배열에 저장
		// 5. 1번째 배열에 저장했으니 2번째 배열에 1번 부터 반복 =>
		// 6. 배열 1번부터 끝번까지 평균을 비교해서 자동으로 등수 입력
		// 7. 입력한 등수를 배열에 저장
		// 8. 이름, 국어, 영어, 수학, 합계, 평균, 등수 한번에 출력
//			=> 번지 값을 반복해서 하나씩 출력해야하니까? 반복문
		Scanner sc = new Scanner(System.in);
		
		Report[] studentArr = new Report[5];
//		Report r = new Report();
		System.out.println("성적 입력 ");
		int student=0;
		while(true) {			
			int ran=(int)(Math.random()*101);
			System.out.println("이름 입력 종료 하려면 f");
			String name=sc.next();
			if(name.equals("f")) {
				System.out.println("종료");
				break;
			}
			studentArr[student] = new Report();
			studentArr[student].setName(name);
			
//			System.out.println("국어");
//			int score = sc.nextInt();
			studentArr[student].setKor(ran);
//			System.out.println("영어");
//			score = sc.nextInt();
			ran=(int)(Math.random()*101);
			studentArr[student].setEng(ran);
//			System.out.println("수학");
//			score = sc.nextInt();
			ran=(int)(Math.random()*101);
			studentArr[student].setMath(ran);
			studentArr[student].sum();
			studentArr[student].avg();
//			studentArr[student].print();
			
			student++;
			if(student==studentArr.length) {
				System.out.println("종료");
				break;
			}
			
		}
//		for (int i=0;i<studentArr.length;i++){
//			System.out.println("이름");
//			String na=sc.next();
//			System.out.println("국 영 수");
//			int kor = sc.nextInt();
//			int eng = sc.nextInt();
//			int math = sc.nextInt();
//			studentArr[i]=new Report(na, kor, eng, math);
//		}
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t등수");
		for (int i = 0; i < student; i++) {
//			if(student<studentArr.length) {
//				break;
//			}
			int s = 1;
			for (int j = 0; j < student; j++) {
				if (studentArr[i].getAvg()<studentArr[j].getAvg()) {
					
					s++;
				}
			}
			studentArr[i].setRank(s);
			studentArr[i].print();
		}
		System.out.println("------------------------");
		for (Report tmp : studentArr) {
			System.out.println(tmp);
		}
		sc.close();

	}

}
