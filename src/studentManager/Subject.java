package studentManager;

public class Subject {
	private String sub;
	private String period;
	private String time;
	
	public Subject() {}
	public Subject(String sub, String period, String time) {
		this.sub=sub;
		this.period=period;
		this.time=time;
//		System.out.println(period+"B");
		
	}
	
	
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "수강=" + sub + ", 기간=" + period + ", 시간=" + time + "]";
	
				
	}
	
	
	
}
