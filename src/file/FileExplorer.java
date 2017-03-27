package file;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FileExplorer extends JFrame{
	boolean flag=true;
	int i=0;
	JButton[] bt_array;
	public FileExplorer() {
		File file=new File("C:/");
		File[] dir=file.listFiles();
		ImageIcon icon= new ImageIcon("C:/java_workspace2/project0327/res/folder_on.png");
		ImageIcon icon2= new ImageIcon("C:/java_workspace2/project0327/res/folder_off.png");
		setLayout(new FlowLayout());
		for(i=0; i<dir.length; i++){
			if(dir[i].isDirectory()==true){
				JPanel p=new JPanel();
				Label lb=new Label(dir[i].getName());
				bt_array[i]= new JButton(icon);
				bt_array[i].setBorderPainted(false);
				bt_array[i].setContentAreaFilled(false);
				bt_array[i].setFocusPainted(false);
				bt_array[i].setOpaque(false);
				//System.out.println(dir[i].getName());
				p.add(bt_array[i],BorderLayout.NORTH);
				p.add(lb,BorderLayout.WEST);
				add(p);
			}
			bt_array[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(flag==true){
						for (int j=0; j<dir.length; j++){
							if(i==j){
								bt_array[i].setIcon(icon2);
							}else{
								bt_array[i].setIcon(icon);
							}
						}
						flag=false;
					}else if(flag==false){
						bt_array[i].setIcon(icon);
						flag=true;
					}
				}
			});
		}
		setVisible(true);
		setSize(600,700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new FileExplorer();	
	}

}
