package chapter3.ex2.capsule;

import java.util.Scanner;

public class ShuffleProgram2 {
  
   public static void main(String[] args) {
	   
	  Classes hta = new Classes();
	  hta.courses = new Course[100];
	  hta.current = 0;
	  

      EXIT: while (true) {
         int menu = inputMainMenu();

         switch (menu) {
         case 1: // New Class
            listClass(hta); // addClass, insertClass, regClass, createClass, appendClass, .....
            break;
         case 2: // List Class
            listHistory(hta); // editClass, modifyClass, .... showClass, detailCalss, getInfoClass, ....
            break;
         case 3: // Quit
            System.out.println("Bye~~~");
            break EXIT;
         default:

         }
      }

   }

   private static void listHistory(Classes hta) {
      // TODO Auto-generated method stub
      
   }

   private static void listClass(Classes hta) {
      
      while(true) {
    	  Scanner scan = new Scanner(System.in);
    	  int currentId;
    	  int current = hta.current;
    	  Course[]courses = hta.courses;
      
         System.out.println("#MAIN > #Class");
         
         System.out.println("┌─────┬────────────────────────────────────────────┬────┐");
         System.out.println("│  ID │                     NAME                   │CAPA│");
         System.out.println("├─────┼────────────────────────────────────────────┼────┤");
         
         if(current == 0) //목록이 없을 경우
            System.out.println("│     │   Please add new class                     │    │");
         else
            for(int i=0; i<current; i++)
               System.out.printf("│ %3d │         %20s               │%3d │\n", courses[i].id, courses[i].name, courses[i].capacity);
               //System.out.printf("│ %3d │%20s│ %3d │\n", classIds[i], classNames[i], classCapacitys[i]);
         
         System.out.println("└─────┴────────────────────────────────────────────┴────┘");
         
         System.out.println("\t1. Shake it");
         System.out.println("\t2. Add Class");
         System.out.println("\t3. View Class & Edit member");
         System.out.println("\t4. Delete Class");
         System.out.println("\t5. Go main");
         System.out.print(">");
         
         int menu = Integer.parseInt(scan.nextLine());
         
         switch(menu) {
         case 1:
            shakeClass();
            break;
         case 2:
            addClass(hta);
            break;
         case 3:
            System.out.print("Class ID >");
            currentId = Integer.parseInt(scan.nextLine());
            viewClass(hta,currentId);
            break;
         case 4:
            System.out.print("Class ID >");
            currentId = Integer.parseInt(scan.nextLine());
            deleteClass(hta,currentId);
            break;
         case 5:
            return;
         }
      
      }
      
   }

   private static void deleteClass(Classes hta, int currentId) {
      
      Course[]courses = hta.courses;
      int current = hta.current;
      
      int index = -1;
      for(int i=0; i<current; i++)
         if(courses[i].id == currentId)
            index = i;         
      
      if(index == -1) {
         System.out.println("선택한 id에 대한 과정 정보가 존재하지 않습니다.");
         return;
      }
      
      courses[index] = null;
      
      for(int i=0; i<current-index-1; i++)
         courses[index+i] = courses[index+1+i];
         
      current--;
      hta.current=current;
      hta.courses=courses;

   }

   private static void viewClass(Classes hta, int currentId) {
	   
	   Scanner scan = new Scanner(System.in);
	   int current = hta.current;
 	   Course[]courses = hta.courses;
      
      //System.out.print("#MAIN > #Select Class > #View Class & Edit member");

      int index = -1;
      
      for(int i=0; i<current; i++)
         if(courses[i].id == currentId) {
            index = i;
      		break;
         }
      if(index == -1) {
         System.out.println("선택한 id에 대한 과정 정보가 존재하지 않습니다.");
         return;
      }
         
      Course course = courses[index];         
      
      System.out.printf("▶ Class ID : %d\n", course.id);
      System.out.printf("▶ Class Name : %s\n", course.name);
      System.out.print("▶ Member List : ");
      
      for(int i=0; i< course.members.length; i++)
         if(i == course.members.length-1)
            System.out.printf("%s", course.members[i]);
         else
            System.out.printf("%s, ", course.members[i]);
      
      System.out.println();
      
      System.out.println("1. Edit  2. Go back");
      
      int menu = Integer.parseInt(scan.nextLine());
      String[] names = null;
      
      if(menu == 1) {         
         System.out.print("▶ Member List :");
         names = scan.nextLine().split(",");
      }
      else if(menu == 2)
         return;
      
      System.out.println("Save? 1.Y / 2.N");
      System.out.print(">");
      int save = Integer.parseInt(scan.nextLine());
      
      if(save == 1) {
         course.members = names;
         course.capacity = names.length;
         
         
      }
      
   }

   private static void shakeClass() {
      
      
      
   }

   private static void addClass(Classes hta) {
	   
	  Scanner scan = new Scanner(System.in);
	  int current = hta.current;
	  Course[]courses = hta.courses;
      
      int id;
      String name;
      String[] members;
      
      System.out.print("▶ Class ID");
      id = Integer.parseInt(scan.nextLine());
      
      System.out.print("▶ Class Name");
      name = scan.nextLine();
      
      System.out.print("▶ Member List");
      members = scan.nextLine().split(",");
      
      int save;
      
      do {
         System.out.print("Save? 1.Y / 2.N");
         System.out.print(">");
         save = Integer.parseInt(scan.nextLine());
         
         if(save == 1) {
            courses[current] = new Course();
            courses[current].id = id;
            courses[current].name = name;
            courses[current].members = members;
            courses[current].capacity = members.length;
            current++;
    		hta.current = current;
    		hta.courses = courses;
         }
         else if(save == 2) ;
         else {
            System.out.println("사용방법 : 1 또는 2번만 입력할 수 있습니다.");
         }
      }while(!(save == 1 || save == 2));

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
      System.out.println("   > ");

      int menu = Integer.parseInt(scan.nextLine());

      return menu;
   }

}