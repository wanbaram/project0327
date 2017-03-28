/*
 * 클래스는 코드의 재사용 떄문에 나온 기술이다.
 */
package file;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JFrame;

public class FileWindow extends JFrame{
	MyIcon folder_on,folder_off;
	boolean flag=true;
	
	public FileWindow() {
		folder_on=new MyIcon(this.getClass().getResource("/folder_on.png"),50,50);
		folder_off=new MyIcon(this.getClass().getResource("/folder_off.png"),50,50);
		//크기를 조정한후 결과적으로 이미지 객체를 반환 받자
		setLayout(new FlowLayout());
		//이미지 아이콘을 생성하되, 리소스 폴더로부터
		//Uniformed Resource Locator
		//제대로 붙을지 테스트
		ArrayList<String> list=getDirList();
		for(int i=0; i<list.size(); i++){
			String dirName=list.get(i);
			MyPanel mp=new MyPanel(dirName,folder_on);
			add(mp);
			mp.bt.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(flag){
						mp.bt.setIcon(folder_off);
						flag=false;
					}else{
						mp.bt.setIcon(folder_on);
						flag=true;
					}
				}
			});
		}
	
		setSize(600,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public ArrayList getDirList(){
		File file= new File("c:/");
		File[] fileList=file.listFiles();
		ArrayList<String> dirList=new ArrayList<String>();
		//디렉토리만 골라내자!!
		for(int i=0; i<fileList.length;i++){
			if(fileList[i].isDirectory()){
				//디렉토리가 발견될 때마다 리스트 추가
				dirList.add(fileList[i].getName());
			}
		}
		return dirList;
	}
	public static void main(String[] args) {
		new FileWindow();
		

	}

}
