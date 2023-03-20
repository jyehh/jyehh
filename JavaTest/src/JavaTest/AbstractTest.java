package JavaTest;

public class AbstractTest {
public static void main(String[] args) {
	AbstractClass abstractClass = new AbstractClass() {
//		@Override
//		public void run2() {
//			// TODO Auto-generated method stub
//			System.out.println("abstract 구현");
//		}
		@Override
		public void run3() {
			// TODO Auto-generated method stub
			System.out.println("run3 test");
		}
	};
	
	
	abstractClass.run();
	abstractClass.run2();
	abstractClass.run3();
	//매번 상속해서 쓰기는 힘들고 추상클래스로 만들어서 매번 사용할때마다 구현할 수 있ㄱㅔ 함 
	// 많이 사용 안하고 인터페이스를 자주 사용함
	
}
}
