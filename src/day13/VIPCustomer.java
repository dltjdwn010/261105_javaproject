package day13;

public class VIPCustomer extends Customer01 {
//	saleRatio, agentNum, agentName
	private double saleRatio;
	private String agentNum;
	private String agentName;
	
	public VIPCustomer(String id, String name, String agentName, String agentNum) {
		super(id, name); // cutomer 생성자 셋팅
		customerGread = "VIP";
		ratio = 0.05;
		this.saleRatio = 0.1;
		this.agentName= agentName;
		this.agentNum=agentNum;
	}

	
	
	
	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		super.calcPrice(price);
		return price -(int)(price*saleRatio); 
	}




	@Override
	public void printInfo() {
		// 부모 클래스에서 작성한 출력 내용
		super.printInfo();
		System.out.println("전담 상담사 : "+agentName+" 전화번호 : "+agentNum);
		
	}




	@Override
	public String toString() {
		return "VIPCustomer [saleRatio=" + saleRatio + ", agentNum=" + agentNum + ", agentName=" + agentName + "]";
	}




	public String getAgentNum() {
		return agentNum;
	}




	public void setAgentNum(String agentNum) {
		this.agentNum = agentNum;
	}




	public String getAgentName() {
		return agentName;
	}




	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}




	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	
}
