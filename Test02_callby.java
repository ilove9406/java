package oop0319;

import java.util.Arrays;

public class Test02_callby {

	
	
	
	public static void test1(int a,int b) {
		System.out.println(a);
	}
	
	public static void test2(int []a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);                                                                                                                                                                                                                                                                        println(a[i]);
		}
	}
	
	
	private static void println(int i) {
		// TODO Auto-generated method stub
		
	}

	public static void test3(String a, String b) {
		System.out.println(a);
		System.out.println(b);
	}
	public static void test4(String[] a) {
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void test5 (int a ,int b) {//test5
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void test6 (int [][]a) {//test6
		
		for(int i=0;i<a.length;i++) {
			int col=a[i].length;
			for(int j=0;j<col; j++) {
				System.out.println(a[i][j]);
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
		//메소드 호출 방식
		//->Call by value 값에 의한 호출방식
		//->Call by reference 참조(주소)에 의한 호출 방식
	

		
		
	int [] num = {10,20,30};
	//Call by value
	test1 (num[0],num[2]);
		
	//Call by reference
	test2(num);//배열 요소가 저장되어 있는 주소
				//배열 전체
	
	String [] name={"무궁화","오필승","코리아"};
	test3 (name[0],name[2]);	//"무궁화","코리아"
	test4 (name);
	
	
	
	//[2][3];
	int [][]su = {
			 {1,2,3}
			,{4,5,6}
	};
	
	test5(su[0][0],su[1][1]); //1,5
	test6(su);
	
	int [] lotto = {3,7,4,15,28,13};
	Arrays.sort(lotto);
	//1차원 배열을 전달하면 오름차순 정렬 
	
	for (int i=0; i<lotto.length;i++) {
		System.out.println(lotto[i]+" ");
	}
	
	
	
	
	
	
	
	}//main

} //class
