//�г��� �󺧰� ��ư�� ������ �ִ�
//JPanel has a label & JButton
package file;

import java.awt.BorderLayout;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel  extends JPanel{
	JButton bt;
	JLabel la;
	//�г��� �¾ �� �� ��ǰ�� �¾�� �ϹǷ� �����ڿ��� �ʱ�ȭ����!
	public MyPanel(String title,Icon icon) {
		la =new JLabel(title);
		bt =new JButton(icon);
		bt.setBorderPainted(false);//��輱 ���ֱ� 
		bt.setContentAreaFilled(false);//�� ü��� ����
		bt.setFocusPainted(false);//��Ŀ���� ���� 
		bt.setOpaque(false);//����
		this.setLayout(new BorderLayout());
		add(la, BorderLayout.NORTH);
		add(bt);
	
	}
}
