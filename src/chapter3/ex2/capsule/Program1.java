package chapter3.ex2.capsule;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		/*
		국어성적을 관리하는 프로그램에
		영어(성적),수학(성적) 과목을 추가한 프로그램
		
		1.과정이름, 과정번호, 과정일정, 과정인원을 관리하는 프로그램을 만들겠다 데이터는?
		2.학생이름, 학생나이, 학생주소, 학생 전화번호를 관리하는 프로그램을 만들겠다 데이터는?
		 */

		//int[] kors = new int[3];
		Scanner scan = new Scanner(System.in);
		Exam [] exams = new Exam[3];
		int current = 0;
		/*
		for(int i=0;i<exams.length;i++)
			exams[i]=new Exam();
		*/
		
		int menu;
		



		라벨벨: while (true) {
			System.out.println("┌───────────────────────────┐");
			System.out.println("│           메인 메뉴           │");
			System.out.println("└───────────────────────────┘");
			System.out.println("\t1. 성적입력 ");
			System.out.println("\t2. 성적출력 ");
			System.out.println("\t3. 종료 ");
			System.out.println("\t선택> ");
			menu = scan.nextInt();

			switch (menu) {
			case 1:{

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
				
				break;
			}
				
			case 2:{
				
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
					System.out.printf("%d, kor:%d, eng:%d, math:%d, total:%d, avg:%f\n",i+1,kor,eng,math,total,avg);
				

				//System.out.printf("총점 : %3d\n", total);
				//System.out.printf("평균 : %6.2f\n", avg);
				}
				System.out.println("─────────────────────────────");

				break;
			}
			case 3:
				System.out.println("Bye~~");
				break 라벨벨;

			default:
				System.out.println("잘못된 값을 입력하셨습니다. 메뉴는 1~3까지입니다.");

			}

		}

	}
}