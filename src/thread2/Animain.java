package thread2;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Animain extends JFrame{
	JButton bt;
	Canvas can;
	Thread thread;//내부익명 스타일로 개발
	int x=0;
	int y=0;
	public Animain() {
		thread= new Thread(){
			public void run() {
			while(true){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				move();
			}
			}
		};
		bt= new JButton("물체이동");
		add(bt,BorderLayout.NORTH);
		can = new Canvas(){
			@Override
			public void paint(Graphics g) {
				g.drawOval(x, y, 50, 50);
			}
		};
		can.setBackground(Color.YELLOW);
		add(can);
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//이동 메서드 호출!!
				//동생 쓰레드를 만들어 일시키자!!
				thread.start();
	
			}
		});
		
		setVisible(true);
		setSize(700, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void move(){
		x+=5;
		can.repaint();
	}
	public static void main(String[] args) {
		new Animain();
	}

}
