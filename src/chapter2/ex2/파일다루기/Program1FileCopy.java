package chapter2.ex2.파일다루기;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Program1FileCopy {

	public static void main(String[] args) throws IOException {
		
		//2.파일을 바이너리와 텍스트로 저장해보기
		
		FileOutputStream fos = new FileOutputStream("D:\\java\\workspace\\file_save.txt");
		
		int x =123;
		
		fos.write();
		//fos.write('\n');
		//fos.write('\r');
		
		//PrintStream fout = new PrintStream(fos);
		//fout.print(x);
		
		fos.close();
		
		System.out.println("저장완료");

	}

}
