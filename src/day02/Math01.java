package day02;

import java.util.Random;

public class Math01 {

	public static void main(String[] args) {
		// Math 클래스 : 수학과 관련된 기능을 제공하는 클래스
		// Math.round(값) : 정수로 반올림 => 소수자리수 0
		// Math.floor(값) : 버림 => 소수자리수 0
		// Math.ceil(값) : 올림 => 소수자리수 0
		
		// Math.random() : 0~1사이의 아무 수 => double 값
		
		double number = 3.14159;
		
		long pi = Math.round(number); // 기본값 long
		
		System.out.println(pi);
		
		// 실수의 기본 자료형 = double 
		// 정수의 기본 자료형 = int
		
		int r= (int)Math.round(number); //(반올림)
		System.out.println(r);
		// floor()
		int p = (int)Math.floor(number); // (int) 안써주면 기본인 double로 출력 (버림)
		System.out.println(p);
		
		int ceil = (int)Math.ceil(number); // (int) 안써주면 기본인 double로 출력 (올림)
		System.out.println(ceil);
		
//		double ran= Math.random()*10; // 기본 리턴 double;
		// 0~9 중의 한자리를 랜덤 선택
		int random = (int)(Math.random()*10); //Math식에 괄호를 묶지 않으면 앞쪽부터 계산해서 소수점 버림먼저 계산 
		// 1~10 중의 한자리를 랜덤 선택
		int rand = (int)(Math.random()*10)+1; 
		System.out.println(rand);
		
		// (int)(Math.random()*갯수) + 시작값
		// 주사위 값 (1~6)
		// (int)(Math.random()*6)+1 
		System.out.println("---주사위---");
		System.out.println((int)(Math.random()*6)+1 );
		// 로또 (1~45)
		// (int)(Maht.random()*45)+1
		System.out.println("---로또---");
		System.out.println((int)(Math.random()*45)+1 );
		
		// Random() 클래스 new 키워드
		Random ra = new Random();
		ra.nextInt(10); // int 자료형으로 랜덤 값 리턴
		// ra.nextInt(count)+시작점
		System.out.println(ra.nextInt(10));
		
		// Math.max(값1, 값2) 최대값 / Math.min(값1, 값2) 최소값
		
		
		System.out.println(Math.max(rand, random));
		System.out.println(Math.min(random, rand));
		
		

	}

}
