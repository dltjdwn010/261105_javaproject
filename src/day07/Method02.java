package day07;

public class Method02 {
	/* 메서드 => 기능을 정의하는 역할 (함수)
	 * 접근제어자 리턴타입 메서드명(매개변수){
	 * 구현;
	 * (return;)
	 * }
	 * - 리턴타입 : 기능을 구현 후 결괄 반환하는 값의 타입
	 * - 매개변수 : 기능을 구현하기 위해 외부에서 받아와야 하는 값
	 * - 메서드명 : 의미있게 소문자로 작석
	 * */
	
	// 메서드 생성 영역
	// + = * / %
	// 두 정수를 주고(매개변수) 각 연산의 결과를 리턴하는 메서드
	public int sum(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int multi(int a, int b) {
		return a*b;
	}
	public double avg(int a, int b) {
		if(b==0) {
			
			return -999999;
		}
		return (double)a/b;
	}
	public int rn(int a, int b) {
		if(b==0) {
			return -999999;
		}
		return a%b;
	}
	
	
	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=9876;
		// 메서드 호출 영역
		Method02 m2= new Method02();
		int sum = m2.sum(a, b);
		int sub = m2.sub(a, b);
		int mul = m2.multi(a, b);
		double avg1 = m2.avg(a, b);
		double avg2 = m2.avg(a, c);
		int rn = m2.rn(a, b);
		int rn2 = m2.rn(a, c);
//		출력 영역
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(avg1);
		System.out.println(rn);
		if(avg2==-999999) {
			System.out.println("0으로 나눌수 없습니다");		
		}else {
			System.out.println(avg2);
			
		}
		if(rn2==-999999) {
			System.out.println("0으로 나눌수 없습니다");;			
		}else {
			
			System.out.println(rn2);
		}
	}

}
