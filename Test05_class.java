package oop0319;		// 현재 클래스의 저장위치. 한번만 선언한다.
//클래스를 사용하려면 저장위치 패키지를 선언하고 사용한다.

import java.io.*; // java.io 패키지 모든 클래스를 현재 패키지 내에서 사용하겠다.

import java.sql.*;				//데이터베이스 관련 클래스

import java.util.*;

import java.awt.*;				//GUI 관련 클래스 선언

import javax.swing.*;			//GUI 관련 클래스 선언

import java.util.Arrays;

import oop0318.*;

import java.lang.*; 			//자바의 기본 패키지 (생략 가능)






/*
 *  Acesss Modifier 접근제어, 접근수정
 *  ->private 	비공개	클래스 내부에서만 접근 가능하다. 은닉할 수 있다.
 *  ->package	생략한다 	현재 패키지 내에서만 접근 가능하다.
 *  ->protected	상속관계 	상속관계에 있는 클래스가 다른 패키지에 있는 경우 접근 가능하다.
 *  ->public 	공개		공개. basic01_java 프로젝트 내에서 모두 접근 가능하다.
 * 
 * 
 * 
 * 
 * 
 * */









public class Test05_class {

	public static void main(String[] args) {
		
		//클래스와 객체 (Object)
		//-->클래스명의 첫글자 대문자
		//-->구성멤버 : 멤버상수(field),멤버함수(method)
		
		System.out.println(Math.E);			//멤버변수
		System.out.println(Math.PI);		//멤버변수
		System.out.println(Math.abs(-3));	//멤버함수
		
		//자료형 DataType
		//->기본 자료형 
		//->참조 자료형(reference) : 클래스
		
		
		//new 연산자  
		//->클래스를 사용하려면 메모리를 할당하고 사용한다.
		//형식) new 클래스명 ()
		//-> 클래스 객체(Object) 또는 인스턴스(Instance) 라고 한다.
		
		//기본자료형
		int a=3; 	//int는 메모리 4바이트 할당 RAM의 stack영역에 할당
		//참조 자료형
		//RAM(Random Access Momery)의 heap영역에 메모리가 할당되고 주소값 발생된다.
		//new Sungjuk(); 클래스 객체 또는 인스턴스라 한다.
		
		//sj 참조변수(reference) : 메모리가 할당된 곳의 주소를 가르킨다.
		Sungjuk sj=	new Sungjuk();	//예 100번지
		
		
		//연산자
		//참조변수를 통해 객체에 접근하는 연산자.
		
		sj.name="손흥민";
		sj.kor=100;
		sj.eng=95;
		sj.mat=80;
		
		//sj.aver 에러. private 속성은 클래스 외부에서 접근 불가능
		
		sj.calc();
		sj.disp();
		//sj.view()에러. private 속성은 클래스 외부에서 접근 불가능
		
		Sungjuk one = new Sungjuk();	//예) 200번지
		
		one.name="김연아";
		one.kor=20;
		one.eng=30;
		one.mat=40;
		
		one.calc();
		one.disp();
		
		Sungjuk two=new Sungjuk(); //예 300번지
		
		two.name="박지성";
		two.kor=100;
		two.eng=95;
		two.mat=90;
		
		two.calc();
		two.disp();
		
		//참조변수가 가지고 있는 객체의 주소값
		System.out.println(one.hashCode());
		System.out.println(two.hashCode());
		
		Sungjuk tmp =two;
		System.out.println(tmp.hashCode());
		
		tmp.disp();
		
		
		
		
		

	}

}
