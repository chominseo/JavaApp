package chapter2.ex2.파일다루기;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program1FileSave {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("D:\\java\\workspace\\pic1.bmp");//직접치지말고 ctrl+스페이스
		FileOutputStream fos = new FileOutputStream("D:\\java\\workspace\\pic1_복사.bmp");
		
		
		
		
		
		byte [] buf = new byte[1024];
		
		int size;
		while((size=fis.read(buf))!=-1)
			fos.write(buf, 0, size);
		
		/*while(true) {
			b=fis.read();
			if(b==-1)
				break;
			fos.write(b);
			}
		
		for(b=fis.read(); b!=-1; b=fis.read())
			fos.write(b);
	
		while(b!=-1) {
			b=fis.read();
			fos.write(b);
			}
		*/
		
		fos.close();
		fis.close();
		
		System.out.println("복사완료");

	}

}
