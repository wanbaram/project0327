package homework2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountApp extends JFrame{
	JLabel la1,la2;
	public CountApp() {
		la1= new JLabel("0");
		la2= new JLabel("0");
		
		setLayout(new FlowLayout());
		
		//�˾ƺ��� ���� ��� ��������!!
		la1.setBackground(Color.YELLOW);
		la2.setBackground(Color.YELLOW);
		la1.setPreferredSize(new Dimension(300, 380));
		la2.setPreferredSize(new Dimension(300, 380));
		la1.setFont(new Font("Dotum", Font.BOLD, 75));
		la2.setFont(new Font("Dotum", Font.BOLD, 75));
		add(la1);
		add(la2);
		
		setSize(700, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		CountThread ct1=new CountThread(la1, 100);
		CountThread ct2=new CountThread(la2, 50);
	}
	public static void main(String[] args){
		new CountApp();
		
	}

}
