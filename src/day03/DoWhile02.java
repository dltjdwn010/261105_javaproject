package day03;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		// 메뉴만들기
		// 1. 저장하기
		// 2. 새로만들기
		// 3. 종료
		Scanner sc = new Scanner(System.in);
		int menu=0;
//		int select=0;
		
		System.out.println("메뉴선택");
		System.out.println("1. 저장하기  2. 새로만들기 3. 종료");
		do {
			menu = sc.nextInt();
			if(menu==1) {
				System.out.println("저장되었습니다");
			}else if(menu==2) {
				System.out.println("메뉴선택");
				System.out.println("1. 저장하기  2. 새로만들기 3. 종료");
			}else if(menu==3) {
				System.out.println("감사합니다");
			}else {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
			}
		} while(menu!=3);
		
		do {
			menu = sc.nextInt();
			switch (menu) {
			case 1: {
				// 저장하기 구현
				System.out.println("저장되었습니다");
			}
			case 2: {
				// 새로만들기 구현
				System.out.println("메뉴선택");
				System.out.println("1. 저장하기 3. 종료");
			}
			case 3: {
				System.out.println("감사합니다");
			}
			default:
				System.out.println("잘못된 입력입니다.");
			}
		} while(menu!=3);
		
		
		
		
		sc.close();
	}

}
