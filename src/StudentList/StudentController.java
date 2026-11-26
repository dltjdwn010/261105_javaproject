package StudentList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;





public class StudentController implements StudentProgram {
	private Student stu = new Student();
	private List<Student> stList = new ArrayList<Student>();
	private Subject[] sub = new Subject[5];
	private List<Subject> st = new ArrayList<Subject>();
//	private Map<Student,Subject> map = new HashMap<>();
	int cnt=1;
	public StudentController() {
//		Subject[] sub = new Subject[5];
		sub[0] = new Subject(1, "JAVA", "1강의장", "4","월, 수, 금");
		sub[1] = new Subject(2, "C언어", "2강의장", "4","화, 목");
		sub[2] = new Subject(3, "DB", "3강의장", "4","월, 수, 금");
		sub[3] = new Subject(4, "javascript", "4강의장", "4","월 ~ 금");
		sub[4] = new Subject(5, "HTML", "5강의장", "4","화, 목");
		for(int i=0;i<sub.length;i++) {
			st.add(sub[i]);
		}
		
	}
	public void printSubjectList() {
		//과목 리스트 출력
		System.out.println("--과목리스트--");
		for(Subject s: st) {
			s.printSubject();
		}
		System.out.println("------------");
	}
	@Override
	public void insertStudent(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("이름");
		String stName=sc.next();
		System.out.println("전화번호");
		String stPhone = sc.next();
		System.out.println("생년월일");
		String stBirth = sc.next();
		System.out.println("주소");
		String stAddress = sc.next();
		stu= new Student(cnt,stName , stPhone, stBirth, stAddress);
		
		
		stList.add(stu);
//		map.put(stu, null);
		cnt++;
	}

	@Override
	public void printStudentList() {
		// 학생 리스트 출력
		System.out.println("---전체 학생 리스트");
		for(Student tmp : stList) {
			System.out.println(tmp);
		}
//		printSubjectList(); test
	}

	@Override
	public void searchStudent(Scanner sc) {
		System.out.println("이름 입력");
		String name = sc.next();
		for(Student tmp : stList) {
			if(tmp.getStudentName().equals(name)) {
				System.out.println(tmp);			
			}		
		}		
	}

	@Override
	public void insertSubject(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("학번");
		int num = sc.nextInt();
		for(Student tmp : stList) {
			if(tmp.getStudentNum()==num) {
				printSubjectList();
			}else {
				System.out.println("해당학생이 없습니다.");
			}
		}
		System.out.println("입력");
		int subjectNum=sc.nextInt();
		Subject add = new Subject();
		for(Subject tmp : st) {
			if(tmp.getSubjectCode()==subjectNum) {
				add=tmp;
			}
		}
		
		stList.get(num-1).setCourse(st);
//		stList.set(num, add);
		
//		if(s==null) {
//			System.out.println("없는 과목입니다.");
//			return;
//		}
//		// 해당 객체를 Student 객체의 내부 메서드 호출하여 처리
//		studentList[indexNumber].addSubject(s);
//		
//		studentList[indexNumber].printCourse();
//		System.out.println("수강");
	}

	@Override
	public void deleteSubject(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("학번");
		int num = sc.nextInt();
		for(Student tmp : stList) {
			if(tmp.getStudentNum()==num) {
				System.out.println("취소할 과목 번호 입력");
				String subjectCode = sc.next();
				
			}else {
				System.out.println("해당학생이 없습니다.");
			}
	}
	}
}
