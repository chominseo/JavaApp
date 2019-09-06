package chapter2.ex3.cutting;

import java.io.File;

public class ExplorerProgram {
	public static void main(String[] args) {
		
		File file = new File("D:\\java\\workspace");
		
		File[]files=file.listFiles();
		
		for(int i=0;i<files.length;i++)
			System.out.printf("%s:%s\n",files[i].isDirectory(),files[i].getName());
		
		/*
		String[]fileNames=file.list();
		
		for(int i=0;i<fileNames.length;i++)
			System.out.println(fileNames[i]);
			*/
	}

}
