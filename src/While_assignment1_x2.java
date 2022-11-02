
// 파일이름 : While_assignment1_x.java
// 작성자 : 박지인
// 작성일 : 2022년 10월 27일
// 목 적 : 구구단을 출력하는 프로그램을 만드시오.(이중 while문)

public class While_assignment1_x2 {

	public static void main(String[] args) {
		int i = 1;
		int j = 1;

		while (i <= 9) {
			while (j <= 10) {
				System.out.println(i+i);
				j++;
			}
			j = 1; //초기화 값을 넣기.
			i++;
		}

	}
}
//  결과
// 1*1은1이다.
// 1*2은2이다. ~반복
// 2*1은2이다. ~반복
