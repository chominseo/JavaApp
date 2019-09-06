package chapter3.ex3.oop;

import java.util.Scanner;

public class Program2 {
	
	static int current = 0;

	public static void main(String[] args) {

		Exam [] exams = new Exam[3];
		
		
		end:
		while(true) {
			
			int menu = inputMenu();
			
		switch(menu) {
		case 1:
			
			inputExam(exams);
			break;
			
		case 2:
			
			printExam(exams);
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
		//scan.close();
		return menu;
		
	}
	private static void printExam(Exam[]exams) {
	
			System.out.println("┌───────────────────────────┐");
			System.out.println("│          성적  출력           │");
			System.out.println("└───────────────────────────┘");
			System.out.println();

			for (int i = 0; i < current; i++) {
				
				int kor = exams[i].kor;
				int eng = exams[i].eng;
				int math = exams[i].math;
				
				int total=kor+eng+math;
				float avg= total/3.0f;
				
				//for(int j=0;j<current;j++)
				System.out.printf("%d, kor:%d, eng:%d, math:%d, total:%d, avg:%.2f\n",i+1,kor,eng,math,total,avg);
			

			//System.out.printf("총점 : %3d\n", total);
			//System.out.printf("평균 : %6.2f\n", avg);
			}
			System.out.println("─────────────────────────────");

			
		

		
	}

	private static void inputExam(Exam[]exams) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("┌───────────────────────────┐");
		System.out.println("│          성적  입력           │");
		System.out.println("└───────────────────────────┘");
		System.out.println();

		int kor, eng, math;
		
		do {
             System.out.printf("국어%d : ", current+1);
             kor = scan.nextInt();
          
             if(kor < 0 || 100 < kor)
                System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");
             
          }while(kor < 0 || 100 < kor);
		
		do {
             System.out.printf("영어%d : ", current+1);
             eng = scan.nextInt();
          
             if(eng < 0 || 100 < eng)
                System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");
             
          }while(eng < 0 || 100 < eng);
		
		do {
             System.out.printf("수학%d : ", current+1);
             math = scan.nextInt();
          
             if(math < 0 || 100 < math)
                System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");
             
          }while(math < 0 || 100 < math);
		
		exams[current]=new Exam();
		exams[current].kor=kor;
		exams[current].eng=eng;
		exams[current].math=math;
		
		current++;
		//scan.close();
		
		
	
		
	}


}
