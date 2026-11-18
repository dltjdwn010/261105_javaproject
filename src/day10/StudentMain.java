package day10;


public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		Student s = new Student();
//		Student[] sArr = new Student[5];
//		int cnt = 0;
//		String time = "";
//
//		System.out.println("1.수강정보 입력 2.내정보 3.종료");
//		int a = sc.nextInt();
//		while (true) {
//			if (a == 2) {
//				System.out.println(s.toString());
//				for (int i = 0; i < cnt; i++) {
//					sArr[i].printInfo();
//					sArr[i].printStudy();
//				}
//				break;
//			}
//			if (a == 3) {
//				break;
//			}
//			if (a == 1) {
////				수강생 등록
//				System.out.println("수강신청하실 지역을 입력해주세요");
//				String ca = sc.next();
//				System.out.print("수강생 이름 => ");
//				String name = sc.next();
//				System.out.println("전화번호 => ");
//				String phone = sc.next();
//				System.out.print("거주지역 => ");
//				String addres = sc.next();
//				System.out.println();
//				System.out.println("생년월일 => ");
//				int age = sc.nextInt();
//				sArr[cnt] = new Student(name, phone, addres, age, ca);
//				cnt++;
//				System.out.println("수강생 정보가 등록되었습니다.");
//				System.out.println("수강신청하시겠습니까?.");
//				char bc = sc.next().charAt(0);
//				if (bc == 'y') {
//					int ct=0;
//					System.out.println("1. 자바, 2. 풀스택, 3. 기타");
//					int c = sc.nextInt();
//					switch (c) {
//					case 1:
//						System.out.println("수강기간");
//						time = sc.next();
//						sArr[ct].insert("자바", time);
//						cnt++;
//						break;
//					case 2:
//						System.out.println("수강기간");			
//						time = sc.next();
//						sArr[ct].insert("풀스택", time);
//						cnt++;
//						break;
//					case 3:
//						System.out.println("수강기간");
//						time = sc.next();
//						sArr[ct].insert("기타", time);
//						cnt++;
//						break;
//
//					default:
//						System.out.println("다시입력해주세요");
//						break;
//					}
//					System.out.println("등록되었습니다.");
//				}
//
//				System.out.println("1.수강정보 입력 2.내정보 3.종료");
//				a = sc.nextInt();
//			}
			Student ss = new Student("홍길동", "010-1111-1111");
			Student s1 = new Student("김영이", "010-1111-2222", "인천", "000505", "부평");
			Student s2 = new Student("철수", "010-1111-3333", "부천", "000505", "부평");
			Student s3 = new Student("영철", "010-1111-4444", "인천", "000505", "부평");
			Student s4 = new Student("순이", "010-1111-5555", "서울", "000505", "신촌");
			Student s5 = new Student("승철", "010-1111-6666", "인천", "000505", "부평");

			System.out.println();
			s1.insert("AI풀스택", "26.11.02 ~ 27.05.17");
			s1.insert("java", "26.10.01 ~ 26.11.01");
			s2.insert("AI풀스택", "26.11.02 ~ 27.05.17");
			s2.insert("java", "26.10.01 ~ 26.11.01");
			s3.insert("AI풀스택", "26.11.02 ~ 27.05.17");
			s3.insert("java", "26.10.01 ~ 26.11.01");

			Student[] student = new Student[6];
			student[0] = ss;
			student[1] = s1;
			student[2] = s2;
			student[3] = s3;
			student[4] = s4;
			student[5] = s5;
			for(int i=0; i<student.length; i++) {
				System.out.println(student[i]);
			}
//			인천사는 학생
			for(int i=0;i<student.length;i++) {
				if(student[i].getAddres()!=null&& student[i].getAddres().contains("인천")){
					student[i].printCompanu();
					student[i].printInfo();
				}
			}
//			풀스택 출력
//			for(int i=0;i<student.length;i++) {
//				
//			}
			System.out.println();
			int cnt=0;
			while(cnt < student.length) {
				for(int i=0;i<student[cnt].getCnt();i++) {
					if(student[cnt].getStudy()[i].equals("AI풀스택")) {
						student[cnt].printInfo();
						student[cnt].printStudy();
					}
				}
				cnt++;
			}
		

	
			
//		sc.close();
	}

}
