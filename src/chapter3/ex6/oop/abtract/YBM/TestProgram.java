package chapter3.ex6.oop.abtract.YBM;

import chapter3.ex6.oop.abtract.ExamConsole;

public class TestProgram {
	public static void main(String[]args) {
		
		ExamConsole console = new YBMExamConsole();
		while(true) {
		console.input();
		console.print();
		}
		/*
		Exam exam = new YBMExam();
		 
		
		exam.total();
		exam.avg();
		*/
	}

}
