package day14;

public class CustomException01 {

	public static void main(String[] args) {
		// PasswordException
		PasswordTest pt = new PasswordTest();
		
		String password1 = null;
		String password2 = "abc";
		String password3 = "abcefg";
		String password4 = "abcefg!";
		String password5 = "abcefg2";
		String password6 = "abcefg!2";
		try {
		
			pt.setPassword(password6);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("test 종료");
	}

}


class PasswordTest{
	/* - 비밀번호는 null일 수 없음.
	 * - 길이는 5자 이상
	 * - 영문자, 숫자, 특수문자 1개 이상 포함 => 정규표현식 사용
	 * - 정규표현식 RegExp
	 * */
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		// exception 조건을 처리 
		if(password == null) {
			throw new PasswordException("비밀번호는 null일수 없습니다.");
		}
		if(password.length()<5) {
			throw new PasswordException("길이가 5자 미만입니다.");
		}
		if(!password.matches("^(?=.*[a-z])(?=.*[^A-Za-z0-9\\s]).{5,}$")) {
			throw new PasswordException("형식에 맞지 않습니다.");
		}
		this.password = password;
	}
	
	
}