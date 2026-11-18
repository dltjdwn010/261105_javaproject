package day06;

public class Exam02 {

	public static void main(String[] args) {
		// 그림파일만 출력
		// 확장자가 jpg, png인것들
		// 없으면 그림파일이 없습니다
		
		String[] fileName= {
				"이것이.자바다.jpg.java","java의 정석.java","array.txt","array.java"
				,"String.txt","StringMethod.jpg","ArrayMethod.jpg","method.Png",
		"javaMethod.png"};
		int cnt=0;
		for(int i=0;i<fileName.length;i++) {
			String ans=fileName[i].substring(fileName[i].lastIndexOf(".")+1);
			if(ans.toLowerCase().equals("jpg")||
					ans.toLowerCase().equals("png")) {
				
//				fileName[i]번째를 				 |	fileName[i].
//				추출(substring) 할건데				 |	substring
//				(fileName[i]번째의 마지막으로 적힌'.' |	(lastIndexOf(".")).
//				을 기준으로 뒷부분을 추출할 생각이고	 |
//				소문자 전환해서						 |	toLowerCase().
//				"jpg"가 포함 되어있다면				 |	contains("jpg")
				
				System.out.println(fileName[i]);
				cnt++; 
			}
		}
		if(cnt==0) {
			System.out.println("그림 파일이 없습니다.");
		}else {
			System.out.println("출력 결과 : "+cnt+"개의 파일이 있습니다");
		}
		
	}

}
