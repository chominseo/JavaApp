package chapter2.ex1.array;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class OmokProgram2 {

	public static void main(String[] args) throws FileNotFoundException {

		// 문제 4 : 배열을 이용한 오목 프로그램
		int[] colors = new int[100];

		int[] xs = new int[100];
		int[] ys = new int[100];

		int current = 0;

		Scanner scan = new Scanner(System.in);
		char[] board = new char[200];// 방은 0번부터 시작 전부 같이 맞춰야댐

		while (true) {
			for (int y = 1; y <= 10; y++) {
				for (int x = 1; x <= 10; x++) {
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
						else if (x == 10 && y == 1)
							System.out.printf("%c", '┐');
						else if (x == 1 && y == 10)
							System.out.printf("%c", '└');
						else if (x == 10 && y == 10)
							System.out.printf("%c", '┘');
						else if (y == 1)
							System.out.printf("%c", '┬');
						else if (y == 10)
							System.out.printf("%c", '┴');
						else if (x == 1)
							System.out.printf("%c", '├');
						else if (x == 10)
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

	}

}

//등차수열 a1+(n-1)d = 정수값이 0일때 al+(n)d
//for(int n=1;n<=5;n++)
//System.out.printf("%d", 1+(n-1)*5) 등차수열 예시

//프로그램에서 예외항목을 앞에 둔다
