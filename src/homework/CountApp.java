package homework;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CountApp extends JFrame{
	JPanel p;
	RightThread t_right;
	LeftThread t_left;
	JLabel la_right,la_left;
	int x=0;
	int y=0;
	public CountApp() {
		p=new JPanel();
		la_right=new JLabel(Integer.toString(0));
		la_left=new JLabel(Integer.toString(0));
		p.add(la_left);
		p.add(la_right);
		add(p);
		p.setBackground(Color.RED);
		setVisible(true);
		setSize(600, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		t_right=new RightThread(this,100);
		t_left=new LeftThread(this,200);
		t_left.start();
	
	}
	public static void main(String[] args){
		new CountApp();
	}

}
