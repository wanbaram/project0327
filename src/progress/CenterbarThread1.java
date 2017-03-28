package progress;

import javax.swing.JProgressBar;

public class CenterbarThread1 extends BarThread{
	int count=0;
	JProgressBar bar;
	int interval;

	public CenterbarThread1(JProgressBar bar, int interval) {
		super(bar, interval);
		// TODO Auto-generated constructor stub
	}
	

}
