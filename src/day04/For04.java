package day04;

public class For04 {

	public static void main(String[] args) {
		// 약수 : 나누어서 떨어지는 수의 집합
		/*
		 * 6의 약수 : 1, 2, 3, 6 6%1==0 6%2==0 6%3==0 6%4==2 6%5==1 6%6==0
		 */
		int number = 12;
		// for 1~number 까지 반복
		// number % i ==0
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				// 약수가 될 조건
				System.out.println(i);
			}
		}

		// 공약수 : 지정된 두 수의 공통된 약수
		/*
		 * 6, 12의 공약수 6 : 1, 2, 3, 6 12 : 1, 2, 3, 6, 12 최대공약수 : 공약수 중에서 가장 큰 수 => 6
		 */
		int num1 = 6;
		int num2 = 12;
		int a = 0;
		if (num1 > num2) {
			for (int i = 1; i <= num1; i++) {
				if (num1 % i == 0 && num2 % i == 0) {
//					System.out.println(i);
					a = i;
				}
			}
		}
		System.out.println(a);
		if (num1 < num2) {
			for (int i = 1; i <= num2; i++) {
				if (num2 % i == 0 && num1 % i == 0) {
//					System.out.println(i);
					a = i;
				}
			}
		}
		System.out.println("최대 공약수 : " + a);
		for (int i = num1;; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				System.out.println(i);
				break;
			}
		}

		// -----------------------------
		// 배수 : 1부터 값을 곱해서 나오는 값
		// 10의 배수 : 10, 20, 30, 40, 50 .....
		// 15의 배수 : 15, 30, 45, 60, 75 ........
		// 공배수 : 두 수의 공통된 배수 => 30, 60 ,90
		// 최소 공배수 : 두 수의 공통된 배수중에 최소값

		int num3 = 11;
		int num4 = 10;
		int sum = 0;
		int sum1 = 0;
//		if (num3 < num4) {
//			for (int i = 1;; i++) {// 배수
////				if((num3*i) (num4*i)) {
////					sum=num3*i;	
//				sum = num3 * i; // 9*1, 9*2
//				// 9 18 27 36
//				for (int j = 1;; j++) {
//					sum1 = num4 * j; // 11*1, 11*2
//					// 11 22 33 44
//					if (sum <= sum1) {
////						sum이 sum1 보다 크다면? 멈춰 sum1의 곱하기를 멈춰
//						System.out.println(sum);
//						System.out.println(sum1);
//						break;
//					} 
//					if (sum >= sum1) {// 그게 아니라
//						// sum이 sum1보다 작으면?
//						System.out.println(sum);
//						System.out.println(sum1);
//					break;
//
//					}
//					if (sum == sum1) {
//						System.out.println(sum1);
//						return;
//					}
//				}
//			}
//		}
		if (num3 > num4) {
a:			for (int i = 1;; i++) {// 배수
//				if((num3*i) (num4*i)) {
//					sum=num3*i;	
				sum = num4 * i; // 10*1, 10*2
				System.out.println(sum);
				// 10 20 30 40
				b: for (int j = 1;; j++) {
					sum1 = num3 * j; // 11*1, 11*2
					System.out.println(sum1);
					// 11 22 33 44
					if (sum >= sum1) {
//						10이 11 보다 크다면? 멈춰 sum1의 곱하기를 멈춰
						System.out.println(sum);
						System.out.println(sum1);
						break a;
						
					} else if (sum <= sum1) {// 그게 아니라
						// 10이 11보다 작으면?
						
						break b;
						
					}
					if (sum == sum1) {
						System.out.println(sum1);
						break;
					}
				}
				
			}
			
		}

		int n1 = 10;
		int n2 = 15;
		for (int i = n1;; i += n1) {
			if (i % n1 == 0 && i % n2 == 0) {
				System.out.println("최소공배수 : " + i);
				break;
			}
		}
	}
}
