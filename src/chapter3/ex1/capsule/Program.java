package chapter3.ex1.capsule;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		int[] kors = new int[3];

		int kor1, kor2, kor3;
		int total=0;
		float avg;
		int menu;

		kor1 = 0;
		kor2 = 0;
		kor3 = 0;

		kors[0] = 0;
		kors[1] = 0;
		kors[2] = 0;

		for (int i = 0; i < 3; i++)
			kors[i] = 0;

		Scanner scan = new Scanner(System.in);

		�󺧺�: while (true) {
			System.out.println("����������������������������������������������������������");
			System.out.println("��           ���� �޴�                   ��");
			System.out.println("����������������������������������������������������������");
			System.out.println("\t1. �����Է� ");
			System.out.println("\t2. ������� ");
			System.out.println("\t3. ���� ");
			System.out.println("\t����> ");
			menu = scan.nextInt();

			switch (menu) {
			case 1:

				System.out.println("����������������������������������������������������������");
				System.out.println("��          ����  �Է�                    ��");
				System.out.println("����������������������������������������������������������");
				System.out.println();

				for (int i = 0; i < 3; i++)
					total = total + kors[i];

				avg = total / 3;

				System.out.println("����������������������������������������������������������");
				System.out.println("��           ����  ���                   ��");
				System.out.println("����������������������������������������������������������");
				System.out.println();

				for (int i = 0; i < 3; i++)
					System.out.printf("���� %d : %3d\n", 3 - i, kors[i]);

				System.out.printf("���� : %3d\n", total);
				System.out.printf("��� : %6.2f\n", avg);
				System.out.println("����������������������������������������������������������");

				break;
			case 3:
				System.out.println("Bye~~");
				break �󺧺�;

			default:
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�. �޴��� 1~3�����Դϴ�.");

			}

		}

	}
}