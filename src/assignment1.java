public class assignment1 {
	public static void main(String[] args) {
		int num1 = 77;
		boolean result;
		
		 // 변수 num1에 저장된 값이 7의 배수인가? 11의 배수인가? 그리고 짝수인지
		result = ((num1 % 7) == 0) && ((num1 % 11) == 0) 
				 && ((num1 % 2 ) == 0);
		System.out.println("7의 배수인가? 11의 배수인가?" + result);
		

	}
}