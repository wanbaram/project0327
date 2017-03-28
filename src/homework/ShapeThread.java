package homework;

import java.awt.Color;
import java.awt.Graphics;

/*
 * ���̴�, �簢���̴�, � ������ ǥ���� ��ü�̴�
 * ��� �� Ŭ������ 
 * ��???? ������ Ư¡�� �����Ƿ�
 */
abstract public class ShapeThread extends Thread{
	int width;
	int height;
	int x=0;
	int y=0;
	int interval;
	Graphics g;
	public ShapeThread(int x, int y, int width, int height, int interval,Graphics g) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.interval=interval;
		this.g=g;
		start();
	}
	abstract public void render();
	
	public void run() {
		while(true){
			try {
				Thread.sleep(interval);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			render();
		}
	
	}

}
