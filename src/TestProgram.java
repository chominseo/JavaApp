
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestProgram {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("D:\\java\\workspace\\TestProgram.txt");
		
		PrintStream fout = new PrintStream(fos);
		
		int kor1, kor2, kor3,total;
		
		float avg;

		kor1 = 100;
		kor2 = 70;
		kor3 = 95;

		total = kor1 + kor2 + kor3;
		avg = total / 3;
		
		fout.println("��������������������������������������������������������������������������������������");
		fout.println("��                 �������                                    ��");
		fout.println("��������������������������������������������������������������������������������������");
		fout.println("");
		fout.printf("����1 : %3d\n", kor1);
		fout.printf("����2 : %3d\n", kor2);
		fout.printf("����3 : %3d\n", kor3);
		fout.println("");
		fout.printf("���� : %3d\n", total);
		fout.printf("��� : %3.2f\n", avg);
		fout.println("��������������������������������������������������������������������������������������");
		
		
		//fout.write('A');
		fout.close();
		fos.close();
	
		System.out.println("�۾��Ϸ�");
		
	}

}
