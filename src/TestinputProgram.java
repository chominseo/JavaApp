import java.io.IOException;
import java.util.Scanner;

public class TestinputProgram {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		int kor;
		System.out.print("kor:");
		kor = scan.nextInt();
		
		System.out.printf("kor=%d\n", kor);
		
		kor = scan.nextInt();
		
		System.out.printf("kor=%d\n", kor);
		
		/*
		System.out.print("kor:");
		int a = System.in.read();
		
		System.out.println(a);
		System.out.write(a);
		System.out.flush();
		
		System.out.println();
		//-----------------------------------------------------
		
		a = System.in.read();
		
		System.out.println(a);
		System.out.write(a);
		System.out.flush();
		
		System.out.println();
		//-----------------------------------------------------
		
		a = System.in.read();
		
		System.out.println(a);
		System.out.write(a);
		System.out.flush();
		*/

	}

}
