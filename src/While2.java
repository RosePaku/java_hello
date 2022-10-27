
// 파일이름 : While2.java
// 작성자 : 박지인
// 작성일 : 2022년 10월 27일
// 목 적 : 처음 만나는 5의 배수이자 7의 배수인 수를 찾는 반복문

public class While2 {
	
		public static void main(String[] args) {
		
			int num = 1;
			boolean search = false;
			
			while (num < 100) {
			if(((num % 5) == 0) && ((num % 7) == 0)) {
				search = true;
				break; 
			}
			num++;
			}
		if(search)
			System.out.println("찾는 정수 : " + num);
		else	
			System.out.println("5의 배수이자 7의 배수인 수를 찾지 못했습니다.");
		
		}
	}