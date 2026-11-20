package day13;

public class GoldCustomer extends Customer01{
	private double saleRatio;
	
	public GoldCustomer(String id, String name) {
		super(id, name);
		this.customerGread = "Gold";
		ratio=0.03;
		this.saleRatio=0.05;
	}

	@Override
	public int calcPrice(int price) {
		// 부모 메서드 오버라이딩
		super.calcPrice(price);
		return price -(int)(price*saleRatio); 
	}

	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	
	
	
	
}
