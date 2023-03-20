package JavaTest;

import java.time.LocalDateTime;
import java.util.concurrent.RunnableFuture;

public class Main {

	public static void main(String arg[]) {
		//자바가 실행시킬 수 있는지 찾아서 실행시키는것
		//스프링붕트에는 기본으로 생겨있음
		//자르파일은 얘가 있으면됨
		//와르는 톰캣에서 쓰레드별로 메인메소드있음
		//각 메인이 각자 사용하는 스레드 ?
	
		
		//Runnable 이라는 인터페이스 상속받고있음
		//실행될때마다 스레드가 실행된다고 생각하면됨
		//러너블 클래스로 메인클래스를 잡고 메인메소드를 실행하면서 구현
	
		/*
		 * Thread thread1 = Thread.currentThread(); //스레드확인
		 * System.out.print(thread1.getId());
		 * 
		 * Runnable runable = new Runnable() {
		 * 
		 * @Override public void run() { // TODO Auto-generated method stub
		 * System.out.println("Runnale 실행"); Thread thread2 = Thread.currentThread();
		 * System.out.print(thread2.getId()); } };
		 * 
		 * runable.run(); System.out.print(Thread.currentThread());
		 * 
		 * Class cs = new Class(); cs.run(); //클래스는 생성을 ㅂ만든다 cs.getClass();
		 * cs.hashCode();
		 * 
		 * System.out.println(cs.publicString);
		 */
//	
//	SuperClass sc = new SuperClass();
//	sc.run();
//	sc.run2();
	/*
	 * sc.prtectedString; sc.defalutString; sc.publicString;
	 */
	
		MemberVo memberVo = new MemberVo();
		memberVo.setName("James");
		memberVo.setBirthday(LocalDateTime.of(1987,4,19,0,0,0));
		
		System.out.println(memberVo.toString());
	}
	
}
