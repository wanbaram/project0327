package thread;

public class RectThread extends Thread{
	Myanimain3 myanimain3;
	
	public RectThread(Myanimain3 myanimain3) {
		this.myanimain3=myanimain3;
	}
	public void run(){
		while(true){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				myanimain3.move3();
		}
	}
	
}
