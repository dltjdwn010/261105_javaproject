package day03;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// up/down
		// 1~50 까지 중 랜덤수 하나를 컴퓨터가 생성 user 모름
		// user가 그 랜덤수를 맞추는 게임
		/*
		 * 출력예시) 컴퓨터가 랜덤수를 생성했습니다. 출력 컴퓨터와 유저가 입력한 수를 대조 유저가 입력한 수를 기반으로 높으면 up, 낮으면
		 * down 그후 다시 유저가 입력
		 */
		Scanner sc = new Scanner(System.in);
		int random = (int) (Math.random() * 50) + 1;
		int user = 0;
		int count = 0;
		int c = 5;
		System.out.println("컴퓨터가 랜덤수를 생성했습니다.");
		do {
			System.out.println("숫자를 입력해주세요");
			user = sc.nextInt();
			count++;
			if (user > random) System.out.println("Down");
			if (user < random) System.out.println("Up");
			if (user == random) System.out.println("정답");
			c--;
			if (c != 0) {
				System.out.println("남은 횟수 : " + c);
			}else {
				System.out.println("실패했습니다");
				break;
			}
		} while (random != user);
		System.out.println("정답 : "+random);
		System.out.println("시도 횟수 : " + count);

		sc.close();

	}
}
