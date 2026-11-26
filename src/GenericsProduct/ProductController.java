package GenericsProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductController {
	
	// 메뉴저장 리스트
	private List<Product<String, Integer>> menu = new ArrayList<>();
	// 주문저장 리스트
	private List<Order<String, Integer>> order = new ArrayList<>();

	
//	---------------------메뉴 추가
	public void insertMenu(Scanner sc) {
		System.out.println("이름 입력");
		String name = sc.next();
		
//		if (menu.contains(p)) {		
//			System.out.println("동일한 이름이 있습니다.");
//		}
		while(true) {
		Product p = new Product(name);
			if (menu.contains(p)) {		
			System.out.println("동일한 이름이 있습니다.");
			name = sc.next();
		}else {
			break;
		}
		}
//		for(Product<String, Integer> tmp : menu) {
//			
//			if(tmp.getMenu().equals(name)) {
//				System.out.println("동일한 이름이 있습니다.");
//				return;
//			}
//		}
		
		System.out.println("가격 입력");
		int price = sc.nextInt();
		menu.add(new Product<String, Integer>(name, price));

	}
//	---------------------메뉴 출력
	public void menuPrint() {
		for(int i=0;i<menu.size();i++) {
			System.out.println("제품명 : "+menu.get(i).getMenu()+
				" 가격 : "+menu.get(i).getPrice()	);
		}
	}
//	---------------------------제품 주문
	public void orderMenu(Scanner sc) {
		System.out.println("메뉴입력");
		String name = sc.next();
		// String 입력후 입력받은 이름과 같은 이름 찾기, 
		// 이름의 밸류값에 count 곱하기
		System.out.println("수량 입력");
		int cnt = sc.nextInt();
		
		for(int i=0; i<order.size();i++) {	
			if(order.get(i).getMenu().equals(name)) {
				order.set(i, new Order<String, Integer>(menu.get(i), order.get(i).getCount() +cnt));
				return;
			}
		}
		
		for(int i=0; i<menu.size();i++) {
			if(menu.get(i).getMenu().equals(name)) {
				order.add(new Order<String, Integer>(menu.get(i), cnt));			
			}	
		}		
	}	
//	----------------------- 주문내역
	public void orderPrint() {
		for(int i=0;i<order.size();i++) {
			System.out.print("제품명 : "+order.get(i).getMenu());
			System.out.print(" 가격 : "+order.get(i).getPrice());
			System.out.print(" 수량 : "+order.get(i).getCount());
			System.out.println(" 총합 : "+order.get(i).getTotal());
		}
	}
}
