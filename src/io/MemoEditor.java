package io;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MemoEditor extends JFrame{
	JPanel p_north;
	JButton bt_open, bt_save;
	JTextArea area;
	JScrollPane scroll;
	
	String ori="C:/java_workspace2/project0327/res/Memo.txt";//원본
	String dest="C:/java_workspace2/project0327/res/Memo_copy.txt";//다른파일의 저장경로
	
	FileInputStream fis;
	FileOutputStream fos;
	InputStreamReader reader;//문자기반 입력스트림
	BufferedReader buffer;//버퍼처리된 문자기반 입력스트림
	OutputStreamWriter writer;
	PrintWriter writer2;
	ImageIcon icon;
	
	public MemoEditor() {
		icon= new ImageIcon("C:/java_workspace2/project0327/res/folder_off.png");
		p_north=new JPanel();
		bt_save=new JButton("저장");
		bt_open=new JButton(icon);
		area= new JTextArea();
		scroll= new JScrollPane(area);
	
		bt_open.setBorderPainted(false);
		bt_open.setContentAreaFilled(false);
		bt_open.setFocusPainted(false);
		bt_open.setOpaque(false);
		
		p_north.add(bt_open);
		p_north.add(bt_save);
		
		add(p_north,BorderLayout.NORTH);
		add(scroll);
		
		//버튼 2개 내부입력으로 가자~!
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
		
		setSize(700,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
				
	}
	//열기
	public void open(){
		try{
			fis= new FileInputStream(ori);
			//문자기반 스트림에는 문자인코딩 속성을 지정 할 수 있다.
			reader= new InputStreamReader(fis,"utf-8");
			buffer=new BufferedReader(reader);
			
		
			
			String data;
			int count=0;//read 횟수를 알기 위해 
			while(true){
				data=buffer.readLine();//2byte 읽어드린다
				count++;
				if(data==null)break;
				area.append(data+"\n");
			}
			System.out.println(count);
		}catch(FileNotFoundException e){
			JOptionPane.showMessageDialog(this,"파일을 찾을 수 없습니다");
			//e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//저장하기
	public void save(){
		try{
			fos= new FileOutputStream(dest);
			//writer= new OutputStreamWriter(fos, "utf-8");
			writer2=new PrintWriter(fos);
			writer2.write(area.getText());
		}catch(FileNotFoundException e){
			e.printStackTrace();
		//}catch(UnsupportedEncodingException e){
			//e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(writer2 !=null){
				writer2.close();
			}
			if(fos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			
		}
	}
	public static void main(String[] args) {
		new MemoEditor();
	}

}
