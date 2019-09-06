package chapter3.ex1.capsule;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {

		/*
		 * current ������ ������ �� �ֵ��� ExamList ������ �����ؼ� �ڵ带 �ٽ� �ۼ��Ѵ�.
		 */

		ExamList exams = new ExamList();
		exams.current = 0;
		exams.list = new Exam[3];

		end: while (true) {

			int menu = inputMenu();

			switch (menu) {
			case 1:

				inputExamList(exams);
				break;

			case 2:

				printExamList(exams);
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

	private static void printExamList(ExamList exams) {

		int current = exams.current;
		Exam[] list = exams.list;

		System.out.println("����������������������������������������������������������");
		System.out.println("��           ���� ���           ��");
		System.out.println("����������������������������������������������������������");
		System.out.println();

		for (int i = 0; i < current; i++) {

			int kor = list[i].kor;
			int eng = list[i].eng;
			int math = list[i].math;

			int total = kor + eng + math;
			float avg = total / 3.0f;

			// for(int j=0;j<current;j++)
			System.out.printf("%d, kor:%d, eng:%d, math:%d, total:%d, avg:%.2f\n", i + 1, kor, eng, math, total, avg);

			// System.out.printf("���� : %3d\n", total);
			// System.out.printf("��� : %6.2f\n", avg);
		}
		System.out.println("����������������������������������������������������������");

	}

	private static void inputExamList(ExamList exams) {
		Scanner scan = new Scanner(System.in);
		int current = exams.current;
		Exam[] list = exams.list;

		System.out.println("����������������������������������������������������������");
		System.out.println("��           ���� �Է�           ��");
		System.out.println("����������������������������������������������������������");
		System.out.println();

		int kor, eng, math;

		do {
			System.out.printf("����%d : ", current + 1);
			kor = scan.nextInt();

			if (kor < 0 || 100 < kor)
				System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");

		} while (kor < 0 || 100 < kor);

		do {
			System.out.printf("����%d : ", current + 1);
			eng = scan.nextInt();

			if (eng < 0 || 100 < eng)
				System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");

		} while (eng < 0 || 100 < eng);

		do {
			System.out.printf("����%d : ", current + 1);
			math = scan.nextInt();

			if (math < 0 || 100 < math)
				System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");

		} while (math < 0 || 100 < math);

		list[current] = new Exam();
		list[current].kor = kor;
		list[current].eng = eng;
		list[current].math = math;
		current++;
		exams.current = current;
		exams.list = list;
		// scan.close();

	}

}
