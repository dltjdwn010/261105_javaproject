package day15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {
		// 과목 / 점수 를 저장하는 map을 생성
		// 과목, 점수 => 입력받아 map 추가
		// 종료 키워드가 나올 때까지 반복 (1=계속/ 0=종료)
		// 출력, 합계, 평균 출력
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double avg = 0;
		Map<String, Integer> map = new HashMap<>();
//		System.out.println("종료 키워드 (1=계속/ 0=종료)");
//		int ch=sc.nextInt();
		while (true) {
			try {
				System.out.println("과목 입력");
				String s = sc.next();
				System.out.println("점수 입력");
				int score = sc.nextInt();
				map.put(s, score);
				sum += map.get(s);
				System.out.println("종료 키워드 (1=계속/ 0=종료)");
				int ch = sc.nextInt();
				if (ch == 0) {
					System.out.println("종료");
					break;
				}

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("입력값이 잘못되었습니다.");
				sc.nextLine(); // 입력버퍼 비워두기
			}
		}

		System.out.println(map);
		
		System.out.println("합계 : " + sum);
		avg = (double) sum / map.size();
		System.out.println("평균 : " + avg);
		sc.close();
		
	}

}
