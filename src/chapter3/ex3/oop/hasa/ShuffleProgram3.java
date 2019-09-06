package chapter3.ex3.oop.hasa;

import java.util.Scanner;

public class ShuffleProgram3 {

   

   public static void main(String[] args) {

	   CourseList hta = new CourseList();
	   

	   
	   
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

   

   

  



   

//   private static void shakeClass(Classes hta,int currentId) {
//	   Scanner scan = new Scanner(System.in);
//	   int current=hta.current;
//	   Course[] courses = hta.courses;
//	   
//	   int index = -1;
//	      
//	   for(int i=0; i<current; i++)
//		   if(courses[i].id == currentId)
//			   index = i;
//      
//	   if(index == -1) {
//		   System.out.println("선택한 id에 대한 과정 정보가 존재하지 않습니다.");
//		   return;
//	   }
//	   System.out.print("How many Groups? ");
//	   int input = Integer.parseInt(scan.nextLine());
//	   
//	   if()
//	   
//	   
//      
//      
//   }

   

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
