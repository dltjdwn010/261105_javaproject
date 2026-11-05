package day03;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// 구구단 2단 출력
		// int i =1; 이 있을경우
		// for((int i=1 생략가능 ); 1<=9; i++)
		int dan = 2;
		for(int i=1; i<=9; i++) {
			int a = dan*i;
			System.out.println(dan+"*"+i+"="+a);
		}
		System.out.println("-------------------------");
		for(int i=1; i<=9; i++) {
			int ran= (int)(Math.random()*9)+1;
			int ran1= (int)(Math.random()*9)+1;
			int a = ran1*ran;
			System.out.println(ran+"*"+ran1+"="+a);
			System.out.println("--------------------------");
		}
		
		// 단을 콘솔에 입력받아 출력
		// Scanner scan= new Scanner(System.in);
		System.out.println("입력 ");
		int ip = sc.nextInt();
		
//		if(ip==0) {
//			System.out.println("0은 곱해도 0입니다");
//			return;
//		}
		if(ip>0 && ip <10) {
			for(int i=1; i<=9; i++) {
				int a = ip*i;
				System.out.println(ip+"*"+i+"="+a);
			}
			
		}else {
			System.out.println("1~9까지 입력");
		}
		System.out.println("-------------------------");
		
		
		sc.close();
	}

}
