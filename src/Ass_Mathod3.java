// 파일이름 : AddNum.java
// 작성자 : 박지인
// 작성일 : 2022년 10월 26일
// 목 적 : SEC 동작을 확인하는 예제

public class Ass_Mathod3 {

	public static void main(String[] args) {
		starPrint(3);
		starPrint(7);
		
	}
	public static void starPrint(int age) {
	
		for (int i = 1; i <= age; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("<hr>");
		
	
	}
}

