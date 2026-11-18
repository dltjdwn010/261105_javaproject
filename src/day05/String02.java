package day05;

import java.util.Arrays;

public class String02 {

	public static void main(String[] args) {
		// String method
		
		// toLowerCase() / toUpperCase() : 소문자 변환/ 대문자 변환
		// jpg, JPG, Jpg = jpg
		System.out.println("---toLowerCase()/toUpperCase()---");
		System.out.println("JPG".toLowerCase()); // 소문자 변환
		System.out.println("jpg".toUpperCase()); // 대문자 변환
		
		// isEmpty() : 값이 비었는지 확인(공백도 데이터가 있는것으로 간주)
		// true of false 로 반환
		System.out.println("---isEmpty---");
		System.out.println("".isEmpty()); // 공백조차 없으므로 true
		System.out.println(" ".isEmpty()); // 공백이 있으므로 false
		
		// isBlank() : 값이 비었는지 확인(공백은 데이터가 없는것으로 간주)
		System.out.println("---isBlank---");
		System.out.println("".isBlank()); // 공백 없음 true
		System.out.println(" ".isBlank()); // 공백 있음 true
		
		// trim() : 불필요한 공백 제거
		System.out.println("---trim---");
		System.out.println("    abc            ".trim());
		
		// replace() : 글자를 변환
		System.out.println("----replace---");
		// 2026-11-09 => 2026/12/9
		System.out.println("2026-11-09");
		System.out.println("2026-11-09".replace("-", "/"));
		
		// split : 특정 값으로 나누기(자르기) => 배열로 리턴
		String str= "apple, banana, kiwi, orange";
		System.out.println("---split---");
		String[] arr = str.split(",");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString("1234".split("")));
		
		// 문자를 숫자로 변경 => Integer.parseInt();
		String num ="123";
		int num2=Integer.parseInt(num);
		System.out.println(num2);
		
		// 숫자를 문자로 변경 String.valueOf()
		String num3 = String.valueOf(num2);
		System.out.println(Arrays.toString(num3.split("")));
		
		// instanceof : 같은 클래스 인지 비교하는 연산자 (클래스 자료형만 가능)
		System.out.println(num3 instanceof String);
	}

}
