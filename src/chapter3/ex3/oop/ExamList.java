package chapter3.ex3.oop;

import java.util.Scanner;

public class ExamList {
	Exam [] list;
	int current;
	//public static void initExamList(ExamList exams) {
	public ExamList() {
		this.current = 0;
		this.list = new Exam[3];
		System.out.println("얏호~~");
	}
	/*
	public void reset() {
		this.current = 0;
		this.list = new Exam[3];
	}
	
	public static void init(ExamList exams) {//고전적인 함수 static
		exams.current = 0;
		exams.list = new Exam[3];
	}
	*/
	//public static void printExamList(ExamList exams) {
	public void print() {
		int count = this.current;
		Exam[] list = this.list;

		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적 출력           │");
		System.out.println("└───────────────────────────┘");
		System.out.println();

		for (int i = 0; i < count; i++) {

			int kor = list[i].kor;
			int eng = list[i].eng;
			int math = list[i].math;

			int total = kor + eng + math;
			float avg = total / 3.0f;

			// for(int j=0;j<current;j++)
			System.out.printf("%d, kor:%d, eng:%d, math:%d, total:%d, avg:%.2f\n", i + 1, kor, eng, math, total, avg);

			// System.out.printf("총점 : %3d\n", total);
			// System.out.printf("평균 : %6.2f\n", avg);
		}
		System.out.println("─────────────────────────────");

	}

	//public static void inputExamList(ExamList exams) {
	 public void input() {
		Scanner scan = new Scanner(System.in);
		int count = this.current;
		Exam[] list = this.list;

		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적 입력           │");
		System.out.println("└───────────────────────────┘");
		System.out.println();

		int kor, eng, math;

		do {
			System.out.printf("국어%d : ", count + 1);
			kor = scan.nextInt();

			if (kor < 0 || 100 < kor)
				System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (kor < 0 || 100 < kor);

		do {
			System.out.printf("영어%d : ", count + 1);
			eng = scan.nextInt();

			if (eng < 0 || 100 < eng)
				System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (eng < 0 || 100 < eng);

		do {
			System.out.printf("수학%d : ", count + 1);
			math = scan.nextInt();

			if (math < 0 || 100 < math)
				System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (math < 0 || 100 < math);

		list[count] = new Exam();
		list[count].kor = kor;
		list[count].eng = eng;
		list[count].math = math;
		count++;
		this.current = count;
		this.list = list;
		// scan.close();

	}


}
