package day14;

public class Exception03 {

	public static void main(String[] args) {
		// 예외처리 연습
		// 두 정수와 연산자를 입력받아
		// + - * / % 의 연산결과를 리턴하는 메서드
		// / % 연산자일 경우 피연산자가 0이면 Exception 오류처리
		
		// 예외처리는 메서드에서 해도 됨.
		Exception03 ex = new Exception03();
		int a = 10;
		int b = 2;
		int c =0;
//		System.out.println(ex.sum(a, b));
//		System.out.println(ex.minus(a, b));
//		System.out.println(ex.mul(a, b));
//		System.out.println(ex.avg(a, c));
		
		ex.sum(a, b);
		ex.minus(a, b);
		ex.mul(a, b);
		ex.avg(a, b);
		ex.persent(a, b);
		ex.avg(b, c);
		ex.persent(a, c);
		System.out.println();
		
		
		System.out.println(ex.calc(a, c, "+"));
		System.out.println(ex.calc(a, c, "-"));
		System.out.println(ex.calc(a, c, "*"));
		System.out.println(ex.calc(a, 3, "/"));
		System.out.println(ex.calc(a, c, "%"));
		
		System.out.println();
		try {
//			double avg=(double)a/c;
//			double p=(double)a%c;
			System.out.println(a/c);
			System.out.println(a%c);
		} catch (Exception e) {
			System.out.println("0으로 나눌수 없습니다.");
		}
		System.out.println("---");
		try {
			double res = ex.calc2(3, 0, "/");
		System.out.println(res);
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
			
		}
		
		System.out.println(ex.calc2(3, 0, "-")); 
	}
	
	//메서드는 직접 예외처리를 안하고, 그 예외를 나를 호출하는 호출자에게 넘겨줄 수 있음.
	// 예외 떠넘기기 : throws => 메서드 선언문에 위치
	// method 자체에서 예외처리를 하지않고,
	// 나를 호출하는 호출자에게 예외처리를 넘기는 상태
	// 해당 조건에 예외를 발생 시킬 수 있음. : throw new => 예외 발생시키기 
	
	// throw RuntimeException => 내 메서드에 존재하는 예외 선언 => runtime은 안해도 됨
	public double calc2(int a, int b, String op) throws RuntimeException{
		double res=0;
		
		if(op.equals("/")||op.equals("%")&&b==0) {
			throw new RuntimeException("0으로 못나눔");
			
		}
		switch(op) {
		case "+" : res = a+b; break;
		case "-" : res = a-b; break;
		case "*" : res = a*b; break;
		case "/" : res = a/b; break;
		case "%" : res = a%b; break;
		default : throw new RuntimeException("산술 연산자 아님");
		}
		return res;
	}
	
	// 두 정수와 연산자를 입력받아
	// + - * / % 의 연산결과를 리턴하는 메서드
	public void sum(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
	}
	public void minus(int a, int b) {
		int minus =  a-b;
		System.out.println(minus);
	}
	public void mul(int a, int b) {
		int mul= a*b;
		System.out.println(mul);
	}
	public void avg(int a, int b) {
		 
		try {
			 
		double avg=a/b;
		System.out.printf("%.2f",avg);
		System.out.println();
		} catch (Exception e) {
			System.out.println("0으로 나눌수 없습니다.");
			return;
		}
		
	}
	public void persent(int a, int b) {
		
		
		try {
			
		double per= a%b;
		System.out.println(per);
			
		} catch (Exception e) {
			System.out.println("0으로 나눌수 없습니다.");
			return ;
		}
	}
	
	public double calc(int a, int b, String op) {
		double result =0;
		try {
			
		switch(op) {
		case "+" : result = a+b; break;
		case "-" : result = a-b; break;
		case "*" : result = a*b; break;
		case "/" : result = a/b; break;
		case "%" : result = a%b; break;
		default : return -999999;
		}
		}catch (Exception e) {
			// 
			System.out.println("0으로 못나눔");
		}
		return result;
	}
}
