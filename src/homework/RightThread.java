package homework;

public class RightThread extends TimeThread{
	CountApp countapp;
	int interval;
	int x=0;

	public RightThread(CountApp countapp,int interval) {
		super(countapp, interval);
	}

}
