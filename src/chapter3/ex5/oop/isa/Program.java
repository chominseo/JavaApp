package chapter3.ex5.oop.isa;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		//���:�����޴�>>��ǰ���� �����޴�>>�ٸ���ü�� �ɷ¤�
		
	    ExamConsole console = new ExamConsole();
		
	    end: while (true) {

			int menu = inputMenu();

			switch (menu) {
			case 1:

				console.input();
				break;

			case 2:

				console.print();
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
