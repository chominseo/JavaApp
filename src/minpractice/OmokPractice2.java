package minpractice;

public class OmokPractice2 {
			static int WIDTH = 20;
		    static int HEIGHT = 10;
		    static char[][] board = new char[HEIGHT][WIDTH];
		    static int[] xs = new int[WIDTH*HEIGHT];
		    static int[] ys = new int[WIDTH*HEIGHT];
	public static void main(String[] args) {
		
		        // ������ �迭 board �迭�� �������� �ٵ��� ������ ���ڸ� ä��ÿ�. (��. �ٵ��� ����� ������ ���ƾ� �Ѵ�.)
		        createBoard();
		        /*
		        ��������������������������������������������
		        ��������������������������������������������
		        ��������������������������������������������
		        */



		        // board �迭�� ȭ�鿡 ���������� ����Ͻÿ�.
		        printBoard();

		        // board�� (3,4) ��ġ�� '��' ���ڸ� �νÿ�.
		        putBoard();


		        // board �迭�� ȭ�鿡 ���������� ����Ͻÿ�.
		        printBoard();

		    }

		    private static void createBoard(){
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

		    }

		    private static void printBoard(){
		    	for(int y=0;y<HEIGHT;y++) {
					for(int x=0;x<WIDTH;x++) 
						System.out.printf("%c", board[y][x]);
					System.out.println();
		    	}
		    }

		    private static void  putBoard(){
		    	board[4][3] = '��'; 
		    }
		}