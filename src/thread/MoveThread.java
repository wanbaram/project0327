//������ ������ ��� �� ������!!
package thread;
public class MoveThread extends Thread{
	//�����ڴ� ���������� �ڵ带 run�� ����
	//JVM�� run�� �˾Ƽ� ȣ�����ش�!!
	Animain aniMain;
	public MoveThread(Animain aniMain) {
		this.aniMain= aniMain;
	}
	public void run() {
		while(true){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			aniMain.move();
		}
		
	}
}
