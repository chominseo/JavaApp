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
			System.out.println("┌─────────────────────────────────────────┐");
			System.out.println("│                 메인메뉴                                    │");
			System.out.println("└─────────────────────────────────────────┘");
			System.out.println("\t1. 성적입력");
			System.out.println("\t2. 성적출력");
			System.out.println("\t3. 종료");
			
			System.out.print("\t선택>");
			menu = scan.nextInt();
			
			switch(menu){
			case 1: 
				System.out.println("┌─────────────────────────────────────────┐");
				System.out.println("│                 성적입력                                    │");
				System.out.println("└─────────────────────────────────────────┘");
				
				do {
				System.out.print("국어1:");
				kor1 = scan.nextInt();
				
				if(kor1<0 || kor1>100)
					System.out.println("국어 성적이 0~100까지의 범위만 입력이 가능합니다.");
				}
				while(kor1<0 || kor1>100);
				
				
				do {
				System.out.print("국어2:");
				kor2 = scan.nextInt();
				
				if(kor2<0 || kor2>100)
					System.out.println("국어 성적이 0~100까지의 범위만 입력이 가능합니다.");
				}
				while(kor2<0 || kor2>100);
				
				
				do {
				System.out.print("국어3:");
				kor3 = scan.nextInt();
				
				if(kor3<0 || kor3>100)
					System.out.println("국어 성적이 0~100까지의 범위만 입력이 가능합니다.");
				}
				while(kor3<0 || kor3>100);
				
				System.out.println("───────────────────────────────────────────");
				
			
				break;
			
			
			case 2: 
			
				total = kor1 + kor2 + kor3;
				avg = total / 3.0f;
				//avg = (float)(total/3.0); (float)잘라도됨 이라고 명시
		
				System.out.println("┌─────────────────────────────────────────┐");
				System.out.println("│                 성적출력                                    │");
				System.out.println("└─────────────────────────────────────────┘");
				System.out.println("");
				
				System.out.printf("국어1: %d\n", kor1);
				System.out.printf("국어2: %d\n", kor2);
				System.out.printf("국어3: %d\n", kor3);
				
				//for(int i=0;i<3;++i) 
					//System.out.printf("국어%d : %3d\n", i+1, kor1);
				
				System.out.println("");
				System.out.printf("총점 : %3d\n", total);
				System.out.printf("평균 : %3.2f\n", avg);
				System.out.println("───────────────────────────────────────────");
				
				break;
				
			case 3:  
					System.out.println("Bye~~~");
					break end;
				
				
			default :
					System.out.println("잘못된 값을 입력하였습니다. 메뉴는 1~3까지 입니다.");
				
			}
		}
		
		
	
	}
}