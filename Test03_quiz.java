package oop0321;

public class Test03_quiz {

	public static void main(String[] args) {
	
		
		//Wrapper 클래스 관련 연습문제
		//Wrapper class ==포장 클래스
		//자바에서 사용되는 원천타입의 데이터를 서로 형 변환이 가능하도록 지원해주는 Class
		//Wrapper Class 를 사용하는 이유는 크게 두가지로 형변환과 비교연산을 하기 위해서 이다.
		//문1) 대소문자를 서로 바꿔서 출력하기
		
		// 출력결과 gONE wITH tHE wIND!!
		
		String str = "Gone With The Wind!!";
		String answer ="";
		for(int i = 0; i< str.length();i++){//str =문자열 길이 만큼 반복
            char ch = str.charAt(i);	//i번째 위치에 따라 한 문자씩 조회
            //charAt()==String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해주는 녀석
            if(Character.isUpperCase(ch)){	//i번째 문자가 대문자이면 
                answer += Character.toLowerCase(ch);//소문자로 변환
            } else{
                answer += Character.toUpperCase(ch);//i번째 문자가 대문자가 아니면 대문자로 변환
            }
        }
        System.out.println(answer); //결과 출력
		
		
		
		//문2) 주민번호의 각 숫자의 합을 구하시오.
		//출력결과 8+9+1+2+3+0+1+2+3+4+5+6+7
		String Jumin ="8912301234567";
		
		int sum =0;
		//1)Character 클래스
		for(int i = 0; i < Jumin.length(); i++) {//jumin=문자열 길이 반복
		    char ch = Jumin.charAt(i);//i번째 문자 조회
		    int digit = Character.getNumericValue(ch); // i번째 문자를 숫자로 변환
		    sum += digit;//digit에 담긴 숫자들을 더함
		}

		System.out.println(sum);//결과 출력
		
		//2)Integer클래스
		
		int hap=0;
		for(int i=0; i<Jumin.length();i++) {
			char ch = Jumin.charAt(i);
			int digit =Integer.parseInt(String.valueOf(ch));//문자열을 숫자로 변환
			hap+=digit;
			
		}
		System.out.println(hap);		
		
		
		
		
	}//main () end

}//class end
