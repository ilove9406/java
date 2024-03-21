package oop0321;

public class Jumsu {

	
	//멤버변수 field
	
	private int no;//번호
	private String name;//이름
	private char []ox=new char[5];//OX표시
	private int [] answer=new int[5];//답안지 제출
	public int score;//점수
	public int rank;//등수
	
	//생성자 함수 construct
	public Jumsu() {
		
	}
	
	public Jumsu (int no, String name,int a0, int a1, int a2, int a3, int a4) {
		this.no=no;
		this.name=name;
		this.answer[0]=a0;
		this.answer[1]=a1;
		this.answer[2]=a2;
		this.answer[3]=a3;
		this.answer[4]=a4;
		this.rank=1;
	}//end
	
		//문제)
		//정답(dap)과 제출한 답안(answer)를 비교해서 
		//OX를 구하고, 맞은 갯수에 따라 점수(score)를 구하시오.
	
	
	//멤버함수 method
	public void compute() {
		int [] dap = {3,3,3,3,3};//정답	
	/*
		int cnt=0;	//맞은 갯수
		for(int i=0; i<dap.length;i++) { //i번째 답까지 조회
			if(dap[i]==answer[i]) {	//진짜답==내답이 같다면 
				ox[i]='O';			//같으면 =0
				
			} else {
				ox[i]='X';			//틀리면 =X
			}
		}
		
		score= cnt*20;				//맞은갯수 *20
		
	*/
		
	for(int i=0; i<5; i++) {
		if(dap[i]==answer[i]) {
			this.ox[i]='O';
			this.score=this.score+20;
		} else {
			this.ox[i]='X';
		} //if end
	}//for end
		
	}//compute()end
	
	public void disp() {
		System.out.print(no+" ");
		System.out.print(name+" ");
		System.out.print(ox[0]+" ");
		System.out.print(ox[1]+" ");
		System.out.print(ox[2]+" ");
		System.out.print(ox[3]+" ");
		System.out.print(ox[4]+" ");
		System.out.print(score+" ");
		System.out.print(rank+" ");
		System.out.println();
	}//disp() end
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//class end
