// 파일이름 : AddNum.java
// 작성자 : 박지인
// 작성일 : 2022년 10월 26일
// 목 적 : 1~10을 더하면

public class Ass_Mathod1 {
	
	public static void main(String[] args) {
		System.out.println(  + getHap(10));
	}

	public static int getHap(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		return sum;
	}
}

/*
 * for (int i = 1; i <= 5; i++) { for (int j = 5; j >= i; j--) {
 * System.out.print("*"); } System.out.println();
 */