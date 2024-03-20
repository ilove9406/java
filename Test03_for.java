package oop0318;

public class Test03_for {

	public static void main(String[] args) {
		
		
		//반복문
		
		//1. for 문
		
		for (int a=1; a<=3; a++) {
			
			System.out.println("JAVA");
			
		} //for end
		
		//for 문에 선언된 변수는 for 문에서만 사용 가능하다.
		//System.out.println(a); 에러
		
		
		int b=0;
		for(b=1; b<=3;b++) {
			System.out.println("PYTHON");
		}
		
		System.out.println(b);
		
		
		//2. while 문
		
		int i=0;
		while(i<=3) {
			System.out.println("SEOUL");
			i++;
		}	//while end
		
		
		//3. do~while 문
		int j=0;
		do {
			System.out.println("JEJU");
			j++;
		} while (j<=3);		
		
		//4. break 문과 continue 문
		
		for (int a=1; a<10; a++) {
			if(a==5) {
				break; //반복문 빠져나감
			} //if end
			System.out.println(a+" ");
		} // for end
		
		System.out.println(); //줄바꿈
		
		for (int a=1; a<10; a++) {
			if(a==5) {
				continue; //반복문 계속 실행
			}//if end
			System.out.println(a+" ");
		}// for end
		
		
		
	}//main () end

}// class end
