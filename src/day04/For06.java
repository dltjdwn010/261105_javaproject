package day04;

public class For06 {

	public static void main(String[] args) {
		// 이중 for 연습

		// * 찍기
		/*
		 * ***** ***** ***** ***** *****
		 */
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------");
		/*
		 * * ** *** **** *****
		 */
//		for (int i = 1; i <= 11; i++) {
//			// 줄
//			// 첫번째 for문인 i 만큼 두번째 for문인 j 반복
//			// i는 1부터 시작 -> 반복할때마다 i+1
//			for(int a= 5; a>=i; a--) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= i; j++) {
//				// 갯수
//				if(j%2==1) {
//					
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		for (int i = 10; i >= 1; i--) {
			// 줄
			// 첫번째 for문인 i 만큼 두번째 for문인 j 반복
			// i는 5부터 시작 -> 반복할때마다 i-1
			for (int j = 1; j <= i; j++) {
				// 갯수
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------");

	}

}
