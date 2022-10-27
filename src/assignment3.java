 // 파일이름 : AddNum.java
 // 작성자 : 박지인
 // 작성일 : 2022년 10월 26일
 // 목 적 : 국어, 영어, 수학 점수를 90 70 80으로 넣고, 총점과 평균을 구하시오.


public class assignment3 {
	public static void main(String[] args) {
		int korea = 90;
		int english = 70;
		int math = 80;
		int result = korea + english + math;

		System.out.println("총점 : " + result);
		System.out.println("평균 : " + result/3);

	}
}