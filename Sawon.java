package oop0321;

class Sawon {

	
	
	
		//멤버변수 	field
		String sabun;	//사원번호
		String name;	//이름
		int pay;		//급여
		
		
	
	
	
	
		//생성자함수	constructor
		
		Sawon(){}
		Sawon(String sabun, String name, int pay){
			//다른 생성자 호출 :this() 쓰는 이유 : 생성자 간의 중복 방지
			//예를 들어 매개변수 수만 달리하고 필드 초기화 내용 비슷한 생성자에서 발생한다.
			//따라서, 이경우에는 필드 초기화내용은 한 생성자에만 집중!! 작성하고
			//나머지 생성자는 초기화내용을 가진 생성자를 호출하는 방법으로 개선가능하다.
			this.sabun=sabun;	
			this.name=name;
			this.pay=pay;
			
		} //constructor end
	
	
		//static 변수
		static String COMPANY="(주) 아이티윌";
		static int SUDANG=10;
		static double TAX=0.03;
		
		//staic 함수
		static void line() {
			System.out.println("-------------------------------");
		}//line end
		//멤버함수		method
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//class end
