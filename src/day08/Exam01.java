package day08;


public class Exam01 {
	// 메서드오버로딩 조건
	// 매개변수의 개수 다름,
	// 매개변수의 순서가 다름
	
	// 1. 랜덤수를 리턴하는 메서드 (1~45)
	public int ran() {
		return (int) (Math.random() * 45) + 1;
		
	}

	// 범위를 입력받아 해당 범위의 랜덤수를 리턴하는 메서드
	// 1~45 / 1~6 / 1~52
	public int ran(int count, int start) {
		return (int) (Math.random() * count) + start;
	}
	// 범위로 랜덤수를 생성
	public int makeRandom2(int begin, int end) { 
		// 1~45 => 45개 / 10~45 => 36
		return (int) (Math.random() * end-begin+1) + begin;
	}
	
	// 2. 중복확인 메서드 : 배열의 정수가 있는지 확인(true or false)
	// - 매개변수(배열, 정수)(배열은 3번에서 가져오기?)
	//
	public boolean tof(int[] arr, int b) {
		for (int i = 0; i < arr.length; i++) {
			if (b == arr[i]) {
				return false;
			}
		}
		return true;
	}

	// 3. 배열을 매개변수로 받아 랜덤수(1번메서드 호출)를 채워주는 메서드 Math.random(중복x 2번 메서드 호출)
	public void lotto(int[] arr) { 
		if(arr==null||arr.length==0) {
			System.out.println("오류!!!!");
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			int r = ran();

			if (tof(arr, r)) {
				arr[i] = r;
			} else {
				i--;
			}
		}
		/* int i=0;
		 * while(i<arr.length){
		 * 		int r = ran();
		 * 		if(tof(arr,r)){
		 * 			arr[i] = r;
		 * 			i++;
		 * 		}
		 * }
		 * }
		 * */

	}

	// 4. 배열을 출력하는 메서드
	// - 사용자 번호 1 2 3 4 5 6
	// - 당첨번호 1 2 3 4 5 6 [7]
	public void print(int[] arr) {
		if(arr==null||arr.length<=0) {
			System.out.println("오류!!!!");
			return;
		}
		for(int i = 0;i<6;i++) {
			System.out.print(arr[i]+" ");
		}
		if(arr.length==7) {
			System.out.print("["+arr[arr.length-1]+"]");
		}
		
			System.out.println();
		}
	

	// 5. 당첨 확인하는 메서드
	// - 사용자번호, 당첨번호 받아서 등수를 리턴(or 출력)하는 메서드
	/*
	 * - 6개 일치 = 1등(순서 상관 없음, 보너스 제외) - 5개 일치 + 보너스 번호 = 2등 - 5개 일치 = 3등 - 4개 일치 =
	 * 4등 - 3개 일치 = 5등 - 꽝
	 */
	public int rank(int[] arr, int[] arr1) {
		if(arr==null||arr.length<=0||
				arr1==null||arr1.length<=0) {
			System.out.println("오류!!!!");
			return -999999;
		}
		// user / lotto 배열 위치가 바뀌어서 들어올때
		if(arr.length>=arr1.length) {
			System.out.println("유저 혹은 로또의 값이 잘못 들어왔습니다.");
			return -999999;
		}
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr1[j]) {
					cnt++;
				}
			}
//			if(tof(arr, arr1[arr.length-1])==false){
//				cnt++;
//			}
		}
		switch (cnt) {
		case 3:
			System.out.println("5등 당첨");
			return 5;
		case 4:
			System.out.println("4등 당첨");
			return 4;
		case 5:
			for (int i = 0; i < arr.length; i++) {
				if (arr1[6] == arr[i]) {
					System.out.println("2등 당첨");
					return 2;
				}}
//				if(tof(arr, arr1[arr1.length-1])) {
//					System.out.println("2등 당첨");
//					return 2;
//				}
				
			
			System.out.println("3등 당첨");
				return 3;
		case 6:
			System.out.println("1등 당첨");
			return 1;
			default: 
				System.out.println("꽝입니다");
				return 0;

		}

	}

	public static void main(String[] args) {
		// 로또 만들기
//		 - 사용자 번호 (6자리)
		Exam01 ex = new Exam01();
		int[] user = new int[6];
//		 - 당첨 번호 (7자리)
		int[] lotto = new int[7];
//		사용자 번호 생성 및 출력
		int b=0;
		int a=0;
		while(a!=6) {
		a=ex.rank(user, lotto);
		if(a==1) {
			break;
		}
		ex.lotto(user); //3번 메서드 (내부에서 1번, 2번 메서드 사용중)
		System.out.print("유저번호 : ");
		ex.print(user); //4번 메서드
//		당첨 번호 생성 및 출력
		ex.lotto(lotto); //3번 메서드 (내부에서 1번, 2번 메서드 사용중)
		System.out.print("당첨번호 : ");
		ex.print(lotto); //4번 메서드
//		당첨 등수 출력
//		ex.rank(user, lotto); //5번 메서드
		b++;
		}
		System.out.println("시도횟수 : "+b+"회");
		System.out.println("비용 : "+b+"000원");
	}

}
