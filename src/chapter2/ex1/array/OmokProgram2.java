package chapter2.ex1.array;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class OmokProgram2 {

	public static void main(String[] args) throws FileNotFoundException {

		// ���� 4 : �迭�� �̿��� ���� ���α׷�
		int[] colors = new int[100];

		int[] xs = new int[100];
		int[] ys = new int[100];

		int current = 0;

		Scanner scan = new Scanner(System.in);
		char[] board = new char[200];// ���� 0������ ���� ���� ���� ����ߴ�

		while (true) {
			for (int y = 1; y <= 10; y++) {
				for (int x = 1; x <= 10; x++) {
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
						else if (x == 10 && y == 1)
							System.out.printf("%c", '��');
						else if (x == 1 && y == 10)
							System.out.printf("%c", '��');
						else if (x == 10 && y == 10)
							System.out.printf("%c", '��');
						else if (y == 1)
							System.out.printf("%c", '��');
						else if (y == 10)
							System.out.printf("%c", '��');
						else if (x == 1)
							System.out.printf("%c", '��');
						else if (x == 10)
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

	}

}

//�������� a1+(n-1)d = �������� 0�϶� al+(n)d
//for(int n=1;n<=5;n++)
//System.out.printf("%d", 1+(n-1)*5) �������� ����

//���α׷����� �����׸��� �տ� �д�
