package day13;

public class Customer01 {
	 /*  - 멤버변수 : 고객 ID, 고객명, 등급, 포인트(적립), 적립 비율
	* 등급 체계
		 * Silver / Gold / VIP
		 * - 일반고객(기본등급) : Silver
		 * - 기본 적립 비율 : 구매 금액의 1%
		 * - Gold 
		 * - 할인 비율 : 5%
		 * - 기본 적립 비율 : 구매 금액의 3%
		 * - VIP 
		 * - 할인 비율 : 10%
		 * - 기본 적립 비율 : 구매 금액의 5%
		 * - VIP : 전담 상담사 멤버변수 추가(agentNum, agentName)
		 *   */
	protected String customerId;
	protected String customerName;
	protected String customerGread; // 등급
	protected int point; // 포인트
	protected double ratio;
	
	public Customer01() {}
	public Customer01(String customerId, String name) {
		this.customerId=customerId;
		this.customerName=name;
		this.customerGread="Silver";
		this.ratio = 0.01;
	}
	
	// 포인트 적립 메서드 => 구매금액 리턴
	/* 매개변수 : 가격 / 리턴타임 : int
	 * */
	public int calcPrice(int price) {
		this.point += (int)(price*ratio);
		return price;
	
	}
	// 출력
//	 *  - 홍길동 님은 Gold 고객이며, 현재 포인트는 5000점 입니다.
	public void printInfo() {
		System.out.println(customerName+"님은 "+customerGread+"등급이며 ");
		System.out.println("현재 포인트는 "+point+" 입니다");
	}
	
	
	@Override
	public String toString() {
		return "Customer01 [customerId=" + customerId + ", customerName=" + customerName + ", customerGread="
				+ customerGread + ", point=" + point + ", ratio=" + ratio + "]";
	}
	
}
