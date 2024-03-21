package oop0321;

import java.util.Calendar;

public class Test01_static {

	public static void main(String[] args) {

			
		//static 정적
		//-> 변수(정적변수, 클래스변수), 함수
		//메모리 생성 1번, 소멸 1번 된다.
		//->new 연산자를 이용해서 별도의 객체 생성 없이 사용가능하다.
		
		//static은 클래스명으로 직접 접근 가능하다.
		
		//->클래스명.변수
		//->클래스명.함수()
		
		
		System.out.println(Math.PI);
		System.out.println(Math.abs(-3));
		System.out.println(Calendar.YEAR);
		System.out.println(String.format("%.2f", 12.3456));	//"12.35"
		
		
		//1)static 특징 적용하지 않는 경우 (비추천ㅠ)
		Sawon one =new Sawon("1001","개나리",100);
		//나의 세금
		double myTax=one.pay*one.TAX;//100*0.03
		//나의 총 지급액 : 급여 -세금 +수당
		//payTotal = pay-tax+sudang
		int total = (int)(one.pay-myTax+one.SUDANG);//100-3+10
		
		System.out.println("회사:"+one.COMPANY);
		System.out.println("사번:"+one.sabun);
		System.out.println("이름:"+one.name);
		System.out.println("급여:"+one.pay);
		System.out.println("수당:"+one.SUDANG);
		System.out.println("세금:"+myTax);
		System.out.println("총지급액:"+total);
		
		one.line();
		
		
		//2)static의 특징을 적용할 경우 (추천 !!)
		Sawon two=new Sawon("1002","진달래",200);
		myTax=one.pay*Sawon.TAX;
		total=(int)(one.pay-myTax+Sawon.SUDANG);
		
		System.out.println("회사:"+Sawon.COMPANY);
		System.out.println("사번:"+two.sabun);
		System.out.println("이름:"+two.name);
		System.out.println("급여:"+two.pay);
		System.out.println("수당:"+Sawon.SUDANG);
		System.out.println("세금:"+myTax);
		System.out.println("총지급액:"+total);
		
		//static 클래스로 선언한 변수나 함수는 직접 접근하면됨 
		//==Sawon 클래스에 있는 static 변수 그냥 가져다 쓰면 됨
		
		
		
		//3) staic 변수의 연산 (continue)
		
		//-> 생성도 1번, 소멸도 1번 == 같은 주소라서 그럼
		
		Sawon kim =new Sawon("1003","무궁화",300);
		Sawon lee =new Sawon ("1004","봉선화",400);
		
		System.out.println(kim.SUDANG);	//10
		System.out.println(lee.SUDANG);	//10
		
		//static 변수 연산에서는 메모리 값이 이어진다? 
		
		kim.SUDANG=kim.SUDANG+1; //10+1
		
		System.out.println(kim.SUDANG);
		
		lee.SUDANG=lee.SUDANG+1;//11+1;
		System.out.println(lee.SUDANG);
		
		Sawon.SUDANG=Sawon.SUDANG+1; //12+1
		
		System.out.println(Sawon.SUDANG);		//추천
		System.out.println(kim.SUDANG);
		System.out.println(lee.SUDANG);
		
		
		
		
		
		
	}//main () end

}//class end
