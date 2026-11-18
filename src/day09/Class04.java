package day09;

import java.util.Scanner;

public class Class04 {

	public static void main(String[] args) {
		// 자동차 이름, 년식, 전원켜기-끄기, 속도 올리기-내리기
		Car car = new Car();
		Scanner sc = new Scanner(System.in);
		car.setName("부르릉이");
		car.setYear(26);
		System.out.println("시동을 거시겠습니까? : Y/N (대소문주 구분x)");
		String ct = sc.next();
		if (ct.toLowerCase().equals("y")) {
			car.powerOn();
		}
		car.print();
		while (true) {
			System.out.println("속도 UP : U, 속도 DOWN : D, 시동끄기 : Off (대소문자 구분x)");
			ct = sc.next();
			if (ct.toLowerCase().equals("off")) {
				car.setPower(false);
			}
			if (car.getPower() == false) {
				car.powerOff();
				break;
			}
			if (ct.toLowerCase().equals("u")) {
				car.speedUp();
				if (car.getSpeed() > 220) {
					System.out.println("엔진 과열, 시동을 끕니다.");
					car.powerOff();
					break;
				}
			}
			if (ct.toLowerCase().equals("d")) {
				car.speedDown();
			}

		}
		sc.close();
	}

}

class Car {
	// 기능 : 시동켜기, 시동끄기, 속도up, 속도down
	// name, year
	// power, speed
	private String name;
	private int year;
	private boolean power;
	private int speed;

	public String getName() {
		return this.name;
	}

	public int getYear() {
		return this.year;
	}

	public int getSpeed() {
		return this.speed;
	}

	public boolean getPower() {
		return this.power;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setName(String name) {
		this.name = name;
	}

//	--전원
	public void powerOn() {
		this.power = true;
		System.out.println("시동 ON");
	}

	public void powerOff() {
		if(this.speed==0||this.speed>220) {
			this.power = false;
		System.out.println("시동 OFF");
		}else {
			System.out.println("속도가 0km일때만 시동을 끌 수 있습니다.");
		}
		
	}

//	--속도제어
	public void speedUp() {
		this.speed += 10;
		System.out.println("현재속도 : " + speed);
		if (speed >= 140) {
			System.out.println("경고! 너무 빠릅니다.");
		}
	}

	public void speedDown() {
		this.speed -= 10;
		System.out.println("현재속도 : " + speed);
		if (speed >= 140) {
			System.out.println("경고! 너무 빠릅니다.");
		}
	}

//	--출력
	public void print() {
		System.out.println("이름" + this.name + " | " + this.year + "년식");
		String p;
		if (this.power == true) {
			p = "ON";
		} else {
			p = "OFF";
		}
		System.out.println("전원 상태 : " + p);
		System.out.println("현재속도 : " + this.speed);
	}
}