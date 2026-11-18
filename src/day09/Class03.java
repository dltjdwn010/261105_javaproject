package day09;

public class Class03 {

	public static void main(String[] args) {
		// 클래스 생성 
		// 학생 이름, 국어점수, 영어점수, 수학점수 를 객체로 하는 클래스 생성
		// 이름 (국어, 영어, 수학) => 출력 메서드
		// 메서드를 호출하면 국어+영어+수학 리턴되는 => 합계 메서드
		// 메서드를 호출하면 합계/3 평균이 리턴되는 => 평균 메서드
		StudentClass stc= new StudentClass();
		String name = "hong";
		int kor= 56;
		int eng= 77;
		int math = 91;
//		----- 기본값 (set 보다 위에 있어서 기본값, 아래에 있으면 설정 된 후의 값을 출력)
		System.out.println("------------------기본값");
		stc.getName();
		stc.getKor();
		stc.getEng();
		stc.getMath();
		stc.sum();
		stc.avg();
		stc.student();
//		--------------------설정 완료
		System.out.println("-----------------설정 후");
		stc.setName(name);
		stc.setKor(kor);
		stc.setEng(eng);
		stc.setMath(math);
		
		stc.sum();
		stc.avg();
		stc.student();
//		--------리셋
		System.out.println("-------------------리셋");
		stc.reset();
		stc.student();
	}
	
}
	/* 반복하려면? while (종료 숫자 설정)
	 * 총 인원 설정(인원만큼 반복)(반복중에는 못멈춤)
	 * 이름, 국, 영, 수 입력받기 (리셋 따로 안해도됨)
	 * String nameArr[] 생성 (길이는 설정한 인원만큼)
	 * int[] scoreArr 생성 국영수 점수 , 합계, 평균
	 * Class 자체의 배열을 만드는 방법으로[]
	 * */
class StudentClass{ // 같은 패키지 안에 있으면 import 하지 않음
	private String name;
	private int kor;
	private int eng;
	private int math;
//	--------------------getter
	public String getName() { // 이름 get
		return this.name;
	}
	public int getKor() { // 국어 get
		return this.kor;
	}
	public int getEng() { // 영어 get
		return this.eng;
	}
	public int getMath() { // 수학 get
		return this.math;
	}
//	--------------------setter
	public void setName(String name) { //이름 set
		this.name = name;
	}
	public void setKor(int kor) { // 국어 set
		if(kor<0||kor>100) {
			System.out.println("잘못된 국어 점수입니다.");
			this.kor=-1;
			return;
		}
		this.kor = kor;
	}
	public void setEng(int eng) { // 영어 set
		if(eng<0||eng>100) {
			System.out.println("잘못된 영어 점수입니다.");
			this.eng=-1;
			return;
		}
		this.eng = eng;
	}
	public void setMath(int math) { // 수학 set
		if(math<0||math>100) {
			System.out.println("잘못된 수학 점수입니다.");
			this.math=-1;
			return;
		}
		this.math = math;
	}
//	------------------------개세터 종료
	public void reset() {
		this.name=null;
		this.kor=0;
		this.eng=0;
		this.math=0;
	}
//	-------------합계
	public int sum() {
		if((kor<0||kor>100)||(eng<0||eng>100)||(math<0||math>100)) {
			return -999999;
		}
		int kor = this.kor;
		int eng = this.eng;
		int math = this.math;
		return kor+eng+math;
	}
//	--------------평균
	public double avg() {
		if((kor<0||kor>100)||(eng<0||eng>100)||(math<0||math>100)) {
			return -999999;
		}
		return (double)sum()/3;
	}
//	-------------------학생 이름, 점수 출력
	public void student() {
		String name= this.name;
		int kor = this.kor;
		int eng = this.eng;
		int math = this.math;
		
		if(kor<0||kor>100||eng<0||eng>100||math<0||math>100) {
			System.out.println("잘못된 점수입니다.");
			return ;
		}else {
			System.out.println("이름 : "+name+" | 국어 : "+kor+" | 영어 : "+eng+" | 수학 : "+math);
			System.out.printf("합계 : "+sum()+" | 평균 : %.2f",avg());
			System.out.println();
		}
			
		
	}
}