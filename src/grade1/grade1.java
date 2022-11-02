// 파일이름 : Assignment1_Mathod_if3.java
// 작성자 : 박지인
// 작성일 : 2022년 10월 31일
// 목 적 : 값 입력해서 평균값 출력

package grade1;

import java.util.Scanner;

class Grade {
	private int math;
	private int science;
	private int english;

	Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}

	public int average() {
		return (math + science + english) / 3;
	}

}

public class grade1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();

		Grade me = new Grade(math, science, english);

		System.out.println("평균은 " + me.average());
		sc.close();

	}

}

// 결과
// 수학, 과학, 영어 순으로 3개의 정수 입력 >> " "입력 후 엔터 
// 40
// 20
// 평균은 "  "
