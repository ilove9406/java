package oop0320;

public class Test04_array {

	public static void main(String[] args) {

		
		
		//객체 배열

		
		
		Sungjuk kim = new Sungjuk("봉선화",10,20,30);	//#100
		Sungjuk lee = new Sungjuk("라일락",40,50,60); //#200
		Sungjuk park = new Sungjuk("진달래",70,80,90);//#300
		
		
		kim.calc();
		kim.disp();
		
		lee.calc();
		lee.disp();
		
		park.calc();
		park.disp();
		
		
		/*
        +---------+---------+--------+
        |  #400   |  #500   |  #600  |
        +---------+---------+--------+
		 */
		
		Sungjuk [] sj = {
				
				 new Sungjuk ("오필승",11,22,33)
				,new Sungjuk("코리아",44,55,66)
				,new Sungjuk("대한민국",77,88,99)
		};
		
	//	sj[0].calc();
	//	sj[1].calc();
	//	sj[2].calc();
		
	//	sj[0].disp();
	//	sj[1].disp();
	//	sj[2].disp();
		
		
	int size =sj.length;
	
	for (int i=0; i<size;i++) {
		sj[i].calc();
		sj[i].disp();
	}
		
		
		
		
		
	}//main() end

}// class end
