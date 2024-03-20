package oop0315;

public class Test05_conversion {

	public static void main(String[] args) {

		
		//자료형 변환 
		
		//자동 형변환
		//정수형 byte short int long 순서
		//실수형 float double 순서
		
		byte a =3;
		int b=a; // 작은 단위가 큰 단위 데이터 값으로 들어감 ==자동 형변환
		
		long c=b; //자동 형변환 
		//a=c; 에러
		
		float d=3.4f;
		double e=d; //자동 형변환
		
		
		
		int kor =80, eng=95, mat=100;
		
		System.out.println((kor+eng+mat)/3);
		System.out.println((kor+eng+mat)/3.0);
		System.out.println((kor+eng+mat)/3.);
	
		
		//강제 형변환 (cast 연산)
		
		// (자료형)값
		
		System.out.println((int)3.5);
		System.out.println((double)4);
		System.out.println((int)2.6+(int)5.7);
		System.out.println((int)(2.5+5.7));
		
		
		//임의의 문자가 소문자인지 확인하시오.
		//소문자 'a' ~'z' 
		
		char ch = 'r';
		String result = (ch>='a'&&ch<='Z')?"소문자" : "기타" ;
		System.out.println(ch+result);
		
		
		
		
		
		
		
		
		
	}

}
