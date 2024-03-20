package oop0320;

import java.util.Calendar;

//1) final 클래스 (종단클래스)
//class Animal{}
//class Elephant extends Animal{}
//final 클래스는 상속 받을수 없다.

//2)final 메소드
class Fruit {
	void view() {}
	final void disp() {}
} 
class Apple extends Fruit {
	
	@Override			//재정의 (리폼)  annotation
	void view() {}
	
	//@Override
	//void disp() {}	final 메소드는 더이상 override 할 수 없다.
}



public class Test07_final {

	public static void main(String[] args) {
			
		
		
			//final 마지막
			//변수	: 변수를 상수화
			//함수	: 더 이상 리폼(override 재정의) 할 수 없다.
			//클래스	: 종단클래스. 후손클래스를 생성할 수 없다.
		
		int a=3;	//변수는 다른 값으로 대입 가능
		a=5;
		
		final int b =2;//변수를 상수화 시킴
		
		System.out.println(Math.E);
		System.out.println(Math.PI);
		
		
		System.out.println(Calendar.YEAR);
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.DATE);

		System.out.println(Calendar.HOUR);
		System.out.println(Calendar.MINUTE);
		System.out.println(Calendar.SECOND);
	}

}
