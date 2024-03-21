package oop0321;

public class Test07_override {

	public static void main(String[] args) {
		
		
		//Method Overload 함수 재정의
		// -> 상속관계에서 물려받은 메소드를 다시 수정 (리폼)
		
		
		
		//Korea클래스 생성
		
		//1)오버라이드 하지 않은 경우
		
		Seoul se = new Seoul();
		se.view();
		se.disp();
		
		
		
		//2)오바라이드 한 경우
		Busan bu =new Busan();
		bu.view();
		bu.disp(); 
		//부모클래스인 Korea클래스의 disp 함수를 자식클래스인 Busan disp함수에서 재정의함
		
		
		
		
		
		
	}//main ()end

}//class end
