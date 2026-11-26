package cafe;

public abstract class Coffee {
	// - 메뉴명, 가격, 옵션, 옵션가격, 수량
		protected String name;
		protected int basePrice;
		protected int quantity;
		
		public Coffee() {}
		public Coffee(String name, int price, int cnt) {
			this.name= name;
			this.basePrice = price;
			this.quantity = cnt;
		}
		
		public abstract int getPrice();
		
		public abstract String getDescription();
		
		
}

class Americano extends Coffee{
	
	private int extra_price = 500;
	private boolean extraWater;
	
	public Americano(int cnt, boolean extraWater) {
		super("아메리카노", 2000, cnt);
//			  	name	basePrice  quantity
		this.extraWater=extraWater;
	}
	
	@Override
	public int getPrice() {
		extra_price = extraWater ? extra_price=500 : 0;
		
		return (basePrice+extra_price)*quantity;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return extraWater ? name + "+(물추가)" : name;
	}
	
}

class Latte extends Coffee{
	
	private int extra_price = 1000;
	private boolean extraMilk;
	
	public Latte(int cnt, boolean extraWater) {
		super("라떼", 3000, cnt);
//			  	name	basePrice  quantity
		this.extraMilk=extraWater;
	}
	
	@Override
	public int getPrice() {
		extra_price = extraMilk ? extra_price=1000 : 0;
		
		return (basePrice+extra_price)*quantity;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return extraMilk ? name + "+(우유추가)" : name;
	}
	
}

class Moca extends Coffee{
	
	private int extra_price = 1500;
	private boolean extraChoco;
	
	public Moca(int cnt, boolean extraWater) {
		super("모카", 3500, cnt);
//			  	name	basePrice  quantity
		this.extraChoco=extraWater;
	}
	
	@Override
	public int getPrice() {
		extra_price = extraChoco ? extra_price=1500 : 0;
		
		return (basePrice+extra_price)*quantity;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return extraChoco ? name + "+(초코추가)" : name;
	}
	
}
