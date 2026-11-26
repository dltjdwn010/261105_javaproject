package StudentList;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
		 StudentController con = new StudentController();
		 int menu=0;
		 do {
			 System.out.println("---선택---");
			 System.out.println("1. 학생등록 | 2. 학생리스트 | 3. 학생조회");
			 System.out.println("4. 수강신청 | 5. 수강취소 | 6. 종료");
			 menu = sc.nextInt();
			 switch(menu) {
			 case 1 : //처리 메서드 호출
				 con.insertStudent(sc);
				 break;
			 case 2 : //처리 메서드 호출
				 con.printStudentList();
				 break;
			 case 3 : //처리 메서드 호출
				 con.searchStudent(sc);
				 break;
			 case 4 : //처리 메서드 호출
				 con.insertSubject(sc);
				 break;
			 case 5 : //처리 메서드 호출
				 con.deleteSubject(sc);
				 break;
			 case 6 : //처리 메서드 호출
				 System.out.println("종료");
				 break;
				 default : System.out.println("잘못된 입력");
				 break;
			 }
		 }while(menu!=6);
		 
		 
		 sc.close();
	}

}
