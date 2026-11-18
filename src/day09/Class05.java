package day09;

import java.util.Arrays;
import java.util.Scanner;

public class Class05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		TV t = new TV();
		char ch;
		t.setBrand("Samson");
		t.print();
		t.powerOn();

		while (t.getPower() == true) {
			System.out.println("채널 up/down : u/d |볼륨 up/down : q,r| " + 
		"전원 off : f | 선호채널 추가 : a | 선호채널 확인 : l");
			ch = sc.next().charAt(0);
			switch (ch) {

			case 'u':
				t.chUp();
				break;
			case 'd':
				t.chDown();
				break;
			case 'a':
				t.addFavor();
				t.favorList();
				break;
			case 'f':
				t.powerOff();
				break;
			case 'q':
				t.volUp();
				break;
			case 'r':
				t.volDown();
				break;
			case 'l':
				t.favorList();
				break;
			default:
				System.out.println("다시입력");
			}
			if (t.getPower() == false) {
				break;
			}
		}
		System.out.println(t.toString());

		sc.close();

	}

}

class TV {
	// brand, power, ch, vol, favor[]

	private String brand;
	final String BRD = "LG"; // 중간에 바꿀수 없는 값 == 상수 == final => 전부 대문자
	private boolean power = false;
	private int ch = 1;
	private int vol = 0;
	private int favor[] = new int[5]; // 생성자로 객체 생성시 배열의 실 객체를 메모리에 올림
	private int cnt = 0;

	public TV() {
//		this.BRD="LG";
	}

	/*
	 * 선호채널 등록 5개까지만 등록 가능 1. 선호채널 등록 메서드 - 현재 채널 번호를 선호채널 배열에 넣기
	 * 
	 */
	// chUp(1~100까지 순환구조)
	public void chUp() {
		this.ch++;
		if (power) {

			if (ch > 100) {
				this.ch = 1;
			}
			System.out.println("현재 ch : " + ch);
		}
	}

	// chDown(1~100까지 순환구조)
	public void chDown() {
		this.ch--;
		if (power) {

			if (ch < 1) {
				this.ch = 100;
			}
			System.out.println("현재 ch : " + ch);
		}

	}

	public void volUp() {
		if (power) {
			if (vol < 30) {
				this.vol++;
			}
			System.out.println("Vol : " + vol);

		}
	}

	public void volDown() {
		if (power) {

			if (vol > 0) {
				this.vol--;
			}
			System.out.println("Vol : " + vol);
		}
	}

//	메서드를 한번 호출하면 배열 1개 채워짐
//	번지로 사용할 변수가 필요함
	public void addFavor() {
		boolean check = false;
		if (cnt == favor.length) {
			System.out.println("선호 채널이 가득 찼습니다.");
			return;
		} else {
			if (power) {
				// 채널의 중복 방지
				for (int i = 0; i < favor.length; i++) {
					if (favor[i] == ch) {
						check = true;
						System.out.println("등록된 선호 채널입니다.");
					}
				}
				if (!check) {
					favor[cnt] = ch;
					cnt++; // 선호채널 하나 등록
				}
			}
		}
	}
	
//	배열을 늘려서 값을 더 추가
	public void pick() {
		boolean check = false;
		if(power) {
			if(cnt==favor.length) {
				// 2. 배열을 늘려서 추가
				int[] arr= new int[favor.length+5]; // 현재 배열에 5개 추가
				System.arraycopy(favor, 0, arr, 0, favor.length);
				// 배열의 주소 변경
				favor=arr;
			}
			for (int i = 0; i < favor.length; i++) {
				if (favor[i] == ch) {
					check = true;
					System.out.println("등록된 선호 채널입니다.");
				}
			}
			if (!check) {
				favor[cnt] = ch;
				cnt++; // 선호채널 하나 등록
			}
		}
	}

	public void power() {
		this.power = !this.power;
//		if(this.power) {
//			System.out.println(BRD+"TV 전원이 켜집니다.");  if문
//		}else {
//			System.out.println(BRD+"TV 전원이 꺼집니다.");
//		}
		System.out.println(power ? BRD + "TV 전원이 켜집니다." : BRD + "TV 전원이 꺼집니다.");// 삼항 연산자
	}

	public void powerOn() {
		this.power = true;
		System.out.println("전원 ON");
		System.out.println("현재 ch : " + this.ch);
	}

	public void powerOff() {
		this.power = false;
		System.out.println("전원 OFF");
	}

	/*
	 * 2. 선호채널 리스트 보기 - 등록된 선호채널을 리스트로 출력
	 */
	public void favorList() {
		if (cnt != 0) {

			System.out.println("선호 채널 : " + Arrays.toString(this.favor));
		} else {
			System.out.println("등록된 선호 채널이 없습니다.");
		}
	}

//	출력
	public void print() {
		System.out.println("브랜드 : " + this.brand);
	}

	// toString : 멤버변수를 String 리턴

	@Override
	public String toString() {
		return "TV [brand=" + brand + ", power=" + power + ", ch=" + ch + ", vol=" + vol + ", favor="
				+ Arrays.toString(favor) + "]";
	}

//	---------getter
	public String getBrand() {
		return this.brand;
	}

	public boolean getPower() {
		return this.power;
	}

	public int getCh() {
		return this.ch;
	}

	public int getVol() {
		return this.vol;
	}

	public int[] getFavor() {
		return this.favor;
	}

//	--------setter
	public void setPower(boolean power) {
		this.power = power;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	public void setFavor(int[] favor) {
		this.favor = favor;
	}

}