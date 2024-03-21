package oop0321;

 
	//종단클래스는 상속 받을 수 없다. ex) final class AA{}		(x)
	 class AA{ 
				private void zero () {} //상속되지 않음
				public void one() {
					System.out.println("AA.one()...");
				}
				public void two() {
					System.out.println("BB.two()...");
				}//two() end

	 }//class end
	 class BB	extends AA {
		 public void three () {
			 System.out.println("BB.three()...");
		 }//three() end
	 }//class end
	 
	 class CC extends BB{
		 public void four() {
			 System.out.println("CC.four()...");
		}//four() end
	 } // class end
	 
	 //자식클래스 CC, 부모클래스 BB
	 //class EE extends AA , DD {}
	 //에러. 클래스 간의 상속은 단일상속만 가능하다.
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
