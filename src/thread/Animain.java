package thread;

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
	MoveThread thread;
	Animain aniMain;
	int x=0;
	int y=0;
	public Animain() {
		aniMain=this;
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
				thread=new MoveThread(Animain.this);
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
