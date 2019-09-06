package chapter2.ex3.cutting;

import java.util.Scanner;

public class ShuffleProgram {
	static int[] classIds = new int[100];
	static String[] classNames = new String[100];
	static int[] classCapacitys = new int[100];
	static int[] groupCountOfClasses = new int[100];
	static String[][] names = new String[100][];

	static Scanner scan = new Scanner(System.in);

	static int current = 0;

	public static void main(String[] args) {

		EXIT: while (true) {
			int menu = inputMainMenu();// 함수 선택후 f3번함수위치로

			switch (menu) {
			case 1:
				listClass();// NewClass = addClass, insertClass, regClass, createClass, appendClass,.....
				break;
			case 2:
				listHistory();// OpneClass = editClass, modifyClass, detailClass, detailClass, getlnfoClass,
								// ........
				break;
			case 3:// quit
				System.out.println("Bye~~~~");
				break EXIT;
			default:
			}

		}

	}

	private static void listHistory() {
		// TODO Auto-generated method stub

	}

	private static void listClass() {
		while (true) {
			System.out.println("#MAIN > #Class");
			System.out.println("┌────┬────────────────────────────────┬────┐");
			System.out.println("| ID |               NAME             |CAPA|");
			System.out.println("├────┼────────────────────────────────┼────┤");

			if (current == 0)
				System.out.println("|    |      Please add new class      |    |");
			else
				for (int i = 0; i < current; i++)
					System.out.printf("| %2d |%18s              | %2d |\n", classIds[current - i - 1] + 1,
							classNames[current - i - 1], classCapacitys[current - i - 1]);

			System.out.println("└────┴────────────────────────────────┴────┘");
			System.out.println();
			if (current == 0) {
				System.out.println("\t2. Add Class");
				System.out.println("\t5. Go main");
			} else {
				System.out.println("\t1. Shake it");
				System.out.println("\t2. Add Class");
				System.out.println("\t3. View Class & Edit member");
				System.out.println("\t4. Delete Class");
				System.out.println("\t5. Go main");

			}
			System.out.println(">");
			int menu = Integer.parseInt(scan.nextLine());

			switch (menu) {
			case 1:
				shakeClass();
				break;
			case 2:
				addClass();
				break;
			case 3:
				viewClass();
				break;
			case 4:
				System.out.print("Class ID >");
				int classId = Integer.parseInt(scan.nextLine());
				break;
			case 5:
				return;
			}
		}

	}

	private static void viewClass() {
		// TODO Auto-generated method stub

	}

	private static void shakeClass() {
		// TODO Auto-generated method stub

	}

	private static int inputMainMenu() {

		System.out.println("#1. MAIN");
		System.out.println();
		System.out.println();
		System.out.println("\t\tSHAKE IT! SHAKE IT!");
		System.out.println();
		System.out.println();
		System.out.println("1. Class");
		System.out.println("2. History");
		System.out.println("3. Quit");

		System.out.print(">");
		int menu = Integer.parseInt(scan.nextLine());

		return menu;
	}

	private static void addClass() {
		// classIds[current-i],classNames[current-i],calssCapacitys[current-i]

		System.out.println("#MAIN > #Select Class > #Add Class");
		System.out.println();

		// System.out.println("▶ Class ID");// (순차적으로 자동입력)
		classIds[current] = current;// Integer.parseInt(scan.nextLine());

		System.out.println("▶ Class Name");
		classNames[current] = scan.nextLine();

		System.out.println("▶ Member List");
		String[] member = scan.nextLine().split(",");

		int save;
		do {
			System.out.println("Save? 1.Y / 2.N");
			System.out.print(">");
			save = Integer.parseInt(scan.nextLine());

			if (save == 1) {
				names[current] = member;
				current++;
			} else if (save == 2)
				;
			else {
				System.out.println("사용방법이 잘못됨");
			}
		} while (!(save == 1 && save == 2));

	}
}
