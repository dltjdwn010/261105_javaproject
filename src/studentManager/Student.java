package studentManager;

public class Student  {
	
	private String name;
	private String phone;
	private final String TJO = "더조은"; 
	private String adress;
	private int index;
//	private String[] su;
	private Subject[] s ;
//	private Subject sub= new Subject();
	public Student() {
		s= new Subject[5];
	}
	
	public void addSub(Subject sub) {
//		System.out.println(sub.getPeriod()+"C");
		if (index == s.length) {
			Subject[] arr = new Subject[s.length + 1];
			System.arraycopy(s, 0, arr, 0, s.length);
			s = arr;
		}
		s[index]=sub;
		index++;
		System.out.println(s.length);
//		this.su = new String[]{sub.getSub(),sub.getPeriod(),sub.getTime()};
		
	}
	
	public void removeSubject(String name) {
		// 수강코드를 매개변수로 받아 course 배열에서 삭제하는 메서드 
		int cnt = -1;
		for(int i=0;i<index; i++) {
			if(s[i].getSub().equals(name)) {
				cnt=i;
				break;
			}
		}
		if(cnt==-1) {
			System.out.println("찾는 과목이 없습니다.");
			return;
		}
		//index를 찾았다면
		// 삭제 : index 번지부터 index -1 번지까지 뒷번지의 값을 앞으로 옮기는 작업
		for(int i=cnt; i<index-1;i++) {
			s[i]=s[i+1];
		}
		// 마지막번지는 null 처리
		s[index-1]=null;
		index--;
		System.out.println("수강 취소 완료");
	}
	
	
	public void subPrint() {
		for(int i=0;i<s.length;i++) {
			System.out.println(i+1+"."+s[i]);
			
		}
	}
	public int getIndex() {
		return index;
	}

	public Subject[] getS() {
		return s;
	}
	public void setS(Subject[] s) {
		this.s = s;
	}
//	public String[] getSu() {
//		return su;
//	}
//	public void setSub(String[] sub) {
//		this.su = sub;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getTJO() {
		return TJO;
	}
	@Override
	public String toString() {
		return "이름 =" + name + ", 번호 =" + phone + ", 학원명=" + TJO + ", 주소=" + adress + "]";
	}
	
	
	
}
