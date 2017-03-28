/*
 * 서로다른 그래픽, 속도를 갖는 것을 움직이게 하자
 */
package homework;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MultiAni extends JFrame{
	JButton bt;
	Canvas can;
	CircleThred ct;
	Graphics gp;
	public MultiAni() {
		bt= new JButton("각자 움직이기");
		can= new Canvas(){
			public void paint(Graphics g) {
				//gp=g;
			}
		};
		can.setBackground(Color.YELLOW);
		add(bt,BorderLayout.NORTH);
		add(can);
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Graphics g=can.getGraphics();
				CircleThred ct= new CircleThred(0, 50, 50, 50, 10, g);
				RectThread rt= new RectThread(0, 200, 100, 100, 10, g);
				//ShapeThread st=ct;
				//st.start();
			}
		});
		setVisible(true);
		setSize(700, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new MultiAni();
	}
}
