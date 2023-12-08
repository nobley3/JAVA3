package interfaceEx;

public class 인터페이스Ex {

	public static void main(String[] args) {
		
		LibA  lib = new LibA();
		
		lib.forCharacter('?');
		
//		이름없이 인터페이스 클래스 정의
		lib.forSomethingDo(new SomethingDoI() {
			
			@Override
			public void doing() {
				System.out.println("코딩한다");
				
			}
		});

//		람다식
//		함수형 인터페이스인 경우 람다식 사용가능함
		lib.forSomethingDo(()->System.out.println("코딩해요"));
		
		
		
		
		
		class LibImp implements SomethingDoI{

			@Override
			public void doing() {
				System.out.println("<코딩시작>");
				for(int i=1;i<=3;i++) {
					System.out.println(i+"<코딩이당>");
				}
				
			}
			
		}
		//
		lib.forSomethingDo(new LibImp());
		
		lib.forSomethingDo(()->System.out.println("휴식을 취한다"));
		

		
	}

}
