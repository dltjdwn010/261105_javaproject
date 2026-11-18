package day06;

import java.util.Arrays;
//import java.util.Collections;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 정수배열[10] => 0~100까지 랜덤으로 채우기 => 출력
		// 오름차순으로 정렬 => 출력
		
		int arr[]= new int[10];
//		Integer arr1[] = new Integer[10];
		for(int i=0; i<arr.length;i++) {
			arr[i]=(int)(Math.random()*101);
		}
		System.out.println("랜덤 출력 : "+Arrays.toString(arr));
		
		Arrays.sort(arr); // 오름차순 정렬
		System.out.println("오름차순 : "+Arrays.toString(arr));
		
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) { // '>' 오름차순 | '<' 내림차순
				if(arr[i]<arr[j]) {
					int index=arr[i];
					arr[i]=arr[j];
					arr[j]=index;
				}
			}
		}
		System.out.println("내림차순 : "+Arrays.toString(arr));
		// 내림차순 : Collections.reversOder(); => Object
//		Arrays.sort(arr1, Collections.reverseOrder());
		;
	}

}
