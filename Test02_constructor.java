package oop0320;

public class Test02_constructor {

	public static void main(String[] args) {
		//생성자 함수
		//오버로드가 가능하다.
		//Score 클래스 생성후 테스트하기
		
		//new Score();
		
		
		//생성자 함수의 전달값은 객체선언과 동시에 초기값을 전달해 주는 역할을 한다.
		
		Score one =new Score();
		one.calc();
		one.disp();
		
		Score two =new Score("손흥민");
		two.calc();
		two.disp();
		
		Score three =new Score(70,80,0);
		three.calc();
		three.disp();
		
		Score four =new Score ("김연아",10,20,30);
		four.calc();
		four.disp();
		
		//3가지 표현 방법
		String kim="개나리";	//toString()함수명 생략 가능하다
		System.out.println(kim);
		
		String lee=new String();
		lee ="진달래";
		System.out.println(lee);
		
		String park =new String ("무궁화");
		System.out.println(park);
	}	

}
