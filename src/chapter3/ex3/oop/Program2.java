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
			System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�. �޴��� 1~3�����Դϴ�.");
		}
		}
	
	}

	private static int inputMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("����������������������������������������������������������");
		System.out.println("��           ���� �޴�           ��");
		System.out.println("����������������������������������������������������������");
		System.out.println("\t1. �����Է� ");
		System.out.println("\t2. ������� ");
		System.out.println("\t3. ���� ");
		System.out.println("\t����> ");
		int menu = scan.nextInt();
		//scan.close();
		return menu;
		
	}
	private static void printExam(Exam[]exams) {
	
			System.out.println("����������������������������������������������������������");
			System.out.println("��          ����  ���           ��");
			System.out.println("����������������������������������������������������������");
			System.out.println();

			for (int i = 0; i < current; i++) {
				
				int kor = exams[i].kor;
				int eng = exams[i].eng;
				int math = exams[i].math;
				
				int total=kor+eng+math;
				float avg= total/3.0f;
				
				//for(int j=0;j<current;j++)
				System.out.printf("%d, kor:%d, eng:%d, math:%d, total:%d, avg:%.2f\n",i+1,kor,eng,math,total,avg);
			

			//System.out.printf("���� : %3d\n", total);
			//System.out.printf("��� : %6.2f\n", avg);
			}
			System.out.println("����������������������������������������������������������");

			
		

		
	}

	private static void inputExam(Exam[]exams) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("����������������������������������������������������������");
		System.out.println("��          ����  �Է�           ��");
		System.out.println("����������������������������������������������������������");
		System.out.println();

		int kor, eng, math;
		
		do {
             System.out.printf("����%d : ", current+1);
             kor = scan.nextInt();
          
             if(kor < 0 || 100 < kor)
                System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");
             
          }while(kor < 0 || 100 < kor);
		
		do {
             System.out.printf("����%d : ", current+1);
             eng = scan.nextInt();
          
             if(eng < 0 || 100 < eng)
                System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");
             
          }while(eng < 0 || 100 < eng);
		
		do {
             System.out.printf("����%d : ", current+1);
             math = scan.nextInt();
          
             if(math < 0 || 100 < math)
                System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");
             
          }while(math < 0 || 100 < math);
		
		exams[current]=new Exam();
		exams[current].kor=kor;
		exams[current].eng=eng;
		exams[current].math=math;
		
		current++;
		//scan.close();
		
		
	
		
	}


}
