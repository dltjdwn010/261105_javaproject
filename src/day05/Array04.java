package day05;

import java.util.Arrays;

public class Array04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 25, 87, 62, 46, 64, 65, 65, 87, 69, 76, 57, 80, 54, 48, 57, 86 };
		int sum = 0;
		int sum1 = 0;
		int arr2[] = { (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100),
				(int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100),
				(int) (Math.random() * 100), (int) (Math.random() * 100) };
		System.out.println(Arrays.toString(arr));

		// 가장 큰 값, 가장 작은 값
		// 합계와 평균을 출력
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

		}
		System.out.println("합계 : " + sum);
		double avg = (double) sum / arr.length;
		System.out.print("평균 : " + sum + " / " + arr.length + " = ");
		System.out.println(avg);
		
		int max=arr[0]; //현재 25
		int min=arr[0]; //현재 25
		for(int i=0; i<arr.length;i++) {
			if(max< arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]){
				min=arr[i];
			}
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		System.out.println();
//		--------------------------------------------------------
		//Math.max(a, b); Math.min(a,b)
		System.out.println("---Math class 활용 ---");
		 max=arr[0];
		 min=arr[0];
		for(int i=0;i<arr.length;i++) {
			max=Math.max(max, arr[i]);
			min=Math.min(min, arr[i]);
			
		}
		System.out.println(max);

		System.out.println();
		
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		System.out.println();
//		---------------------------------------------
		// 합계와 평균을 출력
		for (int i = 0; i < arr2.length; i++) {
			sum1 += arr2[i];

		}
		System.out.println(Arrays.toString(arr2));
		System.out.println("합계 : " + sum1);
		double avg1 = (double) sum1 / arr2.length;
		System.out.print("평균 : " + sum1 + " / " + arr2.length + " = ");
		System.out.println(avg1);
		
		// 가장 큰 값, 가장 작은 값
		int max1=arr2[0]; //현재 25
		int min1=arr2[0]; //현재 25
		for(int i=0; i<arr2.length;i++) {
			if(max1< arr2[i]) {
				max1=arr2[i];
			}
			if(min1>arr2[i]){
				min1=arr2[i];
			}
		}
		System.out.println("최대값 : "+max1);
		System.out.println("최소값 : "+min1);
		max1=arr2[0];
		min1=arr2[0];
		for(int i=0; i<arr2.length;i++) {
			max1= Math.max(max1, arr2[i]);
			min1= Math.min(min1, arr2[i]);
		}
		System.out.println();
		System.out.println("Math.max : "+max1);
		System.out.println("Math.min : "+min1);


	}

}
