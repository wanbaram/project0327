package progress;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBarTest extends JFrame{
	JProgressBar[] bar=new JProgressBar[3];
	BarThread[] bart= new BarThread[3];
	int[] interval={10,100,1000};
	JButton bt;
	public ProgressBarTest() {
		setLayout(new FlowLayout());
		for(int i=0; i<bar.length; i++){
			bar[i]= new JProgressBar();
			bart[i]= new BarThread(bar[i],interval[i]);
			bar[i].setPreferredSize(new Dimension(500, 40));
			add(bar[i]);
		}

		setSize(500,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public  static void main(String[] args){
		new ProgressBarTest();
		
	}

}
