package chapter3.ex1.capsule;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {

		/*
		 * current 변수를 공유할 수 있도록 ExamList 형식을 정의해서 코드를 다시 작성한다.
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
				System.out.println("잘못된 값을 입력하셨습니다. 메뉴는 1~3까지입니다.");
			}
		}

	}

	private static int inputMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           메인 메뉴           │");
		System.out.println("└───────────────────────────┘");
		System.out.println("\t1. 성적입력 ");
		System.out.println("\t2. 성적출력 ");
		System.out.println("\t3. 종료 ");
		System.out.println("\t선택> ");
		int menu = scan.nextInt();
		// scan.close();
		return menu;

	}

	private static void printExamList(ExamList exams) {

		int current = exams.current;
		Exam[] list = exams.list;

		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적 출력           │");
		System.out.println("└───────────────────────────┘");
		System.out.println();

		for (int i = 0; i < current; i++) {

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

	private static void inputExamList(ExamList exams) {
		Scanner scan = new Scanner(System.in);
		int current = exams.current;
		Exam[] list = exams.list;

		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적 입력           │");
		System.out.println("└───────────────────────────┘");
		System.out.println();

		int kor, eng, math;

		do {
			System.out.printf("국어%d : ", current + 1);
			kor = scan.nextInt();

			if (kor < 0 || 100 < kor)
				System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (kor < 0 || 100 < kor);

		do {
			System.out.printf("영어%d : ", current + 1);
			eng = scan.nextInt();

			if (eng < 0 || 100 < eng)
				System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (eng < 0 || 100 < eng);

		do {
			System.out.printf("수학%d : ", current + 1);
			math = scan.nextInt();

			if (math < 0 || 100 < math)
				System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");

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
