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
			System.out.printf("토익%d : ", num + 1);
			toeic = scan.nextInt();

			if (toeic < 0 || 100 < toeic)
				System.out.println("토익성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (toeic < 0 || 100 < toeic);
		
		ybmExam.setToeic(toeic);
		
	}

	@Override
	protected void onPrint(Exam exam, int i) {
		
		YBMExam ybmExam = (YBMExam)exam;
		
		System.out.printf("toeic:%d, ",ybmExam.getToeic());
		
	}

		
	

	

}
