package StudentList;

import java.util.ArrayList;
import java.util.List;



public class Student {
	// 멤버변수 : 학번(기본키), 이름, 전화번호, 생년월일, 주소, 수강과목[] (Subject[])
	private int studentNum;
	private String studentName;
	private String studentPhone;
	private String studentBirth;
	private String studentAddress;
	// 학생 1명으 ㅣ수강 신청 목록 배열
	private int index; // 배열의 index
	private List<Subject> course = new ArrayList<>();
	// 생성자
	
	public void addSubject(Subject s) {

		// 중복 수강 불가 => 가능하면 안써도 됨
		
//		for(int i=0; i<index; i++) {
//			if(course[i].getSubjectCode().equals(getStudentNum())) {
//				System.out.println("이미 수강중인 과목입니다.");
//			}
//		}
//		
		
	}

	public Student() {
	}

	// 본인의 수강배열을 출력하는 메서드
	public void printCourse() {
		for(Subject tmp : course) {
			System.out.println(tmp);
		}
	}
	
	
	public void removeSubject(String subjectCode) {
//		// 수강코드를 매개변수로 받아 course 배열에서 삭제하는 메서드 
//		int cnt = -1;
//		for(int i=0;i<index; i++) {
//			if(course[i].getSubjectCode().equals(subjectCode)) {
//				cnt=i;
//				break;
//			}
//		}
//		if(cnt==-1) {
//			System.out.println("찾는 과목이 없습니다.");
//			return;
//		}
//		//index를 찾았다면
//		// 삭제 : index 번지부터 index -1 번지까지 뒷번지의 값을 앞으로 옮기는 작업
//		for(int i=cnt; i<index-1;i++) {
//			course[i]=course[i+1];
//		}
//		// 마지막번지는 null 처리
//		course[index-1]=null;
//		index--;
//		System.out.println("수강 취소 완료");
	}
	
	public Student(int studentNum, String studentName, String studentPhone, String studentBirth,
			String studentAddress) {

		this.studentNum = studentNum;
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentBirth = studentBirth;
		this.studentAddress = studentAddress;
		
	}

	public Student(int studentNum, String studentName) {

		this.studentNum = studentNum;
		this.studentName = studentName;
		this.studentPhone = "010-1234-2134";
		this.studentBirth = "000101";
		this.studentAddress = "인천";
	}

	// 학생정보 출력 메서드(학번, 이름, 전화번호)
	public void printStudent() {
		System.out.println(studentName + "(" + studentNum + ") / " + studentPhone);
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getStudentBirth() {
		return studentBirth;
	}

	public void setStudentBirth(String studentBirth) {
		this.studentBirth = studentBirth;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}



	public List<Subject> getCourse() {
		return course;
	}

	public void setCourse(List<Subject> course) {
		this.course = course;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public String toString() {
		return "Student [studentNum=" + studentNum + ", studentName=" + studentName + ", studentPhone=" + studentPhone
				+ ", studentBirth=" + studentBirth + ", studentAddress=" + studentAddress + ", course=" + course + "]";
	}



}
