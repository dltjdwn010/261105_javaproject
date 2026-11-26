package day14;

import java.util.Arrays;

public class Exception06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception06 e = new Exception06();
		try {
			
			System.out.println(Arrays.toString(e.random()));
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
			System.out.println("size 혹은 count가 0보다 작거나 같습니다");
		}
//		System.out.println(e.random().length);
		
	}
	
	/* 배열의 길이(Size)를 입력받아 해당 길이의 배열을 생성
	 * 랜덤으로(start~count) 값을 채워 리턴하는 메서드 
	 * 
	 * - size가 0보다 작거나 같다면 예외처리 발생
	 * (math.random() * count)+ start 
	 * -count가 0보다 작거나 같다면 예외발생 
	 * 
	 * 매개변수 : size, count, start
	 * 리턴타입 : 배열
	 * */
	public int[] random()  {
		int count = (int)(Math.random()*101);
//		System.out.println(count);
		int start = (int)(Math.random()*101);
//		System.out.println(start);
		int size = (int)(Math.random()*101);
		System.out.println(size);
		int[] arr= new int[size];
		if(count<=0) {
			throw new RuntimeException("count가 0보다 작거나 같음");
			
		}
		if(size<=0) {
			throw new RuntimeException("size가 0보다 작거나 같음");
		}
		for(int i=0;i<arr.length;i++) {
			count = (int)(Math.random()*101);
			start = (int)(Math.random()*101);
			arr[i]=(int)(Math.random()*count)+start;
		}
		return arr;
	}
}
