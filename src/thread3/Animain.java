package thread3;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
//개발자가 쓰레드를 상속하여 개발 할 수 있으나 이미
//다른 클래스의 자식일 경우, 상속은 불가하다.
//이럴 때 사용할 수 있는 객체가 바로 
//Runnable 인터페이스이다!!
public class Animain extends JFrame implements Runnable{
	JButton bt;
	Canvas can;
	Thread thread;//내부익명 스타일로 개발
	int x=0;
	int y=0;
	public Animain() {
		//Runnable인 객체를 인수로 넣는다
		//그러면 run메서드의 호출은 Runnable을 
		//재정의한 메서드 객체의 run을 호출한다
		thread= new Thread(this);
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
	public static void main(String[] args) {
		new Animain();
	}
	


}
