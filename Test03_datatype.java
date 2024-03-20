package oop0315;

public class Test03_datatype {

	public static void main(String[] args) {
	
		
		
		
		//자료형
		
		//정수형
		//소수점 없는 값
		byte a =1;
		short b=3;
		int  c=5;
		long d=7;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		//변수의 자료형은 중복 선언 불가
		
		
		
		//실수형
		//소수 점 있는 값
		float e=1.2f;	//4b 접미사 float 형태는 f 반드시 추가 
		double f=2.4;	//8b 접미사 생략 가능
		
		System.out.println(e);
		System.out.println(f);
		
		System.out.println(3);	//int
		System.out.println(3.0);//double
		System.out.println(3.);//실수형
		
		//문자형
		//-> 문자 1개만 저장
		char ch ='R';
		System.out.println(ch);
		
		ch='가';
		System.out.println(ch);
		//문자열형
		// -> "문자열"
		String str ="KOREA";// 참조형 (클래스 ) ==String
		System.out.println("KOREA");
		str="";
		System.out.println("#"+str+"#");
		str=" ";
		System.out.println("#"+str+"#");
	
		//논리형
		boolean flag =true;
		System.out.println(flag);
		flag =false;
		System.out.println(flag);
	
		System.out.println(true);
		System.out.println("true");
		
		//연습 성적 프로그램
		
		String name= "무궁화";
		int kor=80, eng=85, mat =100;
		
		//double aver=(kor+eng+mat)/3;
		double aver=(kor+eng+mat)/3.0;
		
		System.out.println("이름"+name);
		System.out.println("국어"+kor);
		System.out.println("영어"+name);
		System.out.println("수학"+mat);
		System.out.println("평균"+aver);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
