package chapter2.ex3.cutting;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class OmokProgram3 {

	public static void main(String[] args) throws FileNotFoundException {

		// 문제 4 : 배열을 이용한 오목 프로그램
		
		/*
		 1차 배열
		 char[]board=new char[WIDTH*HEIGHT];
		 (3.2)
		 int x = 3, y=2;
		 board[(y-1)*WIDTH+(x-1)] = '●';
		 
		 2배열*
		 char[][]board=new char[WIDTH][HEIGHT];큰단위 작은단위순
		 (3.2)
		 int x = 3, y = 2;
		 board[y-1][x-1]='●';
		 
		 */
		Scanner scan = new Scanner(System.in);
		final int WIDTH = 15;
		final int HEIGHT = 10;
		int[] colors = new int[100];
		int[] xs = new int[100];
		int[] ys = new int[100];
		
		int current = 0;
		
		//char[] board = new char[200];// 방은 0번부터 시작 전부 같이 맞춰야댐
		char[][] board = new char[HEIGHT][WIDTH];
		
		for(int y=1;y<=HEIGHT;y++)
			for(int x=1;x<=WIDTH;x++)
				if (x == 1 && y == 1)
					board[y-1][x-1]='┌';
				else if (x == WIDTH && y == 1)
					board[y-1][x-1]='┐';
				else if (x == 1 && y == HEIGHT)
					board[y-1][x-1]='└';
				else if (x == WIDTH && y == HEIGHT)
					board[y-1][x-1]='┘';
				else if (y == 1)
					board[y-1][x-1]='┬';
				else if (y == HEIGHT)
					board[y-1][x-1]='┴';
				else if (x == 1)
					board[y-1][x-1]='├';
				else if (x == WIDTH)
					board[y-1][x-1]='┤';
				else
				board[y-1][x-1]='┼';
		
		//오목판을 출력하기		
		while(true) {
			for(int y=0;y<HEIGHT;y++) {
				for(int x=0;x<WIDTH;x++) 
					System.out.printf("%c", board[y][x]);
				
				
				System.out.println();
			}
			//오목을 입력받기	
			System.out.print("(x sp y) > ");
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			xs[current] = x;
			ys[current] = y;
			
			if(current%2==0)
				board[y-1][x-1] = '●';
			else
				board[y-1][x-1] = '○';
			
			current++;
			
			
			
		}
		
		
		}		
		/*
		int[] colors = new int[100];

		int[] xs = new int[100];
		int[] ys = new int[100];

		int current = 0;

		Scanner scan = new Scanner(System.in);
		

		while (true) {
			for (int y = 1; y <= HEIGHT; y++) {
				for (int x = 1; x <= WIDTH; x++) {
					boolean put = false;// put=발견되었다.
					// 오목찾아서 출력하기 로직
					for (int i = 0; i < current; i++)
						if (x == xs[i] && y == ys[i]) {// 현재위치에 돌이 발견되면 실행, x축을 xs변수에 i방에 위치 지정해줌 y축을 ys변수에 i방에 위치 지정해줌
							if (colors[i] == 0)
								System.out.printf("%c", '●');
							else
								System.out.printf("%c", '○');
							put = true;
							break;// 배열에서 원하는 값을 찾았을때 더이상 찾을 필요가 없다.
						}
					if (put != true) {// !=는 같지 않다는 표현
						if (x == 1 && y == 1)
							System.out.printf("%c", '┌');
						else if (x == WIDTH && y == 1)
							System.out.printf("%c", '┐');
						else if (x == 1 && y == HEIGHT)
							System.out.printf("%c", '└');
						else if (x == WIDTH && y == HEIGHT)
							System.out.printf("%c", '┘');
						else if (y == 1)
							System.out.printf("%c", '┬');
						else if (y == HEIGHT)
							System.out.printf("%c", '┴');
						else if (x == 1)
							System.out.printf("%c", '├');
						else if (x == WIDTH)
							System.out.printf("%c", '┤');
						else
							System.out.printf("%c", '┼');
					}
				}
				System.out.println();
			}
			
			System.out.println("(x sp y) > ");
			xs[current] = scan.nextInt();
			ys[current] = scan.nextInt();
			colors[current] = current % 2;
			current++;
		}		
		*/
		
		

}



//등차수열 a1+(n-1)d = 정수값이 0일때 al+(n)d
//for(int n=1;n<=5;n++)
//System.out.printf("%d", 1+(n-1)*5) 등차수열 예시

//프로그램에서 예외항목을 앞에 둔다
