package thread;

public class RoundRectThread extends Thread{
	Myanimain3 myanimain3;
	
	public RoundRectThread(Myanimain3 myanimain3) {
		this.myanimain3=myanimain3;
	}
	public void run(){
		while(true){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				myanimain3.move2();
		}
	}
	
}
