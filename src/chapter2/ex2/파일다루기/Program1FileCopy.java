package chapter2.ex2.���ϴٷ��;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Program1FileCopy {

	public static void main(String[] args) throws IOException {
		
		//2.������ ���̳ʸ��� �ؽ�Ʈ�� �����غ���
		
		FileOutputStream fos = new FileOutputStream("D:\\java\\workspace\\file_save.txt");
		
		int x =123;
		
		fos.write();
		//fos.write('\n');
		//fos.write('\r');
		
		//PrintStream fout = new PrintStream(fos);
		//fout.print(x);
		
		fos.close();
		
		System.out.println("����Ϸ�");

	}

}
