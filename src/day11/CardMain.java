package day11;

public class CardMain {

	public static void main(String[] args) {
		// Card c = new Card(!2) => ♥2
		/* ex) ♥1=>A, ♥5, ♣11=>♣J /!2 => ♥2
		 * 범위에 없는 모양이면 default ♥
		 * 범위에 없는 숫자면 무조건 1=>A
		 * */
//		Card c= new Card();
//		c.setShape("♣");
//		c.setNum(13);
//		c.print();
//		System.out.println(c.toString());

		Card[] ca= new Card[52];
		CardPack car= new CardPack();
		int cnt=0;
//		String shape="";
		String shapeArr[]= {"♥", "♠", "♣", "◆"};
		for(int i=0;i<4;i++) {
//			ca[cnt]= new Card();
//			System.out.println(i);
//			switch(i) {
//			case 0 : shape="♥";
////			System.out.println(cnt);
//			break;
//			case 1 : shape="♠";
////			System.out.println(cnt);
//			break;
//			case 2 : shape="♣";
//			break;
//			case 3 : shape="◆";
//			break;
//			}
			for(int j=1;j<=13;j++) {
				ca[cnt]= new Card();
				ca[cnt].setShape(shapeArr[i]);
				ca[cnt].setNum(j);
//				ca[cnt].print();
				car.setPack(ca);
				cnt++;
			}
			System.out.println();
		}
		
//		
		car.insertCardPack();
		System.out.println("딜러가 카드를 섞고 있습니다.");
		car.cardMix();
		//player 4명
		System.out.println("딜러가 카드를 나누고있습니다.");
		System.out.println("player1 카드 pick");
		//메서드 호출
		car.cardShare(0);
		System.out.println("player2 카드 pick");
		//메서드 호출
		car.cardShare(1);
		System.out.println("player3 카드 pick");
		//메서드 호출
		car.cardShare(2);
		System.out.println("player4 카드 pick");
		//메서드 호출
		car.cardShare(3);
		
		System.out.println("player1 Card open");
		
		car.cardOpen(0);
		System.out.println();
		// 카드 출력
		System.out.println("player2 Card open");
		car.cardOpen(1);
		System.out.println();
		// 카드 출력
		System.out.println("player3 Card open");
		car.cardOpen(2);
		System.out.println();
		// 카드 출력
		System.out.println("player4 Card open");
		car.cardOpen(3);
		System.out.println();
		// 카드 출력
		car.cardRank(0, 1, 2, 3);
	}

}
