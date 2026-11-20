package day12;


public class Order extends Product{
//	주문 클래스
//	상품명, 개수, 가격(판매금액), 금액(개수*가격)
//	{상품명, 개수, 가격, 금액}
	//상품명
	// 판매금액
	private int select;
	private int sum;
	private int cnt;
	private int[] allPrice= new int[cnt];
	int c=0;
	
	
	public Order() {}
	
	public Order(String name, int price, int count) {
		super.setName(name);
		super.setPrice(price);
		this.select=count;
		this.sum=super.getPrice()*count;
	}
	
	public int sum() {
		System.out.println(super.price);
//작동	System.out.println(select);
		sum=super.price*select;
		
		System.out.println("합계: "+sum);
		return sum;
	}
	
	public void list(int price) {
		if (cnt == allPrice.length) {
		int[] arr = new int[this.allPrice.length + 1];

		System.arraycopy(this.allPrice, 0, arr, 0, this.allPrice.length);
		this.allPrice = arr;
	}

	allPrice[cnt]=sum;
	cnt++;
}
	
	
	public int allPrice() {
		int allsum=0;
		for(int i=0;i<allPrice.length;i++) {
			allsum+=allPrice[i];
		}
		return allsum;
	}
	
	public void print() {
		
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getSelect() {
		return select;
	}
	public int getSum() {
		return sum;
	}
	public int[] getAllPrice() {
		return allPrice;
	}
//	-==-==================-=-=--=-=-==---=-=
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setSelect(int select) {
		this.select = select;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public void setAllPrice(int[] allPrice) {
		this.allPrice = allPrice;
	}
	
}
