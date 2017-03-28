package homework3;

import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class Mybar extends Thread{
	int count;
	JProgressBar bar;
	
	public Mybar(JProgressBar bar,int count) {
		this.bar=bar;
		this.start();
		this.count=count;
	}
	public void run() {
				bar.setValue(count);
	}
}
