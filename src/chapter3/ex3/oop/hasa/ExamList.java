package chapter3.ex3.oop.hasa;

import java.util.Scanner;

	/*
	��ü�� ���� ����
	��ü�� ��ü�� ������ ���
	�ϸ� ���κο� ���
	
	ĸ��ȭ
	*/

public class ExamList {
	Exam [] list;
	int current;
	//public static void initExamList(ExamList exams) {
	public ExamList() {
		this.current = 0;
		this.list = new Exam[3];
		System.out.println("��ȣ~~");
	}
	/*
	public void reset() {
		this.current = 0;
		this.list = new Exam[3];
	}
	
	public static void init(ExamList exams) {//�������� �Լ� static
		exams.current = 0;
		exams.list = new Exam[3];
	}
	*/
	//public static void printExamList(ExamList exams) {
	//public static void inputExamList(ExamList exams) {
	public void input() {
		Scanner scan = new Scanner(System.in);
		int count = this.current;
		Exam[] list = this.list;
		
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
		/*
		Exam exam = list[count];
		
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
		*/
		Exam exam = new Exam(kor,eng,math);
		
		list[count] = exam;
		count++;
		this.current = count;
		this.list = list;
		// scan.close();
		
	}
	public void print() {
		int count = this.current;
		Exam[] list = this.list;
		

		System.out.println("����������������������������������������������������������");
		System.out.println("��           ���� ���           ��");
		System.out.println("����������������������������������������������������������");
		System.out.println();

		for (int i = 0; i < count; i++) {

			Exam exam = list[i];
			
			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();

			int total = exam.total();//kor + eng + math;
			float avg = exam.avg(); // 3.0f;

			// for(int j=0;j<current;j++)
			System.out.printf("%d, kor:%d, eng:%d, math:%d, total:%d, avg:%.2f\n", i + 1, kor, eng, math, total, avg);

			// System.out.printf("���� : %3d\n", total);
			// System.out.printf("��� : %6.2f\n", avg);
		}
		System.out.println("����������������������������������������������������������");

	}



}
