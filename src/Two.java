import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		
		/*int i, total = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("data >");
		
		while(scan.hasNextInt()){ 
			i = scan.nextInt(); 
			
			System.out.println(i);
			total = total + i;
			
			}
		
		System.out.printf("total is %d", total);*/
		
		for(int i=0; i<10; i++)
			System.out.printf("%c", 'ㅇ');
		
		
		for(int i=0; i<5; i++) {
			if(i<4)
			System.out.printf("%c,",'A'+i);
			
			if(i==4)
				System.out.printf("%c",'A'+i);
		}
		
		
		for(int i=0; i<5; i++)//i는 위치 또는 횟수 의미
			System.out.printf("%c,",'A'+i);
		
		for(int i=0; i<5; i++)
			System.out.println('A');
		
		
		
		
		
		
		
		
		/*int i = 0;
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("data >");
		
		while(scan.hasNextInt()){ 
			i = scan.nextInt(); 
			
			count++;
			//System.out.println(i);
			}
		
		System.out.printf("count is %d", count);
		/*
			
	
		
		
		
		
		
		
		/*	int x = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("data >");
		
		while(scan.hasNextInt()) { 
			
			x = scan.nextInt();
			System.out.println(x);
			}
		
		
		do { 
			x = scan.nextInt();
			System.out.println(x);
			}while(scan.hasNextInt());
		
		*/

	}
}
