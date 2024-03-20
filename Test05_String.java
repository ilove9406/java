package oop0320;

import java.util.StringTokenizer;

public class Test05_String {

	public static void main(String[] args) {

		
		//문자열 관련 클래스
		
		String str = "HAPPY";
		String name=new String ("HAPPY");
		
		System.out.println(str.length());
		System.out.println(name.length());
		
		if(str==name) {
			
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		
		//문자열의 내용을 비교하는 경우 == 연산자 사용하지 않고 equals()함수를 이용할 것
		
		if(str.equals(name)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		//문자열의 갯수가 0인지?
		if(str.isEmpty()) {
			System.out.println("빈 문자열");
		} else {
			System.out.println("빈 문자열 아님");
		}
		
		
		str = new String ("Gone With The Wind");
		System.out.println(str);
		
		
		//특정 문자를 기준으로 문자열 분리하기
		String[] word=str.split(" ");
		
		for(int i=0; i<word.length;i++) {
			System.out.println("#"+word[i]+"#");
		}
		
		//문) 문자열에서 공백문자를 기준으로 분리하기
		// StringTokenizer 클래스를 이용할 것
		
		StringTokenizer st =new StringTokenizer(str," ");
		
		while (st.hasMoreTokens()) {//토큰할 문자가 있는지?
			System.out.println(st.nextToken());//토큰한 문자열 가져오기
		}//while end
		
		
		//String 
		//StringBuffer
		//StringBuilder
		
		//문자열 연산 속도는 String이 가장 느림, StringBuffer 이나 StringBuilder 추천!!
		//많은 연산이 일어날 경우가 아니면 String 클래스 추천!! 
		
		
		String s1="";
		System.out.println(s1.length());
		
		s1= s1+"ONE";
		System.out.println(s1.length());
		
		s1=s1+"TWO";
		System.out.println(s1.length());
		
		s1=s1+"THREE";
		System.out.println(s1.length());
		
		System.out.println(s1);
		System.out.println(s1.toString());
		
		s1 ="";//모든 문자열 지우기 (빈문자열 대입)
		
		
		StringBuilder s2= new StringBuilder();
		
		s2.append("SEOUL");
		System.out.println(s2.length()+s2.toString());
		s2.append("JEJU");
		System.out.println(s2.length()+s2.toString());
		s2.append("BUSAN");
		System.out.println(s2.length()+s2.toString());
		
		//모든 문자열 지우기
		s2.delete(0, s2.length());
		System.out.println(s2.length());
		System.out.println("#"+ s2.toString()+"#");

		StringBuffer s3=null;
		System.out.println(s3.length());
	
	
	}//main() end

}// class end
