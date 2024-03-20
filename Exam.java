package oop0320;

public class Exam {

	
	
	
	
		//멤버변수 field
	
	
		private String name="손흥민";
		private int kor,eng,mat;
		private int aver;
		
		
		
		
		//생성자 함수 constructor
		//이클립스 메뉴 Source -> Generate Constructors from Superclass... ==기본 생성자 함수 생성
		public Exam() {
			
		}




		public Exam(String name) {
			this.name = name;
		}




		public Exam(int kor, int eng, int mat, int aver) {
			this.kor = kor;
			this.eng = eng;
			this.mat = mat;
			this.aver = aver;
		}




		
	
	
	
}// class end
