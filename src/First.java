import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		
		
		int kor1, kor2, kor3, total, menu;
		float avg;
		
		kor1 = 100;
		kor2 = 70;
		kor3 = 95;
		
		Scanner scan = new Scanner(System.in);
		
		
		end:
		while(true)
		{
			System.out.println("��������������������������������������������������������������������������������������");
			System.out.println("��                 ���θ޴�                                    ��");
			System.out.println("��������������������������������������������������������������������������������������");
			System.out.println("\t1. �����Է�");
			System.out.println("\t2. �������");
			System.out.println("\t3. ����");
			
			System.out.print("\t����>");
			menu = scan.nextInt();
			
			switch(menu){
			case 1: 
				System.out.println("��������������������������������������������������������������������������������������");
				System.out.println("��                 �����Է�                                    ��");
				System.out.println("��������������������������������������������������������������������������������������");
				
				do {
				System.out.print("����1:");
				kor1 = scan.nextInt();
				
				if(kor1<0 || kor1>100)
					System.out.println("���� ������ 0~100������ ������ �Է��� �����մϴ�.");
				}
				while(kor1<0 || kor1>100);
				
				
				do {
				System.out.print("����2:");
				kor2 = scan.nextInt();
				
				if(kor2<0 || kor2>100)
					System.out.println("���� ������ 0~100������ ������ �Է��� �����մϴ�.");
				}
				while(kor2<0 || kor2>100);
				
				
				do {
				System.out.print("����3:");
				kor3 = scan.nextInt();
				
				if(kor3<0 || kor3>100)
					System.out.println("���� ������ 0~100������ ������ �Է��� �����մϴ�.");
				}
				while(kor3<0 || kor3>100);
				
				System.out.println("��������������������������������������������������������������������������������������");
				
			
				break;
			
			
			case 2: 
			
				total = kor1 + kor2 + kor3;
				avg = total / 3.0f;
				//avg = (float)(total/3.0); (float)�߶󵵵� �̶�� ���
		
				System.out.println("��������������������������������������������������������������������������������������");
				System.out.println("��                 �������                                    ��");
				System.out.println("��������������������������������������������������������������������������������������");
				System.out.println("");
				
				System.out.printf("����1: %d\n", kor1);
				System.out.printf("����2: %d\n", kor2);
				System.out.printf("����3: %d\n", kor3);
				
				//for(int i=0;i<3;++i) 
					//System.out.printf("����%d : %3d\n", i+1, kor1);
				
				System.out.println("");
				System.out.printf("���� : %3d\n", total);
				System.out.printf("��� : %3.2f\n", avg);
				System.out.println("��������������������������������������������������������������������������������������");
				
				break;
				
			case 3:  
					System.out.println("Bye~~~");
					break end;
				
				
			default :
					System.out.println("�߸��� ���� �Է��Ͽ����ϴ�. �޴��� 1~3���� �Դϴ�.");
				
			}
		}
		
		
	
	}
}