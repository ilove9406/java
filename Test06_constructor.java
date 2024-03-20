package oop0319;

import java.util.GregorianCalendar;

public class Test06_constructor {

	public static void main(String[] args) {
		
		//생성자 함수 (Constructor)
		//->클래스명과 동일한 함수
		//->new 연산자와 함께 메모리 할당할 때 사용한다.
		//->오버로드가 가능하다.
		
		
		//소멸자 함수 (Destructor) -> 자바에는 없음
		//가비지 콜렉팅 (Garbage Collecting)
		//JVM이 자동으로 메모리 회수를 함
		
		
	GregorianCalendar today = new GregorianCalendar();
	
	if(today.isLeapYear(2024)) {
		System.out.println("윤년");
	}else {
		
	}
		System.out.println("평년");
		
	
	//문1) 서기 1년 ~ 서기 2024년까지 윤년 갯수를 구하시오
		
		
			
			
		int count1=0;
		for(int y=1; y<=2024;y++) {
			if((y%4==0&&y%100!=0)||y%400==0){
				count1++;
			}
		}
			System.out.println(count1);
			
			
		
		
		
		
		
	}	//main end
	
}//class end
