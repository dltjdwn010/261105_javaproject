package day11;

public class CardPack {
	/* 52장의 Card 객체를 배열로 저장 pack
	 * ♥A ~ ♥K /♠A ~ ♠K /♣A~♣K /◆A ~◆K 
	 * 총 52장
	 * */
	/* 멤버변수 : 52장의 Card 객체를 담을 수 있는 배열 + 번지
	 * - 생성자 : pack의 초기값을 52장의 카드로 초기화
	 * 1. 카드를 섞는 기능
	 * 2. 플레이어에게 한장씩 나눠주는 기능
	 * 3. 카드를 초기화 기능 (나눠준 카드 회수)
	 * */
	private Card[] pack = new Card[52]; //초기값 null
	private Card[] share = new Card[52]; //초기값 null
	private int c=0;
	private int cnt=0;

	public void  insertCardPack() {
		for(Card tmp: pack) {
			pack[c]=tmp;
			c++;
		}
	}
	
	public void cardMix() {
		
		for(int i=0;i<pack.length;i++) {
			int r= (int)(Math.random()*52);
			Card card= pack[i];
			pack[i]=pack[r];
			pack[r]=card;
		}
//		System.out.println(pack[r]);
	}
	public void printPack() {
		for(Card tmp:pack) {
			System.out.println(tmp);
		}
	}
	public void cardShare(int num) {
		pack[num].print();
		share[cnt]=pack[num];
		cnt++;
		
		
	}
	public void cardRank(int n,int n1, int n2, int n3) {
		Card arr[] = {pack[n],pack[n1],pack[n2],pack[n3]};
		for(int i=0;i<arr.length;i++) {
			int s=1;
			for(int j=0;j<arr.length;j++) {
				if(arr[i].getNum()<arr[j].getNum()) {
					s++;
				}
			} 
			arr[i].print();
			System.out.println(": "+s+"등");
		}
	}
	public void cardOpen(int num) {
		pack[num].print();
	}
	public Card[] getPack() {
		return pack;
	}

	public void setPack(Card[] pack) {
		this.pack = pack;
	}

	
	
	
}
