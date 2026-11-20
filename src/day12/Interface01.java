package day12;

public class Interface01 {

	public static void main(String[] args) {
		// 인터페이스(interface)
		/* 추상 메서드와 상수(final)로만 이루어진 것
		 * 추상 메서드 : 미완성 메서드 선언부만 있고, 구현이 없는 메서드
		 * 추상 클래스 : 일반메서드 + 추상메서드 
		 * 인터페이스 : 추상메서드만 존재
		 * 
		 * 추상 클래스 / 인터페이스 : 객체 생성불가
		 * => 반드시 구현해야만 객체를 생성할 수 있음.
		 * 
		 * 인터페이스 
		 * - 기능요약서 : 메뉴얼 화
		 * - 구현 : implements
		 * - 멤버변수를 포함하지 않음.
		 * - 각자 구현하는 구현 클래스가 멤버변수가 다양하다는 것을 고려해 표준화된 메서드로 정리
		 * 
		 * 상속 : 다중 상속 불가능 (단일 상속 원칙)
		 * 구현 : 다중 구현이 가능
		 * 상속 + 구현 : 동시에 가능
		 * 
		 * */
		TV t = new TV();
		t.turnOn();
		t.turnOff();
		t.volUp();
		t.volDown();
	}

}


interface Power{
	abstract void turnOn(); // 추상 키워드를 써도 / 안써도 상관없음.
	abstract void turnOff();
}

interface Remocon{
	void volUp();
	void volDown();
//	void chUp();
//	void chDown();
}

// 다중 구현시 class 클래스명 implemnets 인터페이스, 인터페이스 { }
// 상속 + 구현 class 클래스명 extends 상속 클래스명 implements 인터페이스명{}
class TV implements Power, Remocon,Test{

	private boolean power;
	private int vol;
	
	
	@Override
	public void volUp() {
		// TODO Auto-generated method stub
		vol++;
		System.out.println("vol : "+vol);
	}

	@Override
	public void volDown() {
		// TODO Auto-generated method stub
		vol--;
		System.out.println("vol : "+vol);
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		power=true;
		System.out.println("전원이 켜졌습니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		power=false;
		System.out.println("전원이 꺼졌습니다.");
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
	
}