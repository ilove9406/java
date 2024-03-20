package oop0320;

public class Test03_this {

	public static void main(String[] args) {
		//this
		//클래스가 자신을 가르키는 대명사
		//멤버변수와 일반지역변수를 구분하기 위함
		
		//Jumsu 클래스 생성후 테스트 합니다.
		
		Jumsu one =new Jumsu();
		one.disp();
		
		Jumsu two =new Jumsu("김연아",50,60,70);
		two.disp();
		
		Jumsu three =new Jumsu("무궁화",10,20,30);
		three.disp();
		
		//객체가 참조하고 있는 주소
		
		System.out.println(one.hashCode());
		System.out.println(two.hashCode());
		System.out.println(three.hashCode());
		
		
		//이클립스 코딩툴에서 생성자 함수를 자동 코디알 수 있다.
		
		// Exam 클래스 생성후 테스트 하기
		
		
		
		
		
		
		
		
		
		
		
		
	}//main end

}// class end
