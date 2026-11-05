package day03;



public class While01 {

	public static void main(String[] args) {
		// While
		/* while(조건식) {실행문;}
		 * 조건식이 참이면 실행문 실행
		 * 반복할 조건의 증감식이 항상 실행문에 포함
		 * for : 반복횟수 정해져 있을때 사용
		 * while : 반복횟수가 정해져있지 않을 경우
		 * 초기화는 바깥으로 증감식은 내부로 조건식은 원래 자리에 
		 * */

		
		for(int i=1; i<=10;i++) {
			System.out.println(i);
		}
		
		int i=1;
		while(1<=10) {

			System.out.println(i);
			i++;
   			break;
			
		}
		System.out.println("---------------");
		// while을 이용하여 1~10까지 출력
		i=1;
		int sum=0;
		while(i<=10) {
			if(i%2==0) {
				sum+=i;
				System.out.println(sum);
			}
			i++;
		}
		System.out.println("------------------");
		System.out.println(sum);
		System.out.println("------------------");
		i=1;
		sum=0;
		while(true) {
			if(i%2==0) {
				System.out.println("짝수"+i);
				System.out.print(sum+"+"+i+"=");
				sum+=i;
				System.out.println(sum);
			}
			if(i==10) {
				break;
			}
			i++;
		}

	}

}
