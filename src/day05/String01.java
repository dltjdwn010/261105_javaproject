package day05;

public class String01 {

	public static void main(String[] args) {
		// String class : 문자열을 다루기 위한 클래스 => 참조 자료형
		// class : 해당 기능을 가지고 있는 정의서
		// 클래스 타입의 객체명 = new 클래스타입[];
		// String 워낙 자주쓰는 클래스라서 기본 자료형처럼 제공
		String str = "abc d efg h";
		System.out.println();
		// String은 한 문자열을 배열로 넣었다 생각
		// length : 총길이 => 공백포함
		System.out.println("전체길이 : " + str.length());

		// 배열처럼 index를 가짐 = 0부터 시작
		// charAt(index) : index 번지에 있는 문자를 반환 => 리턴값은 char

		System.out.println("---charAt()---");
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));

		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
		System.out.println();

		// substring : 원하는 문자를 추출
		System.out.println("---substring---");
		System.out.println(str.substring(6));
		System.out.println(str.substring(6, 9)); // endindex는 포함하지 않음 (endindex-1번 배열까지만)

		// equals() : 두 문자가 같은 값인지 비교(대소문자 구분)
		// 참조 자료형에서 '==' : 주소가 같은지 비교
		// true or false 로 리턴
		System.out.println("--equals---");
		System.out.println(str.equals("abc"));
		System.out.println(str.substring(0, 4));
		System.out.println(str.substring(0, 3).equals("abc"));
		System.out.println("abc".equals(str.substring(0, 3)));
		// 3==3

		// indexOf(): 문자의 위치(index)를 찾아주는 기능
		// 한 문자열의 같은 단어가 여러개라면? 처음 일치하는 주소를 리턴
		// 찾는 문자가 없다면? -1 리턴
		// 시작 위치를 정할 수 있음. 사용하려면 String 먼저 작성
		str="abc h abc d";
		System.out.println("---indexOf---");
		System.out.println(str.indexOf("abc")); // 0 리턴
		System.out.println(str.indexOf("abc", 3));
		System.out.println(str.indexOf("1")); //-1 리턴
		
		// lastIndexOf() : 뒤에서 부터 찾음.
		System.out.println("---lastIndexOf()---");
		System.out.println(str.lastIndexOf("c"));
		
		// ex) email 에서 id만 추출
		String email = "tjeun261109@gmail.com";
		System.out.println(email.substring(0,email.indexOf("@")));
		System.out.println(email.substring(email.indexOf("@")+1));
		
		// compareTo() : str.compareTo("str2(비교값)")
		// 사전순으로 기준값이 비교값 보다 앞에 있으면 -, 같으면 0, 뒤에있으면 +
		// 문자 정렬시 사용
		System.out.println("---compareTo()---");
		System.out.println("z".compareTo("b")); //비교값으 첫글자만
		
		
		// contains() : 해당 문자를 포함하고 있는지 확인 (true of false)
		System.out.println("---contains---");
		System.out.println(str.contains("abc"));
		
		// concat : 이어붙이기 (+ 연결연산자와 같은 의미)
		System.out.println("---concat---");
		System.out.println("abc".concat("def"));
		System.out.println("abc"+"def");
		

	}

}
