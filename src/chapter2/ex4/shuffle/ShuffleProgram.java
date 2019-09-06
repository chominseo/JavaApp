package chapter2.ex4.shuffle;

import java.util.Scanner;

public class ShuffleProgram {

	static Course[] courses = new Course[100];
	   /*
	    static int[] classIds = new int[100];
	    static String[] classNames = new String[100];
	    static int[] classCapacitys = new int[100];
	    static int[]groupCountOfClasses = new int[100];
	    static String[][] names = new
	   */
	static Scanner scan = new Scanner(System.in);
	static int currentId = -1;
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
					System.out.printf("| %2d |%18s              | %2d |\n", courses[i].id, courses[i].name,
							courses[i].capacity);
			// System.out.printf("| %2d |%18s | %2d |\n", classIds[current - i - 1]+1,classNames[current - i - 1], classCapacitys[current - i - 1]);

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
				// System.out.println("Class ID >");
				// currentId = Integer.parseInt(scan.nextLine());
				viewClass();
				break;
			case 4:
				deletClass();
				// System.out.print("Class ID >");
				// int classId = Integer.parseInt(scan.nextLine());
				break;
			case 5:
				return;
			}
		}

	}

	private static void deletClass() {
		System.out.print("Class ID >");
		currentId = Integer.parseInt(scan.nextLine());
		int index = -1;
		for (int i = 0; i < current; i++) {
			if (courses[i].id == currentId)
				index = i;
		}
		if (index == -1) {
			System.out.println("선택한 과정정보가 존재하지 않습니다.");
			return;
		}
		courses[index] = null;
		for (int i = index; i < current; i++)
			courses[i] = courses[i + 1];
		current--;
		System.out.println("삭제되었습니다.");

	}

	private static void viewClass() {

		// System.out.print("#MAIN > #Select Class > #View Class & Edit member");

		System.out.print("Class ID>");
		currentId = Integer.parseInt(scan.nextLine());
		int index = -1;

		for (int i = 0; i < current; i++)
			if (courses[i].id == currentId) {
				index = i;
				break;
			}
		if (index == -1) {
			System.out.println("선택한 과정정보가 존재하지 않습니다.");
			return;
		}
		Course course = courses[index];

		System.out.printf("▶ Class ID :%d\n", course.id);
		System.out.printf("▶ Class Name :%s\n", course.name);
		System.out.print("▶ Member List :");

		for (int i = 0; i < course.capacity; i++)
			if (i == course.capacity - 1)
				System.out.printf("%s", course.members[i]);
			else
				System.out.printf("%s, ", course.members[i]);

		System.out.println();
		while (true) {
			System.out.println("1. Edit 2. Go back");
			System.out.print(">");
			int choice = Integer.parseInt(scan.nextLine());

			switch (choice) {
			case 1:
				System.out.println("▶ Member List");
				String[] members = null;
				members = scan.nextLine().split(",");
				int save;
				do {
					System.out.println("Save? 1.Y / 2.N");
					System.out.print(">");
					save = Integer.parseInt(scan.nextLine());
					if (save == 1) {
						course.members = members;
						course.capacity = members.length;
						System.out.printf("▶ Class ID :%d\n", course.id);
						System.out.printf("▶ Class Name :%s\n", course.name);
						System.out.print("▶ Member List :");
						for (int i = 0; i < course.capacity; i++)
							System.out.printf("%s ", course.members[i]);
						System.out.println();
						System.out.println("저장되었습니다.");
					} else if (save == 2)
						break;

					else {
						System.out.println("사용방법이 잘못됨");

					}
				} while (!(save == 1 || save == 2));

			case 2:
				return;

			default:
				System.out.println("사용방법이 잘못됨");

			}
		}
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

	            System.out.println("▶ Class ID");// (순차적으로 자동입력)
	            boolean entry = false;
	            
	            int id = Integer.parseInt(scan.nextLine());
	            //if()

	            System.out.println("▶ Class Name");
	            String name = scan.nextLine();

	            System.out.println("▶ Member List");
	            String[] members = scan.nextLine().split(",");
	            int save;
	            do {
	               System.out.println("Save? 1.Y / 2.N");
	               System.out.print(">");
	               save = Integer.parseInt(scan.nextLine());

	               if (save == 1) {
	                  courses[current] = new Course();
	                  courses[current].id = id;
	                  courses[current].name = name;
	                  courses[current].members = members;
	                  courses[current].capacity = members.length;
	                  current++;
	               } 
	               else if (save == 2);
	                  
	               else {
	                  System.out.println("사용방법이 잘못됨");
	               }
	            } while (!(save == 1 || save == 2));

	         
	      

	   }

}