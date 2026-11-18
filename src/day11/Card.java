package day11;

public class Card {
	// 숫자 : (1~13) 1(A), 11(J), 12(Q) 13(K) int
	// 모양 : ♥, ♠, ♣, ◆ String

	/*
	 * ex) ♥1=>A, ♥5, ♣11=>♣J /!2 => ♥2 범위에 없는 모양이면 default ♥ 범위에 없는 숫자면 무조건 1=>A
	 */
	/*
	 * 멤버변수 : 숫자(int num), 모양(String shape) - getter/ setter - toString - 출력 메서드(숫자가
	 * 입력되면 A J Q K) (switch?)
	 */
	private String shape;
	private int num;

	public Card(int num, String shape) {
		this.shape = shape;
		this.num = num;
	}

	public Card() {
		this.shape = "♥";
		this.num = 1;
	}

	public void print() {
		switch(num) {
		case 1 :System.out.print(shape + "A ");
			break;
		case 11 :System.out.print(shape + "J ");
			break;
		case 12 :System.out.print(shape + "Q ");
			break;
		case 13 :System.out.print(shape + "K ");
			break;
			default :System.out.print(shape + num+" ");
			break;
		}
		
	}

//	----------------------------
	public int getNum() {
		return num;
	}

	public String getShape() {
		return shape;
	}

//	-------------------------------
	public void setShape(String shape) {
		switch (shape) {
		case "♥": shape= "♥";
			break;
		case "♠":shape= "♠";
			break;
		case "♣":shape= "♣";
			break;
		case "◆":shape= "◆";
			break;
			default : shape= "♥";
			break;
		}
		this.shape = shape;
	}

	public void setNum(int num) {
		if (num < 1 || num > 13) {
			this.num = 1;
			return;
		}
		this.num = num;
	}

	@Override
	public String toString() {
		return "Card [shape=" + shape + ", num=" + num + "]";
	}

}
