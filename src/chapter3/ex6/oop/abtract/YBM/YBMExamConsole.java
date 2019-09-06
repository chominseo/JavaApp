package chapter3.ex6.oop.abtract.YBM;

import java.util.Scanner;

import chapter3.ex6.oop.abtract.Exam;
import chapter3.ex6.oop.abtract.ExamConsole;

public class YBMExamConsole extends ExamConsole{

	@Override
	protected Exam newExam() {
		return new YBMExam();
	}

	@Override
	protected void onInput(Exam exam, int num) {
		
		int toeic;
		YBMExam ybmExam = (YBMExam)exam;
		
		Scanner scan = new Scanner(System.in);
		do {
			System.out.printf("����%d : ", num + 1);
			toeic = scan.nextInt();

			if (toeic < 0 || 100 < toeic)
				System.out.println("���ͼ����� 0~100������ ������ �Է��� �����մϴ�.");

		} while (toeic < 0 || 100 < toeic);
		
		ybmExam.setToeic(toeic);
		
	}

	@Override
	protected void onPrint(Exam exam, int i) {
		
		YBMExam ybmExam = (YBMExam)exam;
		
		System.out.printf("toeic:%d, ",ybmExam.getToeic());
		
	}

		
	

	

}
