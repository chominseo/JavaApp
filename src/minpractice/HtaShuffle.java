package minpractice;

import java.util.Random;
import java.util.Scanner;

public class HtaShuffle {

	public static void main(String[] args) {
		String[] name = { "����", "����", "����", "����", "����", "�μ�", "����", "����", "�Լ�", "����", "����" };

		Random rand = new Random();
		

		while (true) {
			for (int i = 0; i < name.length; i++) {

				int left = rand.nextInt(11);
				int right = rand.nextInt(11);

				String temp = name[left];
				name[left] = name[right];
				name[right] = temp;

			}
			int a = 1;
			for (int i = 0; i < name.length; i++) {
				if (i % 4 == 0) {
					System.out.println();
					System.out.printf("%d�� ", a++);
				}

				System.out.printf("%s ", name[i]);
			}
			System.out.println();
			System.out.println("�ٽû����ðڽ��ϱ�? 1.Y 2.N");
			System.out.print(">");
			Scanner scan = new Scanner(System.in);
			int menu = scan.nextInt();
			
			switch(menu) {
			case 1 :
				break;
				
				
			case 2 :
				System.out.println("��");
				return;
				
			}
		}

	}

}
