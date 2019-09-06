package chapter3.ex2.capsule;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {

		/*
		 * current 변수를 공유할 수 있도록 ExamList 형식을 정의해서 코드를 다시 작성한다.
		 */

		ExamList exams = new ExamList();
	    ExamList.init(exams);
		
	    end: while (true) {

			int menu = inputMenu();

			switch (menu) {
			case 1:

				ExamList.input(exams);
				break;

			case 2:

				ExamList.print(exams);
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

	
}
