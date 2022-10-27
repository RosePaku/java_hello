// 파일이름 : For1_assignment2 
// 작성자 : 박지인
// 작성일 : 2022년 10월 27일
// 목 적 : 별로 만드는 계단 
public class For1_assignment2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

// 결과 
// Error
// 1+2+3 (n+1)+n