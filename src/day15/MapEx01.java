package day15;

import java.util.Scanner;

public class MapEx01 {

	public static void main(String[] args) {
		// map을 활용한 단어장 프로그램 작성
		// 단어 : 뜻 => hello : 안녕
		// 1. 단어 등록 put | 2. 단어 검색 contains | 3. 단어 수정 replace | 4.전체단어 출력 for |5. 단어삭제 remove | 6. 종료
		Scanner sc = new Scanner(System.in);
		MapController m = new MapController();

			while(true) {
			try {
			System.out.println("1. 단어 등록 | 2. 단어 검색 | 3. 단어 수정 | 4.전체단어 출력 |5. 단어삭제 | 6. 종료");
			int choice=sc.nextInt();
				
			
			switch(choice) {
			case 1 : m.input(sc); break;
			case 2 : m.search(sc); break;
			case 3 : m.modify(sc); break;
			case 4 : m.print(); break; 
			case 5 : m.remove(sc); break;
			case 6 : 
				System.out.println("종료");
				break;
				default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
			if(choice==6) {
				break;
			}
			
			} catch (Exception e) {
				// TODO: handle exception
//			e.printStackTrace();
				System.out.println("ERROR! 숫자로 입력해주세요");
				sc.nextLine();
			}	
				}
			
		sc.close();
	}

}
