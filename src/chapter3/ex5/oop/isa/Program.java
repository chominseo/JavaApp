package chapter3.ex5.oop.isa;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		//상속:물려받다>>부품한테 물려받다>>다른객체의 능력ㅇ
		
	    ExamConsole console = new ExamConsole();
		
	    end: while (true) {

			int menu = inputMenu();

			switch (menu) {
			case 1:

				console.input();
				break;

			case 2:

				console.print();
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
