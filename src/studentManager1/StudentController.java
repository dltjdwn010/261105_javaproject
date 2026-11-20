package studentManager1;


import java.util.Scanner;


public class StudentController implements StudentProgram {
	
	// 학생배열( 학생 등록을 하면 저장할 배열)
	private Student[] studentList = new Student[5];
	private int studentIndex;
	// 과목배열 (학원에서 수강 가능한 과목 배열) = 메누처렴 과목을 선택할 수 있게
	private Subject[] subjectList = new Subject[5];
	
	public StudentController() {
		// 과목 리스트
		//String subjectCode, String subjectName,
		//String subjectRoom, String subjbectTime, String subjectWeek
		subjectList[0] = new Subject("111", "JAVA", "1강의장", "4","월, 수, 금");
		subjectList[1] = new Subject("222", "C언어", "2강의장", "4","화, 목");
		subjectList[2] = new Subject("333", "DB", "3강의장", "4","월, 수, 금");
		subjectList[3] = new Subject("444", "javascript", "4강의장", "4","월 ~ 금");
		subjectList[4] = new Subject("555", "HTML", "5강의장", "4","화, 목");
		
		studentList[0] = new Student("1", "홍길동");
		studentList[1] = new Student("2", "김영이");
		studentIndex = 2;
	}
	
	// 학번을 매개변수로 받아, 학생리스트를 보고 해당 번지를 리턴해주는 메서드
	public int indexSearch(String num) {
		for(int i=0; i<studentIndex;i++) {
			if(studentList[i].getStudentNum().equals(num)) {
				return i;
			}
		}
		return -1;
	}
	
	
	@Override
	public void insertStudent(Scanner sc) {
		// 학생 등록(학번, 이름)
		System.out.println("학번 >");
		String num = sc.next();
		System.out.println("이름 >");
		String name = sc.next();
		
		Student s = new Student(num, name);
		int indexNumber=indexSearch(num);
		if(indexNumber!=-1) {
			System.out.println("이미 등록된 학생입니다.");
			return;
		}
		
		if(studentList.length == studentIndex) {
			// 배열이 꽉 찼다면
			Student[] arr = new Student[studentList.length+1];
			System.arraycopy(studentList, 0, arr, 0, studentList.length);
			studentList = arr;
		}
		studentList[studentIndex]=s;
		studentIndex++;
		
	}

	@Override
	public void printStudentList() {
		// 학생 리스트 출력
		System.out.println("---전체 학생 리스트");
		for(int i=0; i<studentIndex;i++) {
			studentList[i].printStudent();
		}
//		printSubjectList(); test
	}
	
	public void printSubjectList() {
		//과목 리스트 출력
		System.out.println("--과목리스트--");
		for(Subject s: subjectList) {
			s.printSubject();
		}
		System.out.println("------------");
	}
	
	// 수강코드번ㅅ호를 주고 해당 번호의 객체를 리턴하는 메서드

	@Override
	public void searchStudent(Scanner sc) {
		// 학번을 입력받아 해당 학생의 정보와 과목정보를 출력
		System.out.println("학번 >");
		String num = sc.next();
		
		int indexNumber=indexSearch(num);
		if(indexNumber==-1) {
			System.out.println("해당 학생이 없습니다.");
			return;
		}
		studentList[indexNumber].printStudent();
		if(studentList[indexNumber].getCourse()[0]==null) {
			System.out.println("등록된 과목이 없습니다.");
			return;
		}
		// 검색한 학생의 등록된 코스 배열 
		studentList[indexNumber].printCourse();
		
	}
	public  Subject searchSubjectCode(String num) {
		for(int i=0;i<subjectList.length;i++) {
			if(subjectList[i].getSubjectCode().equals(num)) {
				return subjectList[i];
			}
		}
		return null;
	}
	
	@Override
	public void insertSubject(Scanner sc) { 
		// 수강신청
		//학번을 입력받아 해당 학생의 수강 신청
		System.out.println("학번");
		String num = sc.next();
		int indexNumber=indexSearch(num);
		if(indexNumber==-1) {
			System.out.println("해당 학생이 없습니다.");
			return;
		}
		printSubjectList();
		// 수강 리스트 출력
		System.out.println("입력");
		String subjectNum=sc.next();
		
		Subject s = searchSubjectCode(subjectNum);
		
		if(s==null) {
			System.out.println("없는 과목입니다.");
			return;
		}
		// 해당 객체를 Student 객체의 내부 메서드 호출하여 처리
		studentList[indexNumber].addSubject(s);
		
		studentList[indexNumber].printCourse();
		System.out.println("수강");
	}

	@Override
	public void deleteSubject(Scanner sc) {
		// 수강취소
		// 학번을 입력받아 해당 학생의 수강리스트 출력
		// 해당 과목코드를 입력받아 수강 취소
		// 취소하는 번지를 삭제하고, 뒷쪽 값들을 앞으로 덮어쓰기
		System.out.println("학번");
		String num = sc.next();
		int indexNumber=indexSearch(num);
		if(indexNumber==-1) {
			System.out.println("해당 학생이 없습니다.");
			return;
		}
		System.out.println(studentList[indexNumber].getStudentName()+"의 수강 신청 리스트");
		studentList[indexNumber].printCourse();
		
		System.out.println("취소할 과목 번호 입력");
		String subjectCode = sc.next();
		
		// 과목코드를 주고, 본인의 수강신청배열에서 삭제 요청 메서드
		studentList[indexNumber].removeSubject(subjectCode);
	}
}
