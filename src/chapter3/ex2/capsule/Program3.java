package chapter3.ex2.capsule;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {

		/*
		 * current ������ ������ �� �ֵ��� ExamList ������ �����ؼ� �ڵ带 �ٽ� �ۼ��Ѵ�.
		 */

		ExamList exams = new ExamList();
	    ExamList.init(exams);
		
	    end: while (true) {

			int menu = inputMenu();

			switch (menu) {
			case 1:

				ExamList.input(exams);
				break;

			case 2:

				ExamList.print(exams);
				break;

			case 3:

				System.out.println("Bye~~");
				break end;

			default:
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�. �޴��� 1~3�����Դϴ�.");
			}
		}

	}

	private static int inputMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("����������������������������������������������������������");
		System.out.println("��           ���� �޴�           ��");
		System.out.println("����������������������������������������������������������");
		System.out.println("\t1. �����Է� ");
		System.out.println("\t2. ������� ");
		System.out.println("\t3. ���� ");
		System.out.println("\t����> ");
		int menu = scan.nextInt();
		// scan.close();
		return menu;

	}

	
}
