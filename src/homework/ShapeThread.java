package homework;

import java.awt.Color;
import java.awt.Graphics;

/*
 * 원이던, 사각형이던, 어떤 도형을 표현한 객체이던
 * 모두 이 클래스의 
 * 왜???? 공통적 특징이 있으므로
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
