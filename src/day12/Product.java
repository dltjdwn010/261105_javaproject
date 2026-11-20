package day12;

public class Product {
	
	protected String name;
	protected int price;
	
	public Product() {
		
	}
	public Product(String name, int price) {
		this.name=name;
		this.price=price;
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		System.out.println(price+" get");
		return price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		System.out.println(price+" set");
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	
}
