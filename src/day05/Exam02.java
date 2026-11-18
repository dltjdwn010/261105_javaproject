package day05;

public class Exam02 {

	public static void main(String[] args) {
		// 주민등록 번호를 참고하여 생년월일과 성별, 나이를 출력
		String regNum = "020101-1234567"; // 1999년생 => 2000년 이전출생 1(남), 2(여)
//		String regNum = "010101-3346532"; // 2000년생 => 2000년 이전출생  3(남), 4(여)

		/*
		 * 출력 결과 생년월일 : 990101 나이 : 28
		 */
		int today = 2026;
		int age = Integer.parseInt(regNum.substring(0, 2));
		char age2 = regNum.substring(regNum.indexOf("-") + 1).charAt(0);
		String birth = regNum.substring(0, regNum.indexOf("-"));
//		String r=regNum.substring(7,8);
//		--------------------------------------------------
		System.out.println("생년월일 : "+birth);
		String gender = (age2 =='1' || age2=='3')?"남":"여";
//		String gd=(r.equals("1")||r.equals("3")? "남": "여");
		System.out.println(gender);
//		System.out.println(gd);
		if (age > 26 && (age2 == '3' || age2 == '4')) {
			System.out.println("이상한 주민번호");
		} else if (age2 == '1' || age2 == '2') {
			// 뒷자리가 1 혹은 2면 남자 혹은 여자
			// 1 혹은 2일때는 2000년도 이전 출생자
			System.out.println((1900 + age) + "년생");
			System.out.println("나이 : " + (today - (1900 + age))+"살");
			
//			switch (age2) {
//			case '1':
//				System.out.println("생년월일 : " + birth);
//				System.out.println("남자");
//				System.out.println("나이 : " + (today - (1900 + age)));
//				break;
//			case '2':
//				System.out.println("생년월일 : " + birth);
//				System.out.println("여자");
//				System.out.println("나이 : " + (today - (1900 + age)));
//				break;
//			}
		}

		if (age <= 26 && (age2 == '3' || age2 == '4')) {
//			26년생까지 뒷자리가 3 혹은 4면 2000년생 이후 출생자
//			27년생 이후부터는 뒷자리가 3 혹은 4가 나올시 잘못된 주민번호
			System.out.println((2000 + age) + "년생");
			System.out.println("나이 : " + (today - (2000 + age))+"살");
//			switch(age2) {
//			case '3' :
//				System.out.println("생년월일 : " + birth);
//				System.out.println("남자");
//				System.out.println("나이 : " + (today - (2000 + age)));
//				break;
//			case '4' :
//				System.out.println("생년월일 : " + birth);
//				System.out.println("여자");
//				System.out.println("나이 : " + (today - (2000 + age)));
//				break;
//			}
		}
	}

}
