/*
 *���� �����ϰ� ���� �ڵ�� ������ �ؾ��Ѵ�
 */
package thread;

public class MyThread extends Thread{
	/*
	 * �����ڴ� ���������� �����ϰ� ���� �ڵ带 �������� run�޼��� �ȿ� �ۼ��ϸ� �ȴ�
	 */

	public void run() {
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//1�� ���ٿ�
			System.out.println("��");
		}
		

	}
}
