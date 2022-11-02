// 파일이름 : for_assignment21.java
// 작성자 : 박지인
// 작성일 : 2022년 10월 27일
// 목 적 : 1과 1000 사이의 숫자중 2의 배수이자 3의 배수인 수는 모두 몇개인가?

public class for_assignment21 {

	public static void main(String[] args) {

		int count=0;
			for (int i = 1; i <= 1000; i++) {
				if ((i % 2 == 0) && (i % 3 == 0)) {
					count++;
				}
				
			}
			System.out.println(count);
		
	}
}
// 결과
// 166
