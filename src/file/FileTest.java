/*
 * �ڹٿ����� ���丮�� �����ϱ� ���� Ŭ������ ������ �������� �ʴ´�.
 * ���丮�� ���Ϸ� �����Ѵ�.
 * ���: java.io.File Ŭ������ ���� +���丮���� ó���Ѵ�..
 * 
 */
package file;

import java.io.File;

public class FileTest {
	public static void main(String[] args){
		//C����̺��� ������ �����ϴ� ���
		//���α׷� �� ������ ����غ���
		File file=new File("c:/");
		//���� ���丮 �� ������ ���
		File[] dir=file.listFiles();
		for(int i=0; i<dir.length; i++){
			if(dir[i].isDirectory()==true){
			System.out.println(dir[i].getName());
			}
		}
		
		
		
	}

}
