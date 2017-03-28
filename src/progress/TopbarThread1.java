package progress;

import javax.swing.JProgressBar;

public class TopbarThread1 extends BarThread{
	int count=0;
	JProgressBar bar;
	int interval;

	public TopbarThread1(JProgressBar bar, int interval) {
		super(bar, interval);
		// TODO Auto-generated constructor stub
	}
	

}
