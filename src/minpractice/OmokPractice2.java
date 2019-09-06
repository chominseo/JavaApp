package minpractice;

public class OmokPractice2 {
			static int WIDTH = 20;
		    static int HEIGHT = 10;
		    static char[][] board = new char[HEIGHT][WIDTH];
		    static int[] xs = new int[WIDTH*HEIGHT];
		    static int[] ys = new int[WIDTH*HEIGHT];
	public static void main(String[] args) {
		
		        // 이차원 배열 board 배열에 격자형의 바둑판 문양의 문자를 채우시오. (단. 바둑판 모양은 다음과 같아야 한다.)
		        createBoard();
		        /*
		        ┌┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┐
		        ├┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┤
		        ├┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┤
		        */



		        // board 배열을 화면에 격자형으로 출력하시오.
		        printBoard();

		        // board에 (3,4) 위치에 '●' 문자를 두시오.
		        putBoard();


		        // board 배열을 화면에 격자형으로 출력하시오.
		        printBoard();

		    }

		    private static void createBoard(){
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

		    }

		    private static void printBoard(){
		    	for(int y=0;y<HEIGHT;y++) {
					for(int x=0;x<WIDTH;x++) 
						System.out.printf("%c", board[y][x]);
					System.out.println();
		    	}
		    }

		    private static void  putBoard(){
		    	board[4][3] = '●'; 
		    }
		}