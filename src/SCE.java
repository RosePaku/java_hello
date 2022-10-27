// 파일이름 : SCE.java
 // 작성자 : 박지인
 // 작성일 : 2022년 10월 26일
 // 목 적 : SEC 동작을 확인하는 예제

public class SCE {

	public static void main(String[] args) {
	
		int num1 = 0;
		int num2 = 0;
		boolean result;
		
		num1 += 10;
		num2 += 10;
		result = (num1 < 0) && (num2 > 0);
		
		 
		
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2 + '\n'); //+ "\n"??
		
		 
		
		num1 += 10;
		num2 += 10;
		result = (num1 > 0) || (num2 > 0);
		
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		
		}
	}
	

// 예측 결과
// result = false
// num1 = 10
// num2 = 0

// result = true
// num1 = 20
// num2 = 10


// 실제 결과
// result = false
// num1 = 10
// num2 = 10

// result = true
// num1 = 20
// num2 = 20