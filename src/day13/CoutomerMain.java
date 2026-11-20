package day13;

import java.util.Scanner;

public class CoutomerMain {

	public static void main(String[] args) {
		// 백화점 고객 등급
		/* - 일반고객(적립) Gold(할인+적립) / VIP고객(할인+적립)
		 * , 5%, 7%
		 * 고객 => Coutomer(부모클래스)
		 *  - 멤버변수 : 고객 ID, 고객명, 등급, 포인트(적립), 적립 비율
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
		 * 
		 * 1. 포인트 적립 계산 메서드
		 *  - 구매 금액을 기준으로 포인트 계산 => 포인트 누적 적립
		 *  (실버, 골드, VIP 따로)(할인된 금액으로 계산)
		 *  - 구매 금액을 기준으로 할인여부 확인 후 할인된 금액을 리턴
		 * 2. 출력 메서드
		 *  - 홍길동 님은 Gold 고객이며, 현재 포인트는 5000점 입니다.
		 *  - 짱구님은 VIP 고객이며, 현재 포인트는 5000점 입니다.
		 *  - 전담 상담사 : (박상담) 전화번호 : (010-1234-1324) <- VIP만 추가
		 *  
		 * */
		Scanner sc= new Scanner(System.in);
		Customer01 c= new Customer01("111","홍길동");
		GoldCustomer g = new GoldCustomer("222", "김영이");
		VIPCustomer v = new VIPCustomer("333", "김백금", "박상담", "010-1234-1234");
		int price =c.calcPrice(10000);
		int price1 =g.calcPrice(10000);
		int price2 =v.calcPrice(10000);
		System.out.println("지불 금액 : "+price);
		c.printInfo();
		System.out.println("지불 금액 : "+price1);
		g.printInfo();
		System.out.println("지불 금액 : "+price2);
		v.printInfo();
		Customer01[] cu = new Customer01[10];
		cu[0] = c;
		cu[1] = new Customer01("222","최순자");
		cu[2] = new Customer01("333","김영이");
		cu[3] = new GoldCustomer("444","김철수");
		cu[4] = new Customer01("555","이순신");
		cu[5] = new VIPCustomer("666","이백금","1","2543");
		cu[6] = new Customer01("777","김골드");
		cu[7] = new VIPCustomer("888","박한수","박철중","010-2362-6233");
		cu[8] = new GoldCustomer("999","최영일");
		cu[9] = new VIPCustomer("101","공하나","박철중","010-2362-6233");
		
		System.out.println("지불 금액과 포인트 금액 계산");
		int price3=100000;
		for(int i=0;i<cu.length;i++) {
			System.out.println("지불 금액 : "+price3);
			cu[i].calcPrice(price3);
			cu[i].printInfo();
			System.out.println();
		}
		
		// 다운 캐스팅
		// 상담사 짱아(1) => 철이(3)
		for(int i=0; i<cu.length;i++) {
			if(cu[i] instanceof VIPCustomer) {
				VIPCustomer vip =  (VIPCustomer)cu[i];
				if(vip.getAgentName().equals("박철중")) {
					vip.setAgentNum("3");
					vip.setAgentName("철이");
					break;
				}
			}
		}
		
		
		for(int i=0;i<cu.length;i++) {
			if(cu[i] instanceof VIPCustomer) {
				
				cu[i].printInfo();
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Customer cs= new Customer();
//		VIP v = new VIP();
//		Gold g = new Gold();
//		//cs.tierCal();
////		cs.priceSum(sc);
//		cs.csAdd(sc);
//		cs.sumPrice(sc);
//		cs.printCs();
//		
//		g.csAdd(sc);
//		g.sumPrice(sc);
//		g.printCs();
//		
//		v.csAdd(sc);
//		v.sumPrice(sc);
//		v.printCs();
		sc.close();
	}

}

class VIP extends Customer{
	private String tier ="VIP";
	private String name ;
	private String agentNum= "010-1234-1234";
	private String agentName="박상담";
	private int pt=0; // 현재 포인트
	@Override
	public void csAdd(Scanner sc) {
		// TODO Auto-generated method stub
		super.csAdd(sc);
	}
	@Override
	public void printCs() {
		// TODO Auto-generated method stub
	
		super.printCs();
		System.out.println("전문상담사 : "+agentName+" 전화번호 : "+agentNum);
	}
	
	@Override
	public void sumPrice(Scanner sc) {
		// TODO Auto-generated method stub
		super.sumPrice(sc);
	}
	public VIP() {}
	
	

	public String getTier() {
		return tier;
	}
	public String getName() {
		return name;
	}
	public String getAgentNum() {
		return agentNum;
	}
	public String getAgentName() {
		return agentName;
	}	
	public int getPt() {
		return pt;
	}

	public void setTier(String tier) {
		this.tier = tier;
	}
	public void setName(String name) {
		this.name = name;
	}	
	public void setAgentNum(String agentNum) {
		this.agentNum = agentNum;
	}	
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}		
	public void setPt(int pt) {
		this.pt = pt;
	}

}


class Gold extends Customer{

	private String tier = "Gold";
	private String name ;
	private int pt=0; // 현재 포인트
	public Gold() {}
	
	
	
	
	
	
	@Override
	public void csAdd(Scanner sc) {
		// TODO Auto-generated method stub
		super.csAdd(sc);
	}

	@Override
	public void sumPrice(Scanner sc) {
		// TODO Auto-generated method stub
		super.sumPrice(sc);
	}

	@Override
	public void printCs() {
		// TODO Auto-generated method stub
		super.printCs();
	}



	public String getTier() {
		return tier;
	}
	public String getName() {
		return name;
	}
	public int getPt() {
		return pt;
	}
	
	public void setTier(String tier) {
		this.tier = tier;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPt(int pt) {
		this.pt = pt;
	}

}

class Customer{
	private int id;
	private String tier ="Silver";
	private String name;
	private int pt=0; // 현재 포인트
	
	public Customer() {}
	public Customer(String tier) {
		this.tier = tier;
	}
	//------------------------
	// 이름, 티어 입력받아 계산 id 생성 
	public void csAdd(Scanner sc) {
		System.out.println("이름 입력");
		this.name=sc.next();
		id++;
		
	}
	
	public void sumPrice(Scanner sc) {
		System.out.println("금액 입력");
		int price=sc.nextInt();
		int total=0;
		int sum=0;
		double dc=0; //할인률
		double pointSave = 0; // 적립비율
		switch(getTier()) {
		case "Silver" : pointSave=0.01;//적립 비율
			sum=(int)((int)price*pointSave);
			break;
		case "Gold" : pointSave=0.03; dc=0.05;
		sum=(int)((int)(price-(price*dc))*pointSave);
			break;
		case "VIP" : pointSave=0.05;dc=0.1;
		sum=(int)((int)(price-(price*dc))*pointSave);
			break;
		}
		System.out.println(getTier());
		total+=sum;
		setPt(total);
		
	}
	
	public void printCs() {
		
		System.out.println(id+". 이름  : "+this.name+" 등급 : "+getTier()
		+" 포인트 : "+getPt());
	}
	
	//-------------------------
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTier() {
		return tier;
	}
	public void setTier(String tier) {
		this.tier = tier;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPt() {
		return pt;
	}
	public void setPt(int pt) {
		this.pt = pt;
	}

}
