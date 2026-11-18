package day05;

public class Test {

	public static void main(String[] args) {
//		배열 자동추가? 
//		int a=0;
//		배열 번호를 변수로 지정 int arr[(변수)] 
//		-> a의 숫자를 누적 a++
//		-> a번째 배열에 값 추가
//		int sum=1;
//		int arr[] = new int[sum];
//		
//		for(int i=0; i<5;i++) {
//			arr[sum]+= i;
//			sum++;
//			System.out.println(arr[sum]);
//		}
////		불가 코드
//		System.out.println(arr);
		
		int r[]= new int[10];
		for(int i=0;i<r.length;i++) {
			r[i]=(int)(Math.random()*10)+1;
			System.out.print(r[i]+ " ");
		}

	}

}
