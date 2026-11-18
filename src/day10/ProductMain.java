package day10;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		// 키오스크
		/* product(상품) class : 상품명, 가격(판매금액)
		 *  order(주문) class : 상품명, 개수, 가격(판매금액), 금액(개수*가격)
		 *  
		 *  
		 * */
		// Product[] menu = new Product[5]; // => 상품리스트
		// 임의의 상품등록
		// 주문 => order 객체 발생 => Order[] order = new Order[5];
		
		/* 1. 전체 제품 보여주기
		 * 2. 주문 > 제품명, 수량 입력받기
		 * 3. order 객체 생성 => 추가
		 * 4. 반복
		 * 5. order => 배열이 다 차면 배열 증가 (배열 복사)
		 * 6. 영수증 출력
		 * 
		 * ex)
		 * 김밥 2 3000 => 6000
		 * 라면 3 5000 => 15000
		 * 사이다 2 2000 => 4000
		 * -----------------------
		 * 총 금액 25000
		 * */
		Scanner sc = new Scanner(System.in);
		Order o = new Order();
		int cnt=0;
		int ct=0;
		// 2. 주문을 담을 Order[]생성
		Order[] oArr= new Order[0];
//		1. 판매할 상품 등록 Product[]
		Product[] p = new Product[5];
//		1-2. 배열에 객체 생성 => 등록
//		menu[0] = new Product("김밥". 3000);
//		menu[1] = new Product("라면". 5000);
//		menu[2] = new Product("사이다". 2000);
//		menu[3] = new Product("콜라". 2000);
//		menu[4] = new Product("공기밥". 1000);
		
//		1-3. 객체를 생성 후 => insertProduct를 호출 => 배열에 등록
//		Product p = new Product();
//		p.insertProduct("111", 11111);
//		menu[4] = p ;
//		
//		char ok='y'; // y/n
//		while(ok!='n'){
//			System.out.println("주문하시겠습니까? (y/n)");
//			ok = sc.next().charAt(0);
//			if(ok=='n') {
//				System.out.println("주문을 종료합니다.");
//				break;
//			}
//			if(ok=='y') {
//				//처리
//				//메뉴를 출력
//				for(int i=0;i<menu.length;i++) {
//					System.out.println((i+1)"."+menu[i]);
//				}
//				System.out.println("menu >");
//				int menuNo=sc.nextInt();
//				if(menuNo>5||menuNo<1) {
//					System.out.println("없는번호입니다.");
//				}
//				System.out.println("수량 >");
//				int count = sc.nextInt();
//				
//				// 메뉴 => menu[menuNo-1].getName / menu[menuNo-1].getPrice
//				
//		
//				// 주문 객체 생성
//				Order o = new Order(menu[menuNo-1],count);
//		
//				// 3. 주문 배열이 꽉 찼는지 확인
//				if(order.lenth == cnt) {
//					// 3-1. 새 배열 생성
//					Order[] tmp = new Order[order.length+3];
//					// 3-2. 배열 복사
//					System.arraycopy(order, 0, tmp, 0, order.length);
//					// 3-3. 배열 주소 변경
//					order=tmp;
//				}
//				order[cnt]=0;
//				cnt++;
//			}else {
//				System.out.println("y/n만 선택해주세요.");
//			}
//		
//		}
//			//4. 주문 내역 출력
//		System.out.println("--주문내역 출력--");
//		int sum=0;
//		for(int i =0;i<cnt;i++) {
//			System.out.println(order[i]);
//			sum+=order[i].getTotal();
//		}
//		
//		if(cnt==0) {
//			System.out.println("주문내역이 없습니다.");
//		}
//		System.out.println("------------------");
//		System.out.println("총 주문금액 : "+sum);
		
		System.out.println("상품등록");
		for(int i =0; i<p.length;i++) {
			p[i]= new Product();
			System.out.print("제품명 : ");
			String name=sc.next();
			p[i].setName(name);
			System.out.println();
			System.out.print("금액 : ");
			int price = sc.nextInt();
			p[i].setPrice(price);
		}
		System.out.println("키오스크");
//		메뉴판
		while(true) {
			
			for(int i=0;i<p.length;i++) {
				System.out.println(p[i].toString());
			}
			System.out.println("제품 선택");
//			String choice=sc.next();
			int choi=sc.nextInt();;
//			int ch=0;
//			if(ch<0||ch>5) {
//				System.out.println("다시 입력해주세요");
//				ch=sc.nextInt();
//			}else {		
//				for(int i=0;i<p.length;i++) {
//					if(choice.equals(p[i].getName())) {
//						System.out.println("수량 입력");
//						int select = sc.nextInt();
//						o.setPrice(p[i].getPrice());
//						
//						o.setSelect(select);
//					}
//				}
//			}
			if(cnt==oArr.length) {
				Order[] arr = new Order[oArr.length+1];
				System.arraycopy(oArr, 0, arr, 0, oArr.length);
				oArr=arr;
				cnt++;
			}
			oArr[ct]=new Order();
			switch(choi) {
			case 1 : 
				oArr[ct].setName(p[choi-1].getName());
				oArr[ct].setPrice((p[choi-1].getPrice()));
				break;
			case 2 :
				oArr[ct].setName(p[choi-1].getName());
				oArr[ct].setPrice((p[choi-1].getPrice()));
			break;
			case 3 : 
				oArr[ct].setName(p[choi-1].getName());
				oArr[ct].setPrice((p[choi-1].getPrice()));
			break;
			case 4 :
				oArr[ct].setName(p[choi-1].getName());
				oArr[ct].setPrice((p[choi-1].getPrice()));
			break;
			case 5 : 
				oArr[ct].setName(p[choi-1].getName());
				oArr[ct].setPrice((p[choi-1].getPrice()));
			break;

			default : System.out.println("다시 입력해주세요");
			break;
			}
			if(choi>0&&choi<=5) {	
				System.out.println("수량 입력");
				int select = sc.nextInt();
				o.setSelect(select);
				oArr[ct].setSelect(select);
				oArr[ct].sumPrice();
				o.list(oArr[ct].sumPrice());
				System.out.println("계속하려면 1번, 아니면 나머지");
				int a= sc.nextInt();
				ct++;
				if(a!=1) {
					break;
				}
			}
		}
		/* {김밥, 2, 2000 ,4000}
		 * */
		o.allPrice();
		for(int i=0;i<o.getAllPrice().length;i++) {
			System.out.println(oArr[i].getName()+" : "
		+oArr[i].getPrice()+" * "+oArr[i].getSelect()+" = "+
					oArr[i].getSum()+"원");
		}
		System.out.println("총 금액 : "+o.allPrice()+"원");
		sc.close();
	}

}
