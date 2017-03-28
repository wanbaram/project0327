package homework;

public class TimeThread extends Thread{
	CountApp countapp;
	int interval;
	int x=0;
	public TimeThread(CountApp countapp,int interval) {
		this.countapp=countapp;
		this.interval=interval;
		start();
	}

}
