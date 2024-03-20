package oop0318;

public class Test07_method {

	
	
	
	public static void test1() {
		System.out.println("JAVA");
	}
	public static void test2() {
		System.out.println("PYTHON");

	return; 	//함수를 호출한 시점으로 되돌아 간다.
				//마지막 return명령어는 생략 가능하다.
	}	
	
	public static void test3(int a){	//매개변수의 자료형은 생략할 수 없다.
		System.out.println(a);
	}
	public static void test4(int a, int b, int c) {//매개변수는 개별적으로 선언한다.
		System.out.println(a+b+c);
	}
	public static void test5(double a, double b) {
		System.out.println(a+b);
	}
	
	public static void test6(char ch, byte num)
	{
		for(int a=1; a<=num;a++) {
		
			System.out.println(ch);
		}
	}
	public static void main(String[] args) {
		
		
		
		//Method
		//함수,function,프로시져
		
		//1.리턴 값이 없는 함수 ( void형) 
		
		
		
		//1)전달값(argument value)이 없는 경우

		
		
		test1();//함수호출
		test1();
		test2();
		test1();
		
		//2)전달값이 있는 경우
		test3(10);
		test4(20,30,40);
		test5(1.2,3.4);
		
		//문제 #기호를 100번 출력하시오
		byte num=100;
		char ch='#';
		test6(ch,num);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
