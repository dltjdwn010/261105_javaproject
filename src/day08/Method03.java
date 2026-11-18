package day08;


public class Method03 {

	/* 변수의 종류
	 * 지역변수 : 메서드 안에서 사용
	 * 매개변수 : 메서드에서 전달받는 변수
	 * 멤버변수 : 클래스의 속성
	 * 
	 * 모든 변수의 스코프는 { }
	 * 
	 * ------------------------------
	 * 변수가 어떤것을 저장하느냐에 따라 분류
	 * 일반변수 : 값을 저장 => 기본 8 자료형
	 * 참조변수 : 주소를 저장 => 그 외
	 * */
	int a; // 멤버변수
	
	/* 정수 하나를 입력받아 해당 정수의 구구단을 출력
	 * 매개변수 : int
	 * 메서드명 : gugudan
	 * 리턴타입 : void
	 * */
	public void gugudan(int a) {
		for(int i=1; i<=9;i++) {
			System.out.println(a+"*"+i+"="+(a*i));
		}
		System.out.println();
	}
//	배열에 집어넣는 방식으로
	public int[] gugudanArr(int a) {
		int[] arr = new int[9];
		for(int i=1; i<=arr.length;i++) {
			arr[i-1]=a*i;
		}
		return arr;
	}
	/* 정수를 입력받지 않고 구구단 1~9까지 출력
	 * 매개변수 : (없음)
	 * 메서드명 : gugudanAll
	 * 리턴타입 : void
	 * */
	
	public void gugudanAll() {
		for(int i=1; i<=9;i++) {
			
			for(int j=2;j<=9;j++) {
				
					
					System.out.print(j+"*"+i+"="+(i*j)+"\t");
				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		/**/
		int number=9; //지역변수
		
		// 구구단 출력하는 메서드
		Method03 m = new Method03();

		m.gugudan(number);

		m.gugudanAll();
		System.out.println();
		int[] arr=m.gugudanArr(number);
		for(int i=0;i<arr.length;i++) {
			System.out.println(number+"x"+(i+1)+"="+arr[i]);
		}

	}

}
