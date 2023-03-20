package JavaTest;

public class Class  {
	//클래스는 오브젝트 프로젝트를 기본적으로 상속받고 오버라이딩 되어있음(extends Object) 
	//public은 내부 외부 다 쓸수잇음
	// protect 는 명싲거으로 써야만 가능
	
	public String publicString = "public";
	
	protected String prtectedString = "protected"; //default
	
	private String privateString ="private";
	//안에서만 사용가능
	
	String defalutString  = "default";
	//defalut는 같은 패키지 안에서만 사용가능
	
	public void run() {
		System.out.println("class run");

		System.out.println("private run");
	}
	public void run2() {
		System.out.println("private run");

	}

	
}
