/*
 * OS�� ���� ���μ��� ���ÿ� ����ϴ� ���� ��Ƽ �׽�ŷ�̶��Ѵ�. �̿Ͱ���
 * �ϳ��� �ڹ����α׷� ������ ������ ��������� ����� ���ÿ� �����ų �� �ִ�. �̷��� ������ ���������
 * ��������Ѵ�.
 * �ڹٴ� �����ڰ� �������� �ʾƵ� �̹� �⺻������ �����Ǵ� ����� �����尡 ������ �̷��� �����带 ������
 * ���ξ�������Ѵ�. 
 */
package thread;

public class ThreadTest {
	//���ξ����� ����, �����ڰ� ���ϴ�
	//����� ����; ������ �ϳ� ���� ���ϴ� 
	//���� �۾��� ���Ѻ���
	MyThread thread;
	public ThreadTest() {
		//���ξ�����ʹ� ���������� ����� �� 
		//�ִ� ���� ��������� ������
		//�����尡 � ���� ������ �����ڰ�
		//�����ؾ� �ϱ� ������....
		thread= new MyThread();
		thread.start();
		//thread.run()--> ������ thread�� �����ϴ� ���� �ƴ϶� main�� ���� ������
		while(true){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("��");
		}
		
	}
	public static void main(String[] args){
		new ThreadTest();
	}

}
