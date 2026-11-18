package day04;

public class For05 {

	public static void main(String[] args) {
		// 구구단
		int dan=2;
		for(int i =1;i<=9;i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
		System.out.println("----------------------");
		for(int j =2;j<=9;j++) {
			
		for(int i =1;i<=9;i++) {
			System.out.println(j+"*"+i+"="+(j*i));
		}
		System.out.println();
		}
		System.out.println("---------------------");
		/* 2*1=2 2*1=2 2*1=2 2*1=2 2*1=2  ... 9*1=9
		 * 3*1=2 3*1=2 3*1=2 3*1=2 3*1=2  ... 9*1=18
		 * 4*1=2 4*1=2 4*1=2 4*1=2 4*1=2  ... 9*1=27
		 * */
		// j의 숫자에 i를 곱하는 반복문 실행 후 i 증가
		// 두번째 반복문을 다 실행 후 첫번째 반복문 복귀
		for(int i=1;i<=9;i++){
			for(int j=2;j<=9;j++) {
				System.out.print(j+"*"+i+"="+(j*i)+" ");
			}
			System.out.println();
		}
	}

}
