package oop0320;

public class Score {

	
	
	//멤버변수 	field
	private String name;
	private int kor,eng,mat;
	private int aver;
	
	//생성자함수 	constructor
	public Score() {// 생성자함수가 없으면 기본적으로 자동생성됨
		System.out.println("Score()호출됨...");
	}//Score() end
	
	//생성자 함수  오버로드(함수명 중복 정의)
	public Score(String n) {
		name=n;
	} //end
	
	public Score(int k, int e, int m) {
		kor =k;
		eng =e;
		mat =m;
	}//end
	
	
	public Score (String n, int k, int e, int m) {
		name=n;
		kor=k;
		eng=e;
		mat=m;
	}//end
	
	//멤버함수 	method
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
	
}
