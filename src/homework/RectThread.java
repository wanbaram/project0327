package homework;

import java.awt.Color;
import java.awt.Graphics;

public class RectThread extends ShapeThread{

	public RectThread(int x, int y, int width, int height, int interval, Graphics g) {
		super(x, y, width, height, interval, g);
	}
	public void render(){
		//ȭ�������
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, 700, 600);
		//���ϴ� ���� �׸���
		x+=2;
		g.setColor(Color.RED);
		g.drawRect(x,y, width, height);		
	}
	

}
