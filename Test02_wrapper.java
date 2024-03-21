package oop0321;

import java.lang.*;	//자바의 기본 패키지로 생략 가능하다.


public class Test02_wrapper {

	public static void main(String[] args) {
	
		
		//Wrapper class 포장 클래스
		//기본 자료형을 참조형화 해 놓은 클래스들을 말함.
		//대부분 java.lang 패키지 안에 선언되어 있음.
		
		
		
		/*
		 * 	기본형 		참조형(클래스)
		 * 	boolean		Boolean
		 *  byte		Byte
		 * 	short		Short
		 *  int			Integer
		 *	long		Long
		 *	float		Float
		 *	double		Double
		 *	char		Character
		 * */
		
		
		
		boolean boo1 =true; //(추천)
		//굳이 생성자 함수를 부르지 않아도 사용되게 해주겠다. 그러니 절판된 문법 사용하지마.
		Boolean boo2 =new Boolean("false");	//deprecated 절판된 문법	(비추천)
		Boolean boo3 = true; 
		
		System.out.println(boo1);
		System.out.println(boo2);
		System.out.println(boo3);
		System.out.println(boo3.toString());//"true" toString== 문자열데이터 취급
		
		
		
		// 기본형 클래스 변수 = 값;	(추천)
		byte by1=3;
		// 참조형 클래스 변수 =참조형 생성자 함수 (값);	(비추천)
		Byte by2=new Byte("5");
		Byte by3=7;
		
		System.out.println(by1);
		System.out.println(by2);
		System.out.println(by3);
		System.out.println(by3.toString());//"7"
		
		int in1=2;
		Integer in2= new Integer(4);
		Integer in3= 6;
		
		
		System.out.println(in1);
		System.out.println(in2);
		System.out.println(in3);
		
		System.out.println(in2.toString());	//"4"
		System.out.println(in3.doubleValue());//6.0
		
		System.out.println(Integer.toBinaryString(15));	//"1111"
		System.out.println(Integer.toOctalString(15));	//"17"
		System.out.println(Integer.toHexString(15));	//"f"
		
		System.out.println(Integer.sum(2, 4));	//6
		System.out.println(Integer.max(2, 4));	//4
		System.out.println(Integer.min(2,4));	//2
		
		
		//"123" ->123 변환
		System.out.println(Integer.parseInt("123"));
		
		//System.out.println(Integer.parseInt("KOREA"));
		// java.lang.NumberFormatException: For input string: "KOREA"
		//형변환 할 때 이 에러는 어딘가에 쓰레기 데이터가 들어 있을 떄 발생하는 에러이다.
		
		
		
		long lo1=3L;
		Long lo2 =new Long(5);
		Long lo3 =7L;
		
		double dou1=2.4d;	//접미사 d 생략 가능 하다.
		Double dou2=new Double("3.5");
		Double dou3=6.4;
		
		
		//문)실수형값들 중에서 정수의 합을 구하시오. 2+3+6
		int hap = (int)dou1+dou2.intValue()+dou3.intValue();
				//기본형은 cast연산(강제형변환)이용했고, 나머지는 참조형이니까 클래스 연산 이용?
				System.out.println(hap);
		
		char ch1 ='R';
		Character ch2 =new Character('a');
		Character ch3 ='m';
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.toLowerCase('R'));
		System.out.println(Character.toUpperCase('r'));
		
		//문)
		
		
		
		
		
		
		
	}//main() end

}//class end
