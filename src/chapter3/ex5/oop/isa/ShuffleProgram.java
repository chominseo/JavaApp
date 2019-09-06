package chapter3.ex5.oop.isa;

import java.util.Scanner;

public class ShuffleProgram {

   

   public static void main(String[] args) {

	   CourseConsole hta = new CourseConsole();

	  EXIT: while (true) {
         int menu = inputMainMenu();

         switch (menu) {
         case 1: // New Class
            hta.list(); // addClass, insertClass, regClass, createClass, appendClass, .....
            break;
         case 2: // List Class
            hta.History(); // editClass, modifyClass, .... showClass, detailCalss, getInfoClass, ....
            break;
         case 3: // Quit
            System.out.println("Bye~~~");
            break EXIT;
         default:

         }
      }

   }

   

   private static int inputMainMenu() {
	   Scanner scan = new Scanner(System.in);
	   System.out.println("#1. MAIN");
	   System.out.println();
	   System.out.println();
	   System.out.println("      SHAKE IT! SHAKE IT!");
	   System.out.println();
	   System.out.println();
	   System.out.println();
	   System.out.println("   1. Class");
	   System.out.println("   2. History");
	   System.out.println("   3. Quit");
	   System.out.print("   > ");
	   
	   int menu = Integer.parseInt(scan.nextLine());
	   
	   return menu;
   }

}
