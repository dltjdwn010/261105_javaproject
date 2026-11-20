package day12;

public class Super02 {

	public static void main(String[] args) {
		// 출력용 클래스
		Dog d = new Dog("왈왈이", "개");
		Cat c = new Cat("어흥이", "고양이");
		Tiger t = new Tiger("엉엉슨", "호랑이");
		d.printInfo();
		d.howl();
		c.printInfo();
		c.howl();
		t.printInfo();
		t.howl();
	}

}
class Cat extends Animal{
	public Cat(String name, String category) {
		super(name,category);
	}

	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("이얏옹");
	}
	
}

class Tiger extends Animal{
	public Tiger(String name, String category) {
		super.setName(name);
		super.setCategory(category);
	}
	
	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("엉엉");
	}
	
	
}

// 자식 클래스
class Dog  extends Animal{
	
	public Dog(String name, String category) {
	// 부모 생성자를 호출
		super(name, category);
//		super.setName(name);
//		super.setCategory(category);
	}

	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("왈왈");
	}
	
}

// 부모 클래스
class Animal{
	private String name; // 이름
	private String category; // 종
	
	// 생성자 => 상속 안됨.
	public Animal(){}
	public Animal(String name, String category) {
		this.name=name;
		this.category=category;
	}
	
	// 출력메서드
	public void printInfo() {
		System.out.println("이름 : "+name+"("+category+")");
	}
	
	// 울음소리 출력 메서드 => 자식이 구현하도록 남겨두기
	public void howl() {
		System.out.println(name+"의 울음소리");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", category=" + category + "]";
	}
	
}
