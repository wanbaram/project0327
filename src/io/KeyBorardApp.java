/*
FileInputStream ���� �����ڰ� ���ϴ� ������ ��Ʈ���� ������ �� ������, Ű�����
���� ǥ�� �Է� �ϵ������ ��쿣 �ڹٰ� ��Ʈ���� �������� ���ϰ� �ش� OS�� �����ϹǷ�, 
�ڹ� �����ڴ� OS�� ���� ǥ���Է� ��Ʈ���� ���;� �Ѵ�..
�ڹ� Ŭ���� �� System Ŭ������ static ������� �� �� has a ����� ������ 
InputStream��  in ��ü�� �ٷ� ǥ���Է� ��Ʈ���� �޾Ƴ��� Ŭ�����̴�.
���� ���ÿ� �׳� System.in;
���ڱ�� ��Ʈ�� Ŭ������ �̸� ��Ģ
�Է�: ~~Reader 
���: ~~Writer
*/
package io;
import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;
class KeyBorardApp{
	public static void main(String[] args){
		InputStream is=System.in;
		//���ڱ�� ��Ʈ���� �ܵ����� �����ϴ°���
		//�ƴ϶�, �̹� ����Ʈ ��� ��Ʈ���� ������
		//�Ѵ�. ���� ������ �������� �μ���
		//����Ʈ ��� ��Ʈ���� �ִ´�..
		InputStreamReader reader=null;
		reader=new InputStreamReader(is);
	
		int data;
		try{
			while(true){
				data=reader.read();
				System.out.print((char)data);
			}

		}catch(IOException e){
		}
	}

}
