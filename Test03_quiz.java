package oop0319;

public class Test03_quiz {

	public static double sd(int[] aver) {
		
		int size =aver.length; //요소 갯수 :5

		//1단계 aver 누적합 구하기
		
		double sum=0.0;
		for(int i=0;i<size;i++) {
			sum+=aver[i];
		}	//for end
		
		//aver 배열 평균 구하기 
		double avg= sum/size;
		
		double hap =0.0; //편차 합
		for(int i=0; i<size;i++) {
			//aver의 각요소에서 avg값과의 차이 구하기
			double d= aver[i]-avg;
			
		//2 단계 
		//-> 편차 차이값을 전부 양수로 바꾸기 
		d=Math.abs(d);
		
		
		//양수로된 편차들의 누적합 구하기
		hap=hap+d;
		
		}//for end
		
		//3단계 표준 편차
		return hap/size;
	
	} //sd end
        
	
	
	
	public static void main(String[] args) {
		
		//문제) 표준편차(Standard deviation) 구하기
		
		
		int [] aver = {85,90,93,86,82 };
		double result =sd(aver);
		System.out.printf("표준편차: %.2f",result);
		
		
		/*
		 * 1) aver 평균 87.2 구하고, aver의 각 요소에서 87.2를 뺀다.
		 * -2.2
		 * 2.8
		 * 5.8
		 * 1.2
		 * 5.2
		 * 
		 * 2) 1)값을 전부 양수로 바꾼다.
		 * 
		 * 2.2 
		 * 2.8
		 * 5.8
		 * 1.2
		 * 5.2
		 * 3) 2)의 편차들의 평균값 ==표준편차
		 * 
		 * (2.2+2.8+5.8+1.2+5.2)/5 ->3.44
		 * 
		 * */
	}

}
