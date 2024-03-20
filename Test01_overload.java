package oop0319;

public class Test01_overload {

	
	
	public static void  hap(int a) {	
		System.out.println(a);
	} //hap () end
	
	public static void  hap(int a, int b) {
		System.out.println(a+b);
	}		//void 형은 리턴값이 없다.
		
	public static void hap(double a) {
		System.out.println(a);
	}
	
	
	public static void hap(double a, double b) {
		System.out.println(a+b);
	}   //함수명의 중복 발생 --> 메소드오버로딩이 발생했다 (객체지향프로그래밍에서의 정의)
	
	public static void main(String[] args) {
		//Method Overload 함수명 중복 정의
		//->함수명을 중복해서 사용할 수 있다. (함수명 중복 == 메소드오버로딩)
		// 메소드 오버로드 전제조건
		//-> 매개변수의 갯수가 달라야한다.
		//->매개변수의 자료형이 달라야한다.
	
		hap(3);
		hap(2,4);
		hap(5.6);
		hap(8.9,7.6);
		
		//절대값
		System.out.println(Math.abs(-3));	//int 
		System.out.println(Math.abs(4L));	//long
		System.out.println(Math.abs(5.6f));	//float
		System.out.println(Math.abs(7.8d));	//double
		
	}//main () end

	
	
}// class end
