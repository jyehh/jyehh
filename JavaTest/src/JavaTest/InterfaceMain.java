package JavaTest;

public class InterfaceMain {

	public static void main(String[] args) {
//		Interface interface1 = new Interface() {
//			
//			@Override
//			public void interfacerun() {
//				// TODO Auto-generated method stub
//				System.out.println("interfae");
//			}
//		};
//		interface1.interfacerun();
		
		FunctionallInerface.print();
		FunctionallInerface functionallInerface = new FunctionallInerface() {
			
			@Override
			public void get(int a, int b) {
				// TODO Auto-generated method stub
				System.out.println("이름을 출력" + (a + b));
			}
			
//		calculator.plus( (a,b)->{ 
//			System.out.println("두 값을 더한다" + (a + b));});
		
		//인터페이스에 메소드는 하나 . 람다식에 인자값 두개로 되어ㅣ잇는게 고유한 펑션의 인자값
		//화살표는 람다식으로 싲가한다, 괄호는 펑션에 들어갈 구현체값 ? 
		//만약에 리턴값이 스트링
		//구현된 메소드가 한줄이면 괄호 안써도 됨
		
		
		//파이프라인에 대한 이해 가 필요, 그거의 기반이 람다식 
	};
		
		Calculator calculator = new Calculator();
		calculator.plus(functionallInerface);
	}
}
