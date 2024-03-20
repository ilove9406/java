package oop0318;

public class Test05_array {

	public static void main(String[] args) {
		
		//배열  Array
		
		//연속성 자료형 ,열거형
		//-> 1차원 배열 [행]
		//-> 2차원 배열 [행][열]
		//-> 3차원 배열 [면][행][열] <- 자바에서 없음 !!
		
		
	    //1.1차원 배열
		
		int []kor =new int[3];
		
		kor[0]=10;
		kor[1]=20;
		kor[2]=30;
		//kor[3] =40; ArrayIndexOutOfBoundsException 발생
		// kor 의 3번째 요소는 존재하지 않음
	
	
		System.out.println(kor[0]);
		System.out.println(kor[1]);
		System.out.println(kor[2]);
		//kor 배열 요소 갯수 
		System.out.println(kor.length);
		
		//메모리 할당 및 초기화 지정
		
		int [] eng= {20,30,40};
		
		for (int i=0 ; i<eng.length; i++) {
			System.out.println(eng[i]);
		} //for end
	
		
		double [] aver= {
				1,2,3,4,5,6
		};
		for(int i=0; i<aver.length;i++) {
			System.out.println(aver[i]);
		}//for end
		
		char [] ch ={ 'H','e','l','l','o' };
		for (int i=0; i<ch.length; i++) {
			System.out.println(ch[i]);
		}// for end
		
		String [] name = {"개나리","진달리","무궁화"};
		for ( int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}//for end
	
		//2. 2차원 배열(다차원 배열)
		//[행][열]
		//행,줄,row
		
		
		//2행 3열
		
		int [][]mat =new int [2][3]; //4바이트 *6=24바이트 메모리 할당
		mat [0][0]=10;
		mat [0][1]=20;
		mat [0][2]=30;
		
		mat [1][0]=40;
		mat [1][1]=50;
		mat [1][2]=60;
		
		//mat [4][4]=70;  ArrayIndexOutOfBoundsException 에러 발생
		
		
		
		for (int r=0; r<=1; r++) {
			for(int c=0; c<=2; c++) {
				System.out.println(mat[r][c]);
			}
		}//for end
		
		
		System.out.println(mat.length);	//2 mat 배열의 행의 갯수
		System.out.println(mat[0].length);	//3 mat[0]행의 열의 갯수
		System.out.println(mat[1].length);	//3 mat[1]행의 열의 갯수
		
		
		//2차원 배열에서는 각 행의 갯수는 달라도 된다.
		int [][] music = {
				{10,20}
				,{30,40,50,60}
				,{70,80,90}
		};
		
		System.out.println(music.length);
		System.out.println(music[0].length);
		System.out.println(music[1].length);
		System.out.println(music[2].length);
			
		int row =music.length;
		
		for(int r=0; r<row; r++) {
			int col =music[r].length;
			for(int c=0; c<col; c++) {
				System.out.println(music[r][c]+" ");
			}
			System.out.println();
		}
	}//main() end

	
	
} //class end
