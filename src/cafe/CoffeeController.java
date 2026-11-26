package cafe;

import java.util.Scanner;

public class CoffeeController {
	private final Scanner sc;
	private Coffee[] orders;
	private int index;

	public CoffeeController(Scanner sc) {
		this.sc = sc;
		this.orders = new Coffee[5];
		this.index = 0;
	}

	// 메뉴선택 => 원래 main에서 하던일
	public void run() {
		while (index < orders.length) {
			System.out.println("-- 커피 메뉴 --");
			System.out.println("1. 아메리카노(2000원) | 샷 추가 +500");
			System.out.println("2. 라떼(3000원) | 우유 추가 +1000");
			System.out.println("3. 모카(3500원) | 초코 추가 +1500");
			System.out.println("0. 주문 완료 | 영수증 출력");
			System.out.println("선택");
			int menu = sc.nextInt();
			if (menu == 0) {
				break;
			}
			if (menu < 1 || menu > 3) {
				System.out.println("잘못된 선택입니다. 다시입력");
				continue;
			}
			System.out.println("수량");
			int cnt = sc.nextInt();
			System.out.println("추가 옵션을 선택하시겠습니까? (y/n)");
//			char add = sc.next().charAt(0);
//			boolean addOption = (add=='y')? true : false;
//			equals = 대소문자 구분
//			equalsIgnoreCase = 대소문자 구분 안함
			boolean addOption = sc.next().equalsIgnoreCase("y") ? true : false;

			// 선택한 옵션 menu, cnt, option 여부
			// 해당 값을 주고, Coffee 클래스를 리턴
			Coffee coffee = createCoffee(menu, cnt, addOption);
			orders[index] = coffee;
			index++;
			System.out.println("=>" + coffee.getDescription() + "수량 : " + cnt + " " + coffee.getPrice());
		}
//		cc.run();
		printCoffee();
	}

	public Coffee createCoffee(int menu, int cnt, boolean addOption) {
//		switch(menu) {
////		case 1: return new Americano(cnt, addOption);
////		case 2: return new Latte(cnt, addOption);
////		case 3: return new Moca(cnt, addOption);
////			default : System.out.println("잘못된 입력");
////			return null;
//		}

		// 화살표 방식 (많이 사용하는 추세 jdk8, 11 사용불가, 14 이후부터 사용가능)
		return switch (menu) {
		case 1 -> new Americano(cnt, addOption);
		case 2 -> new Latte(cnt, addOption);
		case 3 -> new Moca(cnt, addOption);
		default -> null;

		};
		
	}
	
	public void printCoffee() {
		System.out.println("---영수증---");
		if(orders.length==0) {
			System.out.println("주문 내역이 없습니다.");
		}
		int sum=0;
		for(int i=0; i<index; i++) {
			sum+= orders[i].getPrice();
			System.out.println((i+1)+". " +orders[i].name+" "+orders[i].quantity+"개 : " 
			+ orders[i].getPrice());
		}
		System.out.println("-------------------------");
		System.out.println("총 결제 금액 : "+ sum);
//		for(Coffee tmp : orders) {
//			sum+=tmp.getPrice();
//		}
	}
	
}
