package chapter2.ex3.cutting;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class OmokProgram3 {

	public static void main(String[] args) throws FileNotFoundException {

		// ���� 4 : �迭�� �̿��� ���� ���α׷�
		
		/*
		 1�� �迭
		 char[]board=new char[WIDTH*HEIGHT];
		 (3.2)
		 int x = 3, y=2;
		 board[(y-1)*WIDTH+(x-1)] = '��';
		 
		 2�迭*
		 char[][]board=new char[WIDTH][HEIGHT];ū���� ����������
		 (3.2)
		 int x = 3, y = 2;
		 board[y-1][x-1]='��';
		 
		 */
		Scanner scan = new Scanner(System.in);
		final int WIDTH = 15;
		final int HEIGHT = 10;
		int[] colors = new int[100];
		int[] xs = new int[100];
		int[] ys = new int[100];
		
		int current = 0;
		
		//char[] board = new char[200];// ���� 0������ ���� ���� ���� ����ߴ�
		char[][] board = new char[HEIGHT][WIDTH];
		
		for(int y=1;y<=HEIGHT;y++)
			for(int x=1;x<=WIDTH;x++)
				if (x == 1 && y == 1)
					board[y-1][x-1]='��';
				else if (x == WIDTH && y == 1)
					board[y-1][x-1]='��';
				else if (x == 1 && y == HEIGHT)
					board[y-1][x-1]='��';
				else if (x == WIDTH && y == HEIGHT)
					board[y-1][x-1]='��';
				else if (y == 1)
					board[y-1][x-1]='��';
				else if (y == HEIGHT)
					board[y-1][x-1]='��';
				else if (x == 1)
					board[y-1][x-1]='��';
				else if (x == WIDTH)
					board[y-1][x-1]='��';
				else
				board[y-1][x-1]='��';
		
		//�������� ����ϱ�		
		while(true) {
			for(int y=0;y<HEIGHT;y++) {
				for(int x=0;x<WIDTH;x++) 
					System.out.printf("%c", board[y][x]);
				
				
				System.out.println();
			}
			//������ �Է¹ޱ�	
			System.out.print("(x sp y) > ");
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			xs[current] = x;
			ys[current] = y;
			
			if(current%2==0)
				board[y-1][x-1] = '��';
			else
				board[y-1][x-1] = '��';
			
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
					boolean put = false;// put=�߰ߵǾ���.
					// ����ã�Ƽ� ����ϱ� ����
					for (int i = 0; i < current; i++)
						if (x == xs[i] && y == ys[i]) {// ������ġ�� ���� �߰ߵǸ� ����, x���� xs������ i�濡 ��ġ �������� y���� ys������ i�濡 ��ġ ��������
							if (colors[i] == 0)
								System.out.printf("%c", '��');
							else
								System.out.printf("%c", '��');
							put = true;
							break;// �迭���� ���ϴ� ���� ã������ ���̻� ã�� �ʿ䰡 ����.
						}
					if (put != true) {// !=�� ���� �ʴٴ� ǥ��
						if (x == 1 && y == 1)
							System.out.printf("%c", '��');
						else if (x == WIDTH && y == 1)
							System.out.printf("%c", '��');
						else if (x == 1 && y == HEIGHT)
							System.out.printf("%c", '��');
						else if (x == WIDTH && y == HEIGHT)
							System.out.printf("%c", '��');
						else if (y == 1)
							System.out.printf("%c", '��');
						else if (y == HEIGHT)
							System.out.printf("%c", '��');
						else if (x == 1)
							System.out.printf("%c", '��');
						else if (x == WIDTH)
							System.out.printf("%c", '��');
						else
							System.out.printf("%c", '��');
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



//�������� a1+(n-1)d = �������� 0�϶� al+(n)d
//for(int n=1;n<=5;n++)
//System.out.printf("%d", 1+(n-1)*5) �������� ����

//���α׷����� �����׸��� �տ� �д�
