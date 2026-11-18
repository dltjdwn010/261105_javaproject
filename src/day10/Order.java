package day10;

import java.util.Arrays;

public class Order {

//	주문 클래스
//	상품명, 개수, 가격(판매금액), 금액(개수*가격)
//	{상품명, 개수, 가격, 금액}
	Product p = new Product();
	private String name; //상품명
	private int price; // 판매금액

	private int select;
	private int sum;
	private int cnt;
	private int[] allPrice= new int[cnt];
	
	public Order() {}
	public Order(String name, int price, int cnt) {
		this.name=name;
		this.price=price;
		this.cnt=cnt;
		this.sum=price*cnt;
	}
	
	//주문 추가
	public void insertOrder(Product p, int cnt) {
		this.name=p.getName();
		this.price=p.getPrice();
		this.cnt=cnt;
		this.sum=price*cnt;
	}
	public int[] getAllPrice() {
		return allPrice;
	}

	public void setAllPrice(int[] allPrice) {
		this.allPrice = allPrice;
	}

	public int sumPrice() {
		sum= price*select;
		return sum;
		
	}

	public void list(int price) {
		if (cnt == allPrice.length) {
			int[] arr = new int[this.allPrice.length + 1];
//			int[] arr1 = new int[this.selectList.length+1];
			
//			System.arraycopy(this.selectList, 0, arr1, 0, this.selectList.length);
			System.arraycopy(this.allPrice, 0, arr, 0, this.allPrice.length);
			this.allPrice = arr;
//			this.selectList=arr1;
		}

		allPrice[cnt]=price;
//		selectList[cnt]=select;
		cnt++;
	}
	public int allPrice() {
		int allSum=0;
		for(int i=0;i<allPrice.length;i++) {
			allSum+=allPrice[i];
		}
		return allSum;
	}
	
//	public void selectList() {
//		if (cnt == allPrice.length) {
//			int[] arr = new int[this.allPrice.length + 1];
//			System.arraycopy(this.allPrice, 0, arr, 0, this.allPrice.length);
//			this.allPrice = arr;
//		}	
//		allPrice[cnt]=price;
//		
//	}
	
	public void printList() {
		for(int i=0;i<allPrice.length;i++) {
			System.out.println(Arrays.toString(this.allPrice));
			
		}
	}
	public int getPrice() {
		return price;
	}
	public int getSum() {
		return sum;
	}
	public String getName() {
		return name;
	}
	
	public int getSelect() {
		return select;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public void setSelect(int select) {
		this.select = select;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [name=" + name + ", price=" + price + ", cnt=" + cnt + "]";
	}
	
}

