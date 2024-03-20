package oop0318;

public class Test04_quiz {

	public static void main(String[] args) {
		

		
		//제어문 연습문제
		
		//문1)알파벳을 아래와 같이 한줄에 5개씩 출력하시오
        /*
            ABCDE
            FGHIJ
            KLMNO
            PQRST
            UVWXY
            Z
        */
		

		        int cnt = 0;
		        for(char ch = 'A'; ch <= 'Z'; ch++) {
		            System.out.print(ch);
		            cnt++;
		            if(cnt == 5) {
		                System.out.println();
		                cnt = 0;
		            }
		        }
		 
		

		
		        System.out.println(); // 줄바꿈
		
		
		
		//문2)아래와 같이 출력하시오
        /*
            ####
             ###
              ##
               #
        */
		
		        int n = 4; // 줄 수

		        for (int i = 0; i < n; i++) {	
		            // 공백 출력
		            for (int j = 0; j < i; j++) {
		                System.out.print(" ");
		            }
		            // # 출력
		            for (int k = 0; k < n - i; k++) {
		                System.out.print("#");
		            }
		            System.out.println(); // 줄바꿈
		        }
		        
		        
		//문3)다음식의 결과값을 구하시오
        /*
               1   2   3   4   5      99
               ─ - ─ + ─ - ─ + ─ ...  ──   = 0.688172
               2   3   4   5   6      100
        */	
		        
		        
		
		        double sum = 0;
		        for (int i = 1; i <= 99; i++) {
		                if (i % 2 == 1) {
		                     sum += (double) i / (i + 1);
		                 } else {
	                      sum -= (double) i / (i + 1);
		                 }
		        }
		                System.out.println("결과: " + sum);
		            
		     
		
		//문4)아래와 같이 계산해서 출력하시오
        /*    
             1+....+10=55
            11+....+20=155
            21+....+30=255

            81+....+90=855
            91+....+100=955   
        */
		         
		                int sum2 = 0;
				          int start = 1;								// 첫 숫자 =1
				          int n2 =10;
				          for (int i = 0; i < 10; i++) {				// 0 부터 9 까지 
				                   int end1 = start + 9;				// 해당 줄의 끝 숫자= 해당 줄의 첫 숫자 +9
				                   for (int j = start; j <= end1; j++) {// 두번째 줄부터는 
				                        sum2 += j;
				                   }
				                   
				                  System.out.println(start + "+....+" + end1 + "=" + sum2);
				                  
				                  start = end1 + 1;
				                   sum2 = 0;
				         }
		  //문5)어느 달팽이는 낮에는 3cm올라가고, 밤에는 2.5cm 내려온다고 할때
		  //달팽이가 13cm의 나무 꼭대기에 올라가려면 며칠이 걸리는지 구하시오 (21일)
			
				          
		 
				          
				          
				          
				          int day=0;
				          double snail=0.0;
				          
				          while(true) {
				        	  day ++;
				        	 snail=snail +3.0;
				        	 if(snail>13.0) {
				        		 break;
				        		 
				        	 } else {
				        		 snail =snail-2.5;
				        	 }//if end
				        	  
				        	  
				          } // while end
		
				          
				          System.out.println(day+"일");
				          
				          
				          
				          
				          
				          
				          
				          
				          
		
	}	//main() end

}// class end
