package day06;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 파일명을 저장하고 있는 배열
		// 검색어를 입력하면 해당 검색어를 포함하고 있는 파일을 출력
		// 검색어를 포함하는 파일이 없다면 => 일치하는 항목이 없습니다.
		
		Scanner sc= new Scanner(System.in);
		String[] fileName= {
				"이것이자바다.java","java의 정석.java","array.txt","array.java"
				,"String.txt","StringMethod.jpg","ArrayMethod.jpg","method.png",
		"javaMethod.png"};
		
		System.out.println("검색어를 입력해주세요 (대소문자 구분)"); 
		String search = sc.next();
		
		// 검색어가 fileName에 포함되어 잇는지 확인
		// contains
		int cnt=0; // 검색어 갯수로 확인
		boolean check=false; // 키워드
		System.out.println("---"+search+"검색 결과");
		for(int i=0;i<fileName.length;i++) {
			if(fileName[i].contains(search)) {
				cnt++;
				System.out.println(fileName[i]);
				check=true;
			}
			
		}
		if(check==false) {
			System.out.println("없쇼");
		}
		if(cnt==0) {
			System.out.println("일치하는 항목이 없습니다");
		}else {
			System.out.println("검색 결과 "+cnt+"개");
		}
//		---------------------------------------------
		System.out.println("파일 형식 찾기(대소문자 구분 X )");
		search = sc.next().toLowerCase();
		cnt=0;
//		System.out.println(fileName[0].substring(fileName[0].indexOf(".")));
		for(int i=0; i<fileName.length;i++) {
			if(fileName[i].substring(fileName[i].lastIndexOf(".")).toLowerCase().contains(search)) {
				System.out.println(fileName[i]);
				cnt++;
				check=true;
			}
		}
		if(check==false) {
			System.out.println("없쇼");
		}
		if(cnt==0) {
			System.out.println("파일 형식을 찾을 수 없습니다.");
		}else {
			System.out.println("검색 결과 "+cnt+"개");
		}
		sc.close();
	}

}
