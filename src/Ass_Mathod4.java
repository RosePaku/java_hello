

// 파일이름 : AddNum.java
// 작성자 : 박지인
// 작성일 : 2022년 10월 26일
// 목 적 : 1+10까지 출력

public class Ass_Mathod4 {

	public static void main(String[] args) {
		getHap(10);
	}
	
	public static void getHap(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {

			if (i != num)
				System.out.println(i + " + ");
			else
				System.out.println(i + " = ");
			sum += i;
		}
		System.out.println(sum);
	}
	
}
