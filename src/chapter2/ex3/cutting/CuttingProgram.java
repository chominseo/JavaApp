package chapter2.ex3.cutting;

public class CuttingProgram {

	public static void main(String[] args) {

		// String[]names=new String[] {};
		// String[]names= {"","","","","",""};
		
		  String name1 = "ȫ�浿"; String name2 = "ȫ�浿"; String name3 = new String("ȫ�浿");
		  
		  System.out.println(name1 == name2); System.out.println(name1 == name3);
		  System.out.println(name1.equals(name3));
		  
		  String fileName = "pho.to.jpg"; System.out.println(fileName.length());
		  System.out.println(fileName.indexOf("."));
		  System.out.println(fileName.substring(0,3));
		  System.out.println(fileName.substring(0,fileName.indexOf(".")));
		  System.out.println(fileName.lastIndexOf("."));
		  System.out.println(fileName.substring(fileName.lastIndexOf(".")+1));
		  System.out.println(fileName.substring(fileName.indexOf(".")+1));
		  
		  String data = "ȫ�浿,��ȣ��,�̽±�,���缮,������"; String[]names = data.split(",");
		  
		  System.out.println(names[1]);
		  
		  System.out.println(names.length);
		  
		 for(int i=0;i<names.length;i++) System.out.print(names[i]);
		 

	}

}
