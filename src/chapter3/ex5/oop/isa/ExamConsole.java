package chapter3.ex5.oop.isa;

import java.util.Scanner;

public class ExamConsole {
	private ExamList list;

	public ExamConsole() {
		list = new ExamList();
	}
	
	//사용자로부터 입력받은.input()
	//성적을 목록에 추가하는 함수 : add();
	
	public void input() {
		int count = list.getCurrent();
		
		Scanner scan = new Scanner(System.in);
		//int count = this.current;
		//Exam[] list = this.list;

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
		
		Exam exam = new Exam(kor, eng, math);
		
		//add 기능
		
		
		list.add(exam);
		
		//this.current = count;
		//this.list = list;
		// scan.close();

	}

	public void print() {
		
		int size = list.size();

		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적 출력           │");
		System.out.println("└───────────────────────────┘");
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

			// System.out.printf("총점 : %3d\n", total);
			// System.out.printf("평균 : %6.2f\n", avg);
		}
		System.out.println("─────────────────────────────");

	}

}
