package interfaceEx;

public class LibAEx {

	public static void main(String[] args) {
		
		LibA liba = new LibA();
		
		liba.forStart();
		liba.forCharacter('A');
		liba.forSomethingDo(new B());
	}

}


// 인터페이스 구현한 클래스
class B implements SomethingDoI{

	@Override
	public void doing() {
		 System.out.println("썸띵");
		
	}
	
}
