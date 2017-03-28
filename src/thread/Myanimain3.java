package thread;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Myanimain3 extends JFrame{
	JButton bt;
	Canvas can;
	Myanimain3 myanimain3;
	int x1=0;
	int	 y1=0;
	int x2=0;
	int	 y2=50;
	int x3=0;
	int	 y3=100;
	public Myanimain3() {
		myanimain3=this;
		bt= new JButton("물체이동");
		add(bt,BorderLayout.NORTH);
		can=new Canvas(){
			@Override
			public void paint(Graphics g) {
				g.drawOval(x1, y1, 50, 50);
				g.drawRoundRect(x2, y2, 50, 50, 20, 20);
				g.drawRect(x3, y3, 50, 50);
			}
		};
		can.setBackground(Color.YELLOW);
		add(can);
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CircleThread cir=new CircleThread(myanimain3,x1,y1);
				cir.start();
				RectThread rec=new RectThread(myanimain3);
				rec.start();
				RoundRectThread roundrec=new RoundRectThread(myanimain3);
				roundrec.start();
			}
		});
		setVisible(true);
		setSize(600, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void move1(){
		x1+=1;
		y1+=6;
		can.repaint();
	}
	public void move2(){
		x2+=1;
		y2+=6;
		can.repaint();
	}
	public void move3(){
		x3+=3;
		y3+=2;
		can.repaint();
	}
	public static void main(String[] args){
		new Myanimain3();
	}

}
