package GenericsProduct;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ProductController pc = new ProductController();
		int choice = 0 ;
			while(choice!=5) {
				try {
				System.out.println("1. 메뉴추가 | 2. 메뉴보기 | 3.제품주문 | 4.주문내역 보기 | 5. 종료");
				choice =sc.nextInt();
				switch(choice) {
				case 1 : pc.insertMenu(sc);
				break;
				case 2 : pc.menuPrint();
				break;
				case 3 : pc.orderMenu(sc);
				break;
				case 4 : pc.orderPrint();
				break;
				case 5 : System.out.println("종료");
				break;
				default : System.out.println("다시입력");
				break;
				}
			} catch (Exception e) {
				System.out.println("ERROR 숫자로 입력");
				
				sc.nextLine();
			}
				
			}
			
		
		
		
	
	}

}
