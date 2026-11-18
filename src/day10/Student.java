package day10;

import java.util.Arrays;

public class Student {
	/*
	 * 학생 정보를 관리하기 위한 클래스 학생의 기본정보 : 이름, 전화번호, 주소, 생년월일 학원정보 : 학원명 final= "더조은", 지점
	 * 수강정보 : 수강과목[], 기간[](26.11.02 ~ 27.05.17) 수강 과목은 여러과목을 들을 수 있다.[5] / 기간[5] 같은
	 * 번지는 같은 값으로 인지
	 * 
	 * ex) 홍길동, 010-1111-1234, 인천, 000505 더조은, 인천지점 AI풀스택, 26.11.02 ~ 27.05.17 JAVA,
	 * 26.10.01 ~ 26.11.01(배열 추가) 과목을 추가하는 메서드 - 수강과목이 5개를 넘어가면 배열을 늘려서 처리
	 * 
	 * 각 정보를 출력하는 메서드 - 수강정보 출력할때 수강정보다 없다면? => 수강정보가 없습니다. 출력
	 */
//	학생 정보
	private String name;
	private String pn;
	private String addres;
	private String age;
//	학원 정보
	private final String TJO = "더조은";
	private String ca;
//	수강정보
	private String[] study = new String[5];
	private String[] time = new String[5];
	private int cnt;

	public Student(String name, String pn) {
		this.name=name;
		this.pn=pn;
	}
	
	public Student() {
		
	}
	
	public Student(String name, String pn,String addres, String age, String ca) {
//		super(); // 조상의 생성자 호출
		this.name=name;
		this.pn=pn;
		this.addres=addres;
		this.age=age;
		
		this.ca=ca;
	}

	public void insert(String st, String ti) {
		if (cnt == study.length) {
			String[] arr = new String[this.study.length + 1];
			String[] arr1 = new String[this.time.length + 1];
			System.arraycopy(this.study, 0, arr, 0, this.study.length);
			System.arraycopy(this.time, 0, arr1, 0, this.time.length);
			this.study = arr;
			this.time = arr1;
		}
//		for(int i=0; i<study.length;i++) {
//			if()
//		}
		study[cnt]=st;
		time[cnt]=ti;
		cnt++;
	}

//	public void timeInput(String ti) {
//		if (cnt == time.length) {
//			String[] arr = new String[time.length + 1];
//			System.arraycopy(study, 0, arr, 0, time.length);
//			time = arr;
//		}
//		
//	}

	
	public void printInfo() {
		System.out.println(name+"\t"+pn+"\t"+addres+"\t"+age+"\t"+TJO+"\t"+ca+"\t");
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", pn=" + pn + ", addres=" + addres + ", age=" + age + ", TJO=" + TJO + ", ca="
				+ ca + ", study=" + Arrays.toString(study) + ", time=" + Arrays.toString(time)  + "]";
	}

	public void printCompanu() {
		System.out.println("--학원정보--");
		System.out.println(TJO+"["+ca+"]");
	}
	public void printStudy() {
		if(cnt==0) {
			System.out.println("수강정보가 없습니다.");
			return;
		}
		for(int i=0;i<cnt;i++) {
			System.out.println("수강내역 : "+study[i]+" 수강기간 : "+time[i]);
		}
		
	}
	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	//	------------------getter
	public String getTjo() {
		return TJO;
	}
	
	public String getName() {
		return name;
	}

	public String getPn() {
		return pn;
	}

	public String getAddres() {
		return addres;
	}

	public String getAge() {
		return age;
	}

	public String getCa() {
		return ca;
	}

	public String[] getStudy() {
		return study;
	}

	public String[] getTime() {
		return time;
	}

// --------------------setter
	public void setTime(String[] time) {
		this.time = time;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPn(String pn) {
		this.pn = pn;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public void setCa(String ca) {
		this.ca = ca;
	}

	public void setStudy(String[] study) {
		this.study = study;
	}

	public void setAge(String age) {
		this.age = age;
	}


}
