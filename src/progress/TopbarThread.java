package progress;

import javax.swing.JProgressBar;

public class TopbarThread extends Thread{
	int count=0;
	JProgressBar bar;
	int interval;

	public TopbarThread(JProgressBar bar,int interval) {
		this.bar=bar;
		this.interval=interval;
		this.start();
	}
	public void run() {
		while(true){
		try {
			Thread.sleep(interval);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			count++;
			bar.setValue(count);
		}
		
	}

}
