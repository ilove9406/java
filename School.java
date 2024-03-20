package oop0320;

public class School {//package 생략되어 있다.
					 //school클래스 oop0320패키지내에서만 사용가능하다.
	
	
	
	//멤버변수(field) 
	private String name;
	private int kor,eng,mat;
	private int aver;
	
	//생성자 함수(Constructor)
	//클래스명과 동일한 함수
	//리턴형이없다
	// public void School(){} 쓰지 않도록 주의!
	
	public School() {	//기본 생성자 함수
						//default constructor
						//자동으로 생성된다.
		System.out.println("school() 호출됨...");
	}
	
	
	
	//멤버함수(method)
	public void calc() {
		aver=(kor+eng+mat)/3;
	} //calc() end
		
	public void disp() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println(aver);
	} //disp() end
	
		
	
	
	
	
	
	
	
	
	
}//school class end
