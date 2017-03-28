package homework3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class FileCopyBar extends JFrame{
	JProgressBar bar;
	JButton bt_open,bt_save,bt_copy;
	JPanel p_north, p_center,p_south;
	JTextField t_perc, t_open,t_save;
	JFileChooser chooser;
	FileInputStream fis;
	FileOutputStream fos;
	File file;
	int count=0;
	long filelength;
	public FileCopyBar() {
		bar= new JProgressBar();
		bar.setPreferredSize(new Dimension(500, 40));
		bt_open=new JButton("열기");
		bt_save=new JButton("저장");
		bt_copy=new JButton("복사하기");
		t_perc=new JTextField(3);
		t_open=new JTextField(20);
		t_save=new JTextField(20);
		p_north=new JPanel();
		p_south=new JPanel();
		p_center=new JPanel();
		p_north.add(bar);
		p_north.add(t_perc);
		p_center.add(bt_open);
		p_center.add(t_open);
		p_south.add(bt_save);
		p_south.add(t_save);
		p_south.add(bt_copy);
		chooser = new JFileChooser("C:/java_workspace2/project0323");
		add(p_north,BorderLayout.NORTH);
		add(p_center,BorderLayout.CENTER);
		add(p_south,BorderLayout.SOUTH);
		bt_open.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				open();
			}
		});
		bt_save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				save();
			}
		});
		bt_copy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				copy();
			}
		});
		
		setSize(700, 160);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	public void open() {
		int state=chooser.showOpenDialog(this);
		if(state==JFileChooser.APPROVE_OPTION){
			file=chooser.getSelectedFile();
			String path=file.getAbsolutePath();
			t_open.setText(path);
		}
	}
	public void save(){
		chooser.showSaveDialog(this);
		File openPath=chooser.getSelectedFile();
		String openPath2=openPath.getAbsolutePath();
		t_save.setText(openPath2);
	}
	public void copy() {
		String oriPath=t_open.getText();
		String destPath=t_save.getText();
		try {
			fis=new FileInputStream(oriPath);
			fos=new FileOutputStream(destPath);
			int data;
			while(true){
				count++;
				data=fis.read();
				Mybar mb=new Mybar(bar,count);
				if(data==-1)break;
				fos.write(data);
				
			}
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
					// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
				try {
					if(fis!=null)fis.close();
					if(fos!=null)fos.close();
					perc();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
	public void perc(){
		filelength=file.length();
		long perc=count/filelength*100;
		t_perc.setText(Long.toString(perc)+"%");
		
	}
	public static void main(String[] args) {
		new FileCopyBar();
		

	}

}
