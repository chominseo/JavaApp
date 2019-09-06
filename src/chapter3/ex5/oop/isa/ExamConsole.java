package chapter3.ex5.oop.isa;

import java.util.Scanner;

public class ExamConsole {
	private ExamList list;

	public ExamConsole() {
		list = new ExamList();
	}
	
	//����ڷκ��� �Է¹���.input()
	//������ ��Ͽ� �߰��ϴ� �Լ� : add();
	
	public void input() {
		int count = list.getCurrent();
		
		Scanner scan = new Scanner(System.in);
		//int count = this.current;
		//Exam[] list = this.list;

		System.out.println("����������������������������������������������������������");
		System.out.println("��           ���� �Է�           ��");
		System.out.println("����������������������������������������������������������");
		System.out.println();

		int kor, eng, math;

		do {
			System.out.printf("����%d : ", count + 1);
			kor = scan.nextInt();

			if (kor < 0 || 100 < kor)
				System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");

		} while (kor < 0 || 100 < kor);

		do {
			System.out.printf("����%d : ", count + 1);
			eng = scan.nextInt();

			if (eng < 0 || 100 < eng)
				System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");

		} while (eng < 0 || 100 < eng);

		do {
			System.out.printf("����%d : ", count + 1);
			math = scan.nextInt();

			if (math < 0 || 100 < math)
				System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");

		} while (math < 0 || 100 < math);
		
		Exam exam = new Exam(kor, eng, math);
		
		//add ���
		
		
		list.add(exam);
		
		//this.current = count;
		//this.list = list;
		// scan.close();

	}

	public void print() {
		
		int size = list.size();

		System.out.println("����������������������������������������������������������");
		System.out.println("��           ���� ���           ��");
		System.out.println("����������������������������������������������������������");
		System.out.println();

		for (int i = 0; i < size; i++) {
			//get()
			Exam exam = list.get(i);

			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();

			int total = exam.total();// kor + eng + math;
			float avg = exam.avg(); // 3.0f;

			// for(int j=0;j<current;j++)
			System.out.printf("%d, kor:%d, eng:%d, math:%d, total:%d, avg:%.2f\n", i + 1, kor, eng, math, total, avg);

			// System.out.printf("���� : %3d\n", total);
			// System.out.printf("��� : %6.2f\n", avg);
		}
		System.out.println("����������������������������������������������������������");

	}

}
