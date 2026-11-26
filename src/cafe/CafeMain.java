package cafe;

import java.util.Scanner;

public class CafeMain {

	public static void main(String[] args) {
		// cafe Main
				/* 프로그램 설계서 
				 * kiosk 
				 * - 메뉴명, 가격, 옵션, 옵션가격, 수량
				 * --------------------------------
				 * - 1.Coffee (에스프레소) => 2000  => 부모클래스 
				 * - 2.Americano => Coffee + 물(500) => 2500
				 * - 3.Latte => coffee + 우유(1000) => 3000
				 * - 4.Mocha => coffee + 초콜릿(1500) => 3500
				 * 
				 * 주문을 받아 Coffee[] 주문 정보 저장 => 영수증
				 * 
				 * 1. 아메리카노(2000)
				 * 2. 라떼 + 우유 (3000)
				 * 3. 모카 + 초콜릿(3500)
				 * 0. 주문완료 (영수증출력)
				 * 
				 * 1번 아메리카노 2개 주문
				 * 2번 라떼 2개 주문
				 * -영수증-
				 * 아메리카노 	2개 	2000  :  4000
				 * 라떼 		2개	3000  :  6000
				 *---------------------------
				 *총 지불금액 10000원	
				 * */
//			Coffee[] cafe = new Coffee[6];
//			cafe[0] = new Americano(5, false);
//			cafe[1] = new Latte(2, true);
//			cafe[2] = new Moca(3, true);
//			cafe[3] = new Americano(1, false);
//			cafe[4] = new Moca(4, true);
//			cafe[5] = new Latte(0, false);
//			for(Coffee tmp : cafe) {
//				System.out.println(tmp.toString());
//			}
			
			Scanner sc = new Scanner(System.in);
			CoffeeController cc = new CoffeeController(sc);
			cc.run();

			sc.close();
	}

}
