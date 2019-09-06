package chapter3.ex4.oop.hasa;


import java.util.Scanner;

public class CourseList {
	int current;
	Course[] courses;
	
	public CourseList() {
		this.current = 0;
		this.courses = new Course[100];
	}
	
	
	public void list() {
		   Scanner scan = new Scanner(System.in); 
		   while(true) {
	    	 int current = this.current;
	    	 Course[] courses = this.courses;
	    	 int currentId;
	    	 
	    	 
	         System.out.println("#MAIN > #Class");
	         
	         System.out.println("┌────┬─────────────────────────┬────┐");
	         System.out.println("│ ID │          NAME           │CAPA│");
	         System.out.println("├────┼─────────────────────────┼────┤");
	         

	         if(current == 0) //목록이 없을 경우
	        	 System.out.println("│    │   Please add new class  │    │");
	         else
	            for(int i=0; i<current; i++)
	               System.out.printf("│%3d │   %20s  │%3d │\n", 
	            		   courses[i].getId(), courses[i].getName(), courses[i].getCapacity());
	           
	         
	         System.out.println("└────┴─────────────────────────┴────┘");
	         
	         System.out.println("\t1. Shake it");
	         System.out.println("\t2. Add Class");
	         System.out.println("\t3. View Class & Edit member");
	         System.out.println("\t4. Delete Class");
	         System.out.println("\t5. Go main");
	         System.out.print("> ");
	         
	         int menu = Integer.parseInt(scan.nextLine());
	         
	         switch(menu) {
	         case 1:
	        	currentId = currentId();
	            this.shake(currentId);
	            break;
	         case 2:
	            this.add();
	            break;
	         case 3:
	            currentId = currentId();
	            this.view(currentId);
	            break;
	         case 4:
	        	currentId = currentId();
	            this.delete(currentId);
	            break;
	         case 5:
	            return;
	         }

	      }
	      
	   }
	public void shake(int currentId) {
		// TODO Auto-generated method stub
		
	}


	public void History() {
	      // TODO Auto-generated method stub
	      
	   }
	 private static int currentId() {
		   Scanner scan = new Scanner(System.in);
		   System.out.print("Class ID >");
	       int currentId = Integer.parseInt(scan.nextLine());
	       return currentId;
	}
	 
	 public void add() {
		  Scanner scan = new Scanner(System.in);
	      int current = this.current;
	      Course[] courses = this.courses;
	      
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
	        	courses[current++] = new Course(id, name,members,members.length);

	         }
	         else if(save == 2) ;
	         else {
	            System.out.println("사용방법 : 1 또는 2번만 입력할 수 있습니다.");
	         }
	      }while(!(save == 1 || save == 2));
	      
	      this.current = current;
	      this.courses = courses;
	   }
	 public void view(int currentId) {
		   Scanner scan = new Scanner(System.in);
		   int current = this.current;
		   Course[] courses = this.courses;
	      
		   System.out.println("#MAIN > #Select Class > #View Class & Edit member");

		   int index = -1;
	      
		   for(int i=0; i<current; i++)
			   if(courses[i].getId() == currentId)
				   index = i;
	      
		   if(index == -1) {
			   System.out.println("선택한 id에 대한 과정 정보가 존재하지 않습니다.");
			   return;
		   }
	         
		   Course course = courses[index];         
	      
		   System.out.printf("▶ Class ID : %d\n", course.getId());
		   System.out.printf("▶ Class Name : %s\n", course.getName());
		   System.out.print("▶ Member List : ");
	      
		   for(int i=0; i< course.getMembers().length; i++)
			   if(i == course.getMembers().length-1)
				   System.out.printf("%s", course.getMembers()[i]);
			   else
				   System.out.printf("%s, ", course.getMembers()[i]);
	      
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
	         course.setMembers(names);
	         course.setCapacity(names.length);
	         this.courses[index] = course;
	      }
	      
	   }
	 public void delete(int currentId) {
	      
		  int current = this.current;
		  Course[] courses = this.courses;
	      int index = -1;
	      
	      for(int i=0; i<current; i++)
	         if(courses[i].getId() == currentId)
	            index = i;         
	      
	      if(index == -1) {
	         System.out.println("선택한 id에 대한 과정 정보가 존재하지 않습니다.");
	         return;
	      }
	      
	      courses[index] = null;
	      
	      for(int i=0; i<current-index-1; i++)
	         courses[index+i] = courses[index+1+i];
	         
	      current--;  
	      this.current = current;
		  this.courses = courses;
	   }
}
