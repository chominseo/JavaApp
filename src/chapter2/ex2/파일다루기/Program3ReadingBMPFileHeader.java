package chapter2.ex2.���ϴٷ��;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Program3ReadingBMPFileHeader {

	public static void main(String[] args) throws IOException {
		
		//2.������ ���̳ʸ��� �ؽ�Ʈ�� �����غ���
		
		FileInputStream fis = new FileInputStream("D:\\java\\workspace\\pic1.bmp");
		
		final int BFH = 14;
		final int BIH = 40;
		
		byte [] fileBuffer = new byte[BFH];
		byte [] infoBuffer = new byte[BIH];
		
		fis.read(fileBuffer);
		fis.read(infoBuffer);
		
		int width = ((int)infoBuffer[4]&0xff)|
				    ((int)infoBuffer[5]&0xff)<<8|
				   	((int)infoBuffer[6]&0xff)<<16|
				   	((int)infoBuffer[7]&0xff)<<24;
		
		//int x =123;
		
		//fos.write();
		//fos.write('\n');
		//fos.write('\r');
		
		//PrintStream fout = new PrintStream(fos);
		//fout.print(x);\
		
		System.out.println(width);
		fis.close();
		
		System.out.println("����Ϸ�");

	}

}
