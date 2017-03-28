//패널이 라벨과 버튼을 가지고 있다
//JPanel has a label & JButton
package file;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel  extends JPanel{
	JButton bt;
	JLabel la;
	//패널이 태어날 때 그 부품도 태어나야 하므로 생성자에서 초기화하자!
	public MyPanel(String title,Icon icon) {
		la =new JLabel(title);
		bt =new JButton(icon);
		bt.setBorderPainted(false);//경계선 없애기 
		bt.setContentAreaFilled(false);//색 체우기 없음
		bt.setFocusPainted(false);//포커스에 의한 
		bt.setOpaque(false);//투명
		this.setLayout(new BorderLayout());
		add(la, BorderLayout.NORTH);
		add(bt);
	
	}
}
