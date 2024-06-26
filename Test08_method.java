package oop0318;

public class Test08_method {

	
	
	
	
	
	
	public static int test1(int a, int b) {
		int c= a+b;
		return c;	//리턴값이 없다 (void 형)--> 이부분 오류떠서  내 임의대로 바꿈 
		//return c;//리턴값이 1개만 리턴할 수 있다.
	}
	
	
	
	public static String test2( int a) {
		if(a%2==0) {
			return "짝수";
		} else {
			return "홀수";
		}
	}
	public static boolean test3(int y) {
		if(y%4==0&&y%100!=0 ||y%400==0) {
			return true ;
		}else {
			return false;
		}
	}
	public static long test4 (int n) {
		long gop=1;
		for(int a=n; a>=1; a--) {
			gop=gop*a;
		}
		return gop;
		
	}
	public static long fact (int n) {
		if (n==0) {
		return 1;	
	}else {
		return n*fact(n-1);	
		}
	}
	public static void main(String[] args) {
		//2.리턴값이 있는 경우
		
		
		System.out.println(Math.abs(-3));
		System.out.println(Math.max(5, 7)+1);
		
		
		
		int result = test1(2,4);//6
		System.out.println(result);//6
		
		//값 : 상수값,변수값,리턴값

		System.out.println(test1(5,7)+1);
		
		//짝수,홀수 출력
		String str =test2(7);
		System.out.println(str);

		//윤년확인
		if(test3(2024)) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
		
		
		//곱변수
		long f=test4(5);
		System.out.println(f);
		
		//3. 재귀적 함수 호출
		//팩토리얼 구하기
		System.out.println(fact(5));
	}

}
