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
	Thread thread;//�����͸� ��Ÿ�Ϸ� ����
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
		bt= new JButton("��ü�̵�");
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
				//�̵� �޼��� ȣ��!!
				//���� �����带 ����� �Ͻ�Ű��!!
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
