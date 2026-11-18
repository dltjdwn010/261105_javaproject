package day04;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		/* --menu--
		 * 1. 과자(2000원) | 2. 라면(3000원) | 3. 사탕(500원) | 4.젤리(500원) | 5. 종료
		 * menu > 1
		 * 과자 1개를 선택했습니다. 2000원
		 * menu > 2
		 * 라면 1개를 선택했씁니다. 3000원
		 * menu > 5
		 * 과자 1개, 라면 2개 
		 * 총 금액 : 
		 * 종료를 누를때까지 반복
		 * 1~5를 벗어난 메뉴는 다시 입력
		 * */
		Scanner sc= new Scanner(System.in);
		int[] arr= new int[4];
//		--- 영수증에 적힐 갯수
//		int cookie =0;
//		int ramen = 0;
//		int candy = 0;
//		int jelly = 0;
//		---계산용
		int choice =0;
		int choice1=0;
//		int a=0;
//		int b=0;
//		int c=0;
//		int d=0;
		int sum=0;
		
//		System.out.println("---menu---");
//		do {
//			System.out.println("1. 과자(2000원) | 2. 라면(3000원) | 3. 사탕(500원) | 4.젤리(500원) | 5. 종료");
//			System.out.println("물건을 선택해주세요");
//			choice = sc.nextInt();
//			if(choice==5) {
//				System.out.println("종료");
//				break;
//			}else if(choice<1|| choice>5) {
//				System.out.println("다시 입력해주세요");
//			}else {
//				System.out.println("갯수를 선택해주세요.");
//				choice1 = sc.nextInt();
//			}
//			
//			switch(choice) {
//			case 1 :
//				System.out.println("과자를 선택하셨습니다.");
//				System.out.println("총합 : "+(choice1*2000)+"원");
//				sum+=(choice1*2000);
//				cookie+=choice1;
//				break;
//			case 2 :
//				System.out.println("라면를 선택하셨습니다.");
//				System.out.println("총합 : "+(choice1*3000)+"원");
//				sum+=(choice1*2000);
//				ramen+=choice1;
//				break;
//			case 3 :
//				System.out.println("사탕를 선택하셨습니다.");
//				System.out.println("총합 : "+(choice1*500)+"원");
//				sum+=(choice1*500);
//				candy+=choice1;
//				break;
//			case 4 :
//				System.out.println("젤리를 선택하셨습니다.");
//				System.out.println("총합 : "+(choice1*500)+"원");
//				sum+=(choice1*500);
//				jelly+=choice1;
//				break;
//			}
//			
//			System.out.println("누적금액 : "+sum+"원");
//		} while(choice!=5);
//		System.out.println("과자: "+cookie+"개 라면: "+ramen+"개 캔디: "+candy+"개 젤리: "+jelly+"개");
//		System.out.println("총 결제금액 : "+sum+"원");
		//----------------------------------
		arr[0]=2000;
		arr[1]=3000;
		arr[2]=500;
		arr[3]=500;
//		배열에 가격 입력
		int cnt[] = new int[4];
//		갯수를 입력할 배열 생성
		String menu[] = {"과자","라면","사탕","젤리"};
//		배열 생성 및 상품이름 입력
		//int arr[] = {2000, 3000, 500, 500};
		System.out.println("---menu---");
		do {
			System.out.println("1. 과자(2000원) | 2. 라면(3000원) | 3. 사탕(500원) | 4.젤리(500원) | 5. 종료");
			System.out.println("물건을 선택해주세요");
			choice = sc.nextInt();
//			상품번호 입력 
			if(choice==5) {
				System.out.println("종료");
				break;
			}else if(choice<1|| choice>5) {
				System.out.println("다시 입력해주세요");
			}else {
				System.out.println("갯수를 선택해주세요.");
				choice1 = sc.nextInt();
//				갯수 입력
			}
			cnt[choice-1]+= choice1;
//			상품번호(choice-1번 배열) 호출 후 갯수(choice1)를 추가
			if(cnt[choice-1]!=0) {
				System.out.println(menu[choice-1] + ":" + cnt[choice-1] + "   " +" : "+ arr[choice-1]*cnt[choice-1]);
			}
//			물건이름 배열에 있는 이름(choice-1번 배열) 출력 + 갯수 배열(choice-1번 배열) 출력 + 
//			물건가격(choice-1번 배열)*물건 갯수(choice-1번 배열) 출력
//			배열은 0번부터 시작하기에 스캔값을 0으로 하지 않는 이상 (스캔값-시작값)으로 배열 시작값을 맞춰주는게 좋음)
//														(시작값은 요청한 선택지 중에서 최소값)
			System.out.println();
			
//			switch(choice-1) {
//			case 0 :
//				System.out.println("과자를 선택하셨습니다.");
//				cnt[0]++;
//				System.out.println("총합 : "+(cnt[0]*2000)+"원");
//				sum+=(choice1*arr[0]);
//				System.out.println("합계 : "+arr[0]+"*"+choice1+"="+(arr[0]*choice1));
//				System.out.println(sum);
//				cookie++;
//				break;
//			case 1 :
//				System.out.println("라면를 선택하셨습니다.");
//				System.out.println("총합 : "+(b*3000)+"원");
//				sum+=(choice1*arr[1]);
//				ramen++;
//				break;
//			case 2 :
//				System.out.println("사탕를 선택하셨습니다.");
//				System.out.println("총합 : "+(c*500)+"원");
//				sum+=(choice1*arr[2]);
//				candy++;
//				break;
//			case 3 :
//				System.out.println("젤리를 선택하셨습니다.");
//				System.out.println("총합 : "+(d*500)+"원");
//				sum+=(choice1*arr[3]);
//				jelly+=choice1;
//				break;
//			}
			
		} while(choice!=5);
		for(int i =0; i<menu.length;i++) {
			if(cnt[i]!=0) {
				System.out.println(menu[i]+" : "+cnt[i]+" = "+arr[i]*cnt[i]);
			}
//			갯수가 0이라면 그 제품 총 가격 출력x
			
			sum+=arr[i]*cnt[i];
		}
		System.out.println("총합 : "+sum);
//		System.out.println(menu[choice-1]);
//		System.out.println(cnt[choice-1]);
//		System.out.println(arr[choice-1]*cnt[choice-1]);
//		System.out.println(menu[choice-1] + ":" + cnt[choice-1] + " 총 결제금액 :  " + arr[choice-1]*cnt[choice-1]);

		
		
//		배열 자동추가? 
//		int a=0;
//		배열 번호를 변수로 지정 int arr[(변수)] 
//		-> a의 숫자를 누적 a++
//		-> a번째 배열에 값 추가
		sc.close();
		}
	}