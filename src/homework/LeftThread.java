package homework;

public class LeftThread extends Thread{
	CountApp countapp;
	int interval;
	int x=0;

	public LeftThread(CountApp countapp,int interval) {
		this.countapp=countapp;
		this.interval=interval;
	}
	public void run() {
		while(true){
			try {
		
			Thread.sleep(interval);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			x++;
			countapp.la_left.setText(Integer.toString(x));
		}
	}
}
