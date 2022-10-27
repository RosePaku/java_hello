 // 파일이름 : AddNum.java
 // 작성자 : 박지인
 // 작성일 : 2022년 10월 26일
 // 목 적 : SEC 동작을 확인하는 예제

public class AddNum {

	public static void main(String[] args) {
	
		int result = 3 + 6;
		System.out.println("3 + 6 = " + result);
		
		 
		
		result += 9;
		System.out.println("3 + 6 + 9 = " + result);
		
		 
		
		result += 12;		
		System.out.println("3 + 6 + 9 + 12 = " + result);


		}
	}


// 예측 결과
// 3 + 6 = 9
// 3 + 6 + 9 = 18
// 3 + 6 + 9 + 12 = 30