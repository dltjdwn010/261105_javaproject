package studentManager;

import java.util.Arrays;
import java.util.Scanner;

public class StudentController implements StudentProgram {
	private int cnt = 0;
	private int ct = 0;
	Subject sub = new Subject();
	Subject[] su = new Subject[ct];
	Student[] st = new Student[cnt];
//	 학생 정보에 넣어야 할 값
	/* 이름 전화번호 주소 지점(고정값) 수강 정보[subject 에서 가져오기] 
	 * student[] a = new student{subject {sub, period, time},subject {sub, period, time} ,subject {sub, period, time}  }
	 * String {sub, period, time} 
	 * */
	@Override
	public void insertStudent(Scanner sc) {
		// TODO Auto-generated method stub
		if (cnt == st.length) {
			Student[] arr = new Student[st.length + 1];
			System.arraycopy(st, 0, arr, 0, st.length);
			st = arr;
		}

		System.out.println("이름 입력");
		String name = sc.next();
		System.out.println("전화번호 입력");
		String phone = sc.next();
		System.out.println("주소 입력");
		String adr = sc.next();
		st[cnt] = new Student();
		st[cnt].setName(name);
		st[cnt].setPhone(phone);
		st[cnt].setAdress(adr);

		cnt++;
	}

	@Override
	public void printStudentList() {
		for (int i = 0; i < st.length; i++) {
			System.out
					.println("이름 : " + st[i].getName() + " 전화번호 : " 
			+ st[i].getPhone() + " 주소 : " + st[i].getAdress()+ "학원명 : "+st[i].getTJO());
			if(st[i]!=null) {
				System.out.println("수강정보 : "+st[i].getS() );
			}
			}

	}

	@Override
	public void searchStudent(Scanner sc) {
		System.out.println("이름 입력");
		String name = sc.next();
		for (int i = 0; i < st.length; i++) {
			if (st[i].getName().equals(name)) {
				System.out.println(
						"이름 : " + st[i].getName() + " 전화번호 : " + st[i].getPhone() + " 주소 : " + st[i].getAdress() + "학원명 : "+st[i].getTJO());
				if(st[i]!=null) {
					System.out.println("수강정보 : "+Arrays.toString(st[i].getS() ));
				}
			}
		}

	}

	@Override
	public void insertSubject(Scanner sc) {
		// 이름 조회 후 그 배열에 추가
		if (st.length == 0) {
			System.out.println("등록된 학생 정보가 없습니다.");
			return;
		}
		if (ct == su.length) {
			Subject[] arr = new Subject[su.length + 1];
			System.arraycopy(su, 0, arr, 0, su.length);
			su = arr;
		}
		System.out.println("이름을 입력해주세요");
		String search=sc.next();
		
		for(int i=0; i<st.length;i++) {
			if(st[i].getName().equals(search)) {
				System.out.println("수강 과목을 선택해주세요.");
				System.out.println("1. JAVA 2. AI풀스택 3. AWS 4. C++ ");
				int choice=sc.nextInt();
				switch(choice){
				case 1:	
					

//					System.out.println(sub.getPeriod()+"A");
					sub = new Subject("JAVA","261102~270517","09:30~18:30");
					st[i].addSub(sub);

					break;
				case 2 :
					sub = new Subject("AI 풀스택","26,11,19~26,12,20","16:00~18:00");
					st[i].addSub(sub);


					break;
					
				case 3 :
					sub = new Subject("AWS","25,09,13~25,12,20","19:00~21:00");
					st[i].addSub(sub);
//	

					break;
				case 4 :
					sub = new Subject("C++","25,05,22~25,8,30","12:30~18:30");
					st[i].addSub(sub);
//		
					break;
				
					default : System.out.println("잘못된 입력값입니다.");
					break;
				}
				
				
			}
			ct++;
//			System.out.println(su.length);
		}
	}

	@Override
	public void deleteSubject(Scanner sc) {
		// TODO Auto-generated method stub
		if (su.length == 0) {
			System.out.println("등록된 수강 정보가 없습니다.");
			return;
		}
		System.out.println("이름 입력");
		String name = sc.next();
		for(int i=0;i<st.length;i++) {
			if(st[i].getName().equals(name)) {
			st[i].removeSubject(name);
		}
	
		
		
//		System.out.println("이름을 입력해주세요");
//		String search=sc.next();
		
		
	}

}
}



/* arr{1, 2, 3, 4, 5} 
 * 3번 삭제 => 3번 배열값 삭제
 * arr{1,2, 4, 5}
 * 3번 배열값에 4번, 4번 배열값에 5번, 5번 배열은 없애기
 * arr[3]= arr[4]
 * arr[4]= arr[5]
 * arr[5]=0
 * */
 