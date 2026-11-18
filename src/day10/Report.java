package day10;

import java.text.DecimalFormat;

public class Report {

	// 한사람 성적 클래스
	// 멤버변수 : 이름, 국어, 영어, 수학, 합계, 평균, 등수
	// 생성자 : 이름, 국어, 영어, 수학 => 매개변수로 등록
	// 기본생성도 같이 오버로딩 해서 생성
	// 합계, 평균 계산
	// # : 해당 자리수가 없으면 출력, 없으면 안함
	// 0 : 필수 해당 자리수가 없으면 0으로 맞춰서 출력
	// 출력 => 평균은 소수점 2자리 DecimalFormat("##.00") 
	// DeciamlFormat("##.00") => 객체명.format(avg)
	DecimalFormat dc= new DecimalFormat("##.00");
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	private int rank;
//	------------------
	
	public Report(String name, int kor, int eng, int math) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		sum();
		avg();
	}
	public Report() {
	}
	public void print() {
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t" +dc.format(avg)+"\t"+rank);
	}
	
	@Override
	public String toString() {
		return  name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t"
				+ dc.format(avg) + "\t" + rank ;
	}
	public void sum() {
		sum=kor+eng+math;
	}
	
	public void avg() {
		avg=(double)sum/3;
	}

//	-----------------------------
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public int getSum() {
		return sum;
	}
	public double getAvg() {
		return avg;
	}
	public int getRank() {
		return rank;
	}
//	------------------set
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public void setName(String name) {
		this.name = name;
	}


	


	
	
	
}
