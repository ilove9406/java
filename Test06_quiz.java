package oop0320;

import java.util.StringTokenizer;

public class Test06_quiz {

	public static void main(String[] args) {
	
		
		
		//String 관련 연습 문제
		
		//문1)
		
		
		
		/*
		 * 
		 * 출력결과
		 * webmaster
		 * itwill.co.kr
		 * 
		 * 
		 * 
		 * */
		
		String email = new String("webmaster@itwill.co.kr"); 	// 이메일 생성하면서 초기값 설정
		
		if(email.indexOf("@")==-1) {
			System.out.println("이메일 주소 틀림");
		} else {
			System.out.println("이메일 주소 맞음");
		
		
			int pos=email.indexOf("@");
			System.out.println(pos);//9
			
			//substring(), split(), StringTokenizer 클래스
			String id = email.substring(0,pos);	//(0,9)
			String server = email.substring(pos+1);	//10번째부터 마지막까지
			
			System.out.println(id);
			System.out.println(server);
		}	//if end
		
		
		
		//문2) 이미지 파일만 첨부 (.png .jpg .gif)
		/*
		 * 출력결과
		 * 파일명 : sky2024.03.20
		 * 확장명 : png
		 * 
		 * */
		
		// 이미지 파일 경로
        String path = "d:/fronted/images/sky2024.03.20.png";

        //path에서 마지막 "/" 기호의 순서값
        int lastSlash =path.lastIndexOf("/");
        System.out.println(lastSlash);
		//전체 파일명
        String file =path.substring(lastSlash+1);	//18
        System.out.println("전체파일명 : " +file);
        
        //파일에서 마지막 "."기호의 순서값
        int lastDot =file.lastIndexOf(".");
        System.out.println(lastDot);
        
        //파일명 
        String filename=file.substring(0,lastDot);
        System.out.println("파일명 : "+filename);
        
        //확장명
        String ext=file.substring(lastDot+1);
		System.out.println("확장명 : "+ext);
		
		//확장명을 전부 소문자로 변환
		ext =ext.toLowerCase();
		if(ext.equals("png")||ext.equals("jpg")||ext.equals("gif")) {
				System.out.println("파일이 전송되었습니다.");
		}else {
			System.out.println("이미지파일만 가능합니다.");
		}
		
		
	}//main () end

}// class end
