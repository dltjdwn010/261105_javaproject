package day07;

import java.util.Arrays;
import java.util.Scanner;

public class Exam01 {

	// 메서드 생성 영역

	public int sum(int a, int b) {
		return a + b;
	}

	public double avg(double a, double b) {
		if (b == 0) {
			return -999999;
		}
		return a / b;

	}
	
	// 합계를 메서드로 분리
	// 배열을 입력받아서, 배열의 합계를 리턴
	/* 매개변수 : 숫자배열 int[]
	 * 메서드명 : sum1
	 * 리턴타입 : 합계 => int
	 * */
	public int sum1(int[] arr) {
		int sum=0;
		for(int i : arr) {
			sum+=i;
		}
		return sum;
	}
	
	public double avg1(int[] arr) {
		// 합계 / arr.length
		
		if (arr.length <= 0) {
			System.out.println("님 못함 ㅅㄱ");
			return -999999;
		}else {	
			return (double)sum1(arr)/ arr.length;
		}
		
		
	}
	
	// 문자 배열을 입력받아서, 숫자 배열로 리턴하는 메서드
	/* 매개변수 : 문자배열 String[]
	 * 메서드명 : change
	 * 리턴타입 : int[]
	 * */
	
	public int[] change(String[] arr, String a) {
		arr= a.split("");
		int[] arr1= new int[arr.length];
		for(int i =0;i< arr.length;i++) {
			arr1[i]=Integer.parseInt(arr[i]);
			
		}
		return arr1;
	}
	public int[] changeArr(String[] arr) {
		
		int[] arr1= new int[arr.length];
		for(int i =0;i< arr.length;i++) {
			arr1[i]=Integer.parseInt(arr[i]);
			
		}
		return arr1;
	}
	
	// 문자 배열, 숫자 배열을 입력받아서 문자배열의 값을 숫자배열로 채우는 매서드
//																		
	/* 매개변수 : 문자배열, 숫자배열 (String[] arr, int[] arr1)
	 * 메서드명 : changeArr2
	 * 리턴타입 : 문자배열
	 * */
//	 숫자 배열을 문자배열로 변경
	public void changeArr2(String[] arr, int[] arr1) {
		if(arr1 == null ||arr1[0] == 0 || arr1.length<=0) {
			System.out.println("배열 처리 불가");
			return;
		}
//		문자 배열보다 숫자배열의 길이가 작을때
		if(arr.length != arr1.length) {
			System.out.println("배열 처리 불가");
			return;
		}
		
		for(int i=0;i<arr1.length;i++) {
			arr[i]= String.valueOf(arr1[i]);
		}
		
	}
//	문자 배열을 숫자배열로 변경
	public void changeStrArr(String[] arr, int[] arr1) {
		if(arr == null ||arr[0] == null || arr.length<=0) {
			System.out.println("배열 처리 불가");
			return;
		}
//		문자 배열보다 숫자배열의 길이가 작을때
		if(arr.length != arr1.length) {
			System.out.println("배열 처리 불가");
			return;
		}
		
		for(int i=0;i<arr.length;i++) {
			arr1[i]= Integer.parseInt(arr[i]);
		}
		
	}
	
	
	public static void main(String[] args) {
		/*
		 * 숫자를 입력받아 입력받은 숫자의 합계와 평균을 출력 
		 * 입력은 String 12345=> 1+2+3+4+5 => 합계 / 평균 
		 * String 으로 입력받아 한자리 수로 분해 789456 => 7+8+9+4+5+6 => 합계/ 평균
		 * 
		 * 반복 (0또는 음수를 입력하면 종료)
		 */
		Exam01 ex = new Exam01();
		Scanner sc = new Scanner(System.in);
		String q= "2346432";
		String[] str= {};
		int[] arr1=ex.change(str,q);
		System.out.println(Arrays.toString(arr1));
		
		int[] arr3= {1,2,3,4,5,6,7};
		String[] strArr= new String[arr3.length];
		ex.changeArr2(strArr, arr3);
		System.out.println(Arrays.toString(strArr));
		
		
		
		do {
			System.out.print("숫자입력하세요 (0또는 음수 입력시 종료) ");
			String st = sc.next();
//			System.out.println();
			if ( Long.parseLong(st) <= 0) {
				System.out.println("종료");
				break;
			}
//			String stArr[] = st.split(""); // 한글자씩 분리 => 배열로 리턴
//			int[] num = new int[stArr.length];
			String stArr[] = {};
			int[] num= ex.change(stArr, st);
			System.out.println(Arrays.toString(num));
			int s=0;
			for(int i=0; i<num.length;i++) {
				s= ex.sum1(num);
			}
			int sum=0;
			double avg = 0;
			for (int i = 0; i < stArr.length; i++) {
				sum = ex.sum(sum, Integer.parseInt(stArr[i]));
			}

			avg = ex.avg(s, num.length);
			// split : 나누기 / join : 배열 => String
			// String.join("구분자", 배열)
			String p =String.join(" + ", stArr);
			System.out.println(p);
			
//			System.out.println("합계 : " + sum);
			System.out.println("합계! : "+s);
			if (avg == -999999) {
				System.out.println("0으로 나눌수 없습니다.");
			} else {
				System.out.printf("평균 : " + s + "/" + num.length + " = " + "%.2f", avg);
				System.out.println();
			}
			System.out.println();

		} while (true);

		sc.close();
	}

}
