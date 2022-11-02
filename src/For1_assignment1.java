// 파일이름 : For1_assignment1.java
// 작성자 : 박지인
// 작성일 : 2022년 10월 25일
// 목 적 : 1~100까지의 합, 구구단짜기 //이중 포문 // 짝수 단만 출력하시오 // 3단 이상부터만 출력
public class For1_assignment1 {

    public static void main(String[] args) {

    	
    	for (int i = 1; i <= 9; i++) {
    		if ((i % 3) != 0)
    			continue;
    	for (int j = 1; j <= 9; j++) {
    		
    		
    		System.out.println(i +"*"+j+"="+(i*j));
    		
    		
    	System.out.println();
		}
    		
    }
   }
}

// 결과 
// 3*1=3 .. 3*2=6
// 6*1=6 .. 6*2=12
// 9*1=9 .. 9*2=18
