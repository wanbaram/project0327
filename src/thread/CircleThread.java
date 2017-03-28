package thread;

public class CircleThread extends Thread{
	Myanimain3 myanimain3;
	int x;
	int y;
	public CircleThread(Myanimain3 myanimain3,int x,int y) {
		this.myanimain3=myanimain3;
	}
	public void run(){
		while(true){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			myanimain3.move1();
		}
	}

}
