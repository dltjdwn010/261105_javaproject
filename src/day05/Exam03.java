package day05;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		/*
		 * 가위 바위 보 컴퓨터와 유저가 가위바위보 게임을 진행 컴퓨터는 랜덤으로 0, 1, 2 중 선택 가위 = 0, 바위 =1, 보 = 2
		 * 
		 * 유저도 input 0, 1, 2 중 선택 Ex) com =0 / user= 0 com(가위) user(가위) = 무승부 com = 0 /
		 * user = 1 => user Win! com = 1 / user = 2 => user Win! com = 2 / user = 0 =>
		 * user Win! 이기는 조건 : -1 혹은 2가 되면 패배
		 */
		Scanner sc = new Scanner(System.in);
		String[] str= {"가위","바위","보"};
		int com = (int) (Math.random() * 3);
		System.out.println("가위바위보");
		System.out.println("0. 가위, 1. 바위, 2. 보 3. 종료 " + "입력해주세요");
		System.out.println(com);
		int user = sc.nextInt();
		while (user != 3) {
			while(user<0||user>3) {
				System.out.println("입력오류 다시 선택");
				user=sc.nextInt();
			}
			switch (com) {
			case 0:	System.out.print("컴퓨터 : 가위 vs ");	break;
			case 1:	System.out.print("컴퓨터 : 바위 vs ");	break;
			case 2:	System.out.print("컴퓨터 : 보 vs "); break;
			}
			switch (user) {
			case 0:	System.out.println("가위 : 유저"); break;
			case 1: System.out.println("바위 : 유저"); break;
			case 2:	System.out.println("보 : 유저"); break;
			}
			if (com == user) {
				System.out.println("Draw!");
			} else if ((com == 1 && user == 2) || (com == 2 && user == 0) || (com == 0 && user == 1)) {
				System.out.println("유저 Win!");
			} else {
				System.out.println("컴퓨터 Win!");
			}
			com = (int) (Math.random() * 3);
			System.out.println("0. 가위, 1. 바위, 2. 보 3. 종료 " + "입력해주세요");
			user = sc.nextInt();
		}
		System.out.println("종료");

//		int arr[]= {0,1,2};
//		user=sc.nextInt();
//		while(user!=3) {
//			int r= arr[(int)(Math.random()*3)];
//			if (r == user) {
//				System.out.println("Draw!");
//			} else if ((r == 1 && user == 2) || (r == 2 && user == 0) || (r == 0 && user == 1)) {
//				System.out.println("유저 Win!");
//			} else {
//				System.out.println("컴퓨터 Win!");
//			}
//			user=sc.nextInt();
//		}
//		아무리봐도 크게 차이없음

		int comNum = (int)(Math.random()*3);
		System.out.println("가위바위보 시작");
		System.out.println("0. 가위, 1. 바위, 2. 보 3. 종료 " + "입력해주세요");
		int choice=sc.nextInt();
		
		while(choice!=3) {
			
			while(choice<0||choice>3) {
				System.out.println("입력오류 다시 선택");
				choice=sc.nextInt();
			}
			if(choice==3) {
				
				break;
			}
			
//			System.out.println(comNum+"="+str[comNum]);
//			System.out.println(choice+"="+str[choice]);
			if(comNum==choice) {
				System.out.println("com : " +str[comNum]+" vs user : "+str[choice]);
				System.out.println("무승부");
			}else if(choice == 0) {
				// 가위(0) 보(2) 유저승
				System.out.println("com : " +str[comNum]+" vs user : "+str[choice]);
				System.out.println(comNum==2?"유저 승":"컴퓨터 승");
			}else if(choice == 1) {
				// 바위(1) 가위(0) 유저승
				System.out.println("com : " +str[comNum]+" vs user : "+str[choice]);
				System.out.println(comNum==0?"유저 승":"컴퓨터 승");
			}else 
				// choice == 2 바위(1) 유저승
				System.out.println("com : " +str[comNum]+" vs user : "+str[choice]);
			System.out.println(comNum==1?"유저 승":"컴퓨터 승");
		}
		System.out.println("종료");
		sc.close();
	}

}
/*
 * 배열에 가위(0) 바위(1) 보(2) 추가 arr[] = {0, 1, 2} 배열 번지를 랜덤으로 출력
 * arr[(int)Math.Random()*3] 배열 값 출력 후 같으면 무승부 arr[com] == user (sc.nextInt())
 * (com == 1 && user == 2) || (com == 2 && user == 0) || (com == 0 && user == 1)
 * 경우의 수에 따라 승패 결정
 * 
 */
