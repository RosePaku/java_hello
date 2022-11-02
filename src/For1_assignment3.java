// 파일이름 : For1_assignment2 
// 작성자 : 박지인
// 작성일 : 2022년 10월 27일
// 목 적 : 별로 만드는 계단2, 별로 만드는 계단3
public class For1_assignment3 {

	public static void main(String[] args) {

		// 별로 만드는 계단 2
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("<hr>");

		// 별로 만드는 계단 3, for문을 3번
		
		for (int i = 1; i <= 6; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("1");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("1");
		}

	}
}

// 결과 
// Error
// 1+2+3 (n+1)+n