

// 파일이름 : AddNum.java
// 작성자 : 박지인
// 작성일 : 2022년 10월 26일
// 목 적 :
/*grade((avg(100,100,100))  //
출력: 수 */

public class Ass_Mathod5 {
	int m = 100;
	int e = 100;
	int k = 100;
	
	public static void name(String[] args) {
		System.out.println(grade(avg(100, 100, 100)));
	}
	public static double avg(int m, int e, int k) {
		return (m+e+k) /3.0;
	}
	public static char grade(double avg) {
		char ch=' ';
		if (avg >= 90) {
			ch = '수';
		}
		else if (avg >= 80) {
			ch = '우';
		}
		else if (avg >= 80) {
			ch = '미';
		}
		else if (avg >= 80) {
			ch = '양';
		}
		else {
			ch = '가';
			return ch;
		}
		return ch;
	}

}
