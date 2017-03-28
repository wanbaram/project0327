/*
 * OS가 여러 프로세를 동시에 사용하는 것을 멀티 테스킹이라한다. 이와같이
 * 하나의 자바프로그램 내에서 세부적 실행단위를 만들어 동시에 수행시킬 수 있다. 이러한 세부적 실행단위를
 * 쓰레드라한다.
 * 자바는 개발자가 정의하지 않아도 이미 기본적으로 제공되는 실행용 쓰레드가 있으며 이러한 쓰레드를 가리켜
 * 메인쓰레드라한다. 
 */
package thread;

public class ThreadTest {
	//메인쓰레드 말고, 개발자가 원하는
	//사용자 정의; 쓰레드 하나 만들어서 원하는 
	//동시 작업을 시켜보자
	MyThread thread;
	public ThreadTest() {
		//메인쓰레드와는 독립적으로 실행될 수 
		//있는 세부 실행단위를 생성함
		//쓰레드가 어떤 일을 할지는 개발자가
		//결정해야 하기 때문에....
		thread= new MyThread();
		thread.start();
		//thread.run()--> 별도로 thread가 수행하는 것이 아니라 main이 직접 수행함
		while(true){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("☆");
		}
		
	}
	public static void main(String[] args){
		new ThreadTest();
	}

}
