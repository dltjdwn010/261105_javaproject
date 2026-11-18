package day06;

import java.util.Arrays;

public class Array07 {

	public static void main(String[] args) {
		// String 배열
		
		String strArr[] = new String[5];
		
		strArr[0] ="공제로";
		strArr[1] ="공하나";
		strArr[2] ="공두리";
		strArr[3] ="공삼이";
		strArr[4] ="공너이";
		
		System.out.println(Arrays.toString(strArr));
		
		// 배열의 단점 : 배열의 길이는 고정
		for(int i=0; i<strArr.length;i++) {
			System.out.println(strArr[i]);
		}
		
		// 배열의 데이터를 늘리는 경우
		// 더 큰 배열을 만들어서 기존 데이터를 옮겨줘야 함.
		String strArr2[] = new String[10];

		System.out.println(Arrays.toString(strArr2));
		
		//기존 데이터 이동
		// 받을대상 = 주는 대상
		for(int i=0;i<strArr.length;i++) {
			strArr2[i]=strArr[i];
		}
//		System.out.println(Arrays.toString(strArr2));
		strArr = strArr2;
//		원래 배열인 strArr의 주소를 버리고  새 배열인 strArr2의 주소로 변경
		
		// 배열복사 arraycopy
		// System.arraycopy(구배열, 시작번지, 신배열, 시작번지, 갯수)
		
		System.arraycopy(strArr, 0, strArr2,0, strArr.length);
		
		strArr[5] = "공닷새";
		System.out.println(Arrays.toString(strArr));
	}

}
