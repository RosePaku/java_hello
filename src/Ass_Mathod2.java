

// 파일이름 : AddNum.java
// 작성자 : 박지인
// 작성일 : 2022년 10월 26일
// 목 적 : SEC 동작을 확인하는 예제

public class Ass_Mathod2 {

	int math = 100;
	int english = 95;
	int korea = 95;

	public static void main(String[] args) {

		System.out.println(grade(avg(100, 95, 95)));
	}

	public static double avg(int kor, int eng, int math) {
		return (kor + eng + math) / 3.0;

	}

	public static char grade(double avg) {
		char ch=' ';
		if (avg >= 90) {
			ch = '수';
		}
		else if (avg >=  80) {
			ch = '우';
		}

		else if (avg >= 70) {
			ch = '미';
		}
		else if (avg >= 60) {
			ch = '양';
		}
		else {
				ch = '가';
			return ch;
			}

		return ch;

}

}