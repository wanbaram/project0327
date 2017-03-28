package progress;

import javax.swing.JProgressBar;

public class ButtonbarThread1 extends BarThread{
	int count=0;
	JProgressBar bar;
	int interval;

	public ButtonbarThread1(JProgressBar bar, int interval) {
		super(bar, interval);
		// TODO Auto-generated constructor stub
	}
	

}
