package oop0320;

public class Sungjuk {	//package 생략되어 있다.
						//oop0320패키지내에서만 접근 가능하다.
	
	//멤버변수 field
	
	private String name="손흥민";
	private int kor,eng,mat;
	private int aver;
	
	
	//생성자함수 constructor
	
	public Sungjuk() {	//기본생성자 default constructor
		
	}


	public Sungjuk(String name, int kor, int eng, int mat) {
		this.name = name;	//this.멤버변수=지역변수
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public Sungjuk(int aver) {
		this.aver = aver;
	}
	
	
	//멤버변수 method
	
	public void calc() {
		aver=(kor+eng+mat)/3;
	} //calc() end
	
	
	public void disp() {
			
			String name="박지성";
			//지역변수의 우선순위가 가장 높다.
			System.out.println(name);
			
			System.out.println(this.name);
			System.out.println(this.kor);
			System.out.println(this.eng);
			System.out.println(this.mat);
			System.out.println(this.aver);
			
		} //disp() end


	
		
	

	
	
	
}//class end
