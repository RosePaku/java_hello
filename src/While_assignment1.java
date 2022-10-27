
// 파일이름 : While2.java
// 작성자 : 박지인
// 작성일 : 2022년 10월 27일
// 목 적 : 처음 만나는 5의 배수이자 7의 배수인 수를 찾는 반복문

public class While_assignment1 {
	
		public static void main(String[] args) {
		
			int num = 0;
			int count = 0;
			
			while((num++) < 100) {
				if (((num % 5) !=0) || ((num % 7) !=0)) 
					continue; // 5와 7의 배수 아니라면 나머지 건너뛰고 위로 이동
				count++; // 5와 7의 배수인 경우만 실행
				System.out.println(num); // 5와 7의 배수인 경우만 실행
				}
			System.out.println("count: " + count);
			}
 }