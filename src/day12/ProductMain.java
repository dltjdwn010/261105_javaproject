package day12;

import java.util.Scanner;



public class ProductMain {

	public static void main(String[] args) {
		// 키오스크
		/*
		 * product(상품) class : 상품명, 가격(판매금액) order(주문) class : 상품명, 개수, 가격(판매금액),
		 * 금액(개수*가격)
		 * 
		 * 
		 */
		// Product[] menu = new Product[5]; // => 상품리스트
		// 임의의 상품등록
		// 주문 => order 객체 발생 => Order[] order = new Order[5];

		/*
		 * 1. 전체 제품 보여주기 2. 주문 > 제품명, 수량 입력받기 3. order 객체 생성 => 추가 4. 반복 5. order => 배열이
		 * 다 차면 배열 증가 (배열 복사) 6. 영수증 출력
		 * 
		 * ex) 김밥 2 3000 => 6000 라면 3 5000 => 15000 사이다 2 2000 => 4000
		 * ----------------------- 총 금액 25000
		 */
		Order[] oArr = new Order[5];
		Order o = new Order();
		Scanner sc= new Scanner(System.in);
		int ct=0;
		int cnt=0;
//		1. 판매할 상품 등록 Product[]
		Product[] p = new Product[5];
//		1-2. 배열에 객체 생성 => 등록
		p[0] = new Product("김밥", 3000);
		p[1] = new Product("라면", 5000);
		p[2] = new Product("사이다", 2000);
		p[3] = new Product("콜라", 2000);
		p[4] = new Product("공기밥", 1000);
		System.out.println(p[1].getPrice());
		o.setSelect(5);
		while(true) {
//		int sum=o.sum(5);
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i].toString());
		}
		System.out.println(cnt+"{"+oArr.length);
		System.out.println("제품 선택");
//		String choice=sc.next();
		cnt++;
		if(cnt==oArr.length) {
			Order[] arr = new Order[oArr.length+1];
			System.arraycopy(oArr, 0, arr, 0, oArr.length);
			oArr=arr;
		}
		int choi=sc.nextInt();;
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
			oArr[ct].sum();
			o.list(oArr[ct].sum());
			System.out.println("계속하려면 1번, 아니면 나머지");
			int a= sc.nextInt();
			ct++;
			if(a!=1) {
				break;
			}
		}
		}
		o.allPrice();
		System.out.println("제품명 \t 가격\t수량 \t 총 금액");
		for(int i=0;i<o.getAllPrice().length;i++) {
			System.out.println(oArr[i].getName()+"  \t"
		+oArr[i].getPrice()+"  \t"+oArr[i].getSelect()+"  \t"+
					oArr[i].getSum()+"원");
		}
		System.out.println("총 금액 : "+o.allPrice()+"원");
		sc.close();
	}

}
